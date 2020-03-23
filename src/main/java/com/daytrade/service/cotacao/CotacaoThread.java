package com.daytrade.service.cotacao;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

import com.daytrade.entity.Papel;
import com.daytrade.enums.SituacaoPapelEnum;
import com.daytrade.integracao.ComportamentoPapeis;
import com.daytrade.integracao.WSBovespaCmd;
import com.daytrade.service.papel.PapelService;
import com.daytrade.service.papelhistorico.PapelHistoricoService;

@Named
@Stateless
public class CotacaoThread {

	private @Inject PapelService papelService;
	private @Inject PapelHistoricoService papelHistoricoService;
	private @Inject WSBovespaCmd wsBovespaCmd;

	@Schedule(info = "Thread-Cotacao", minute = "*", hour = "*", second = "*/10", persistent = false)
	public void cotacao(){
		
		Integer hora = getHoras(new Date());
		try {
//			if(hora >= 10 && hora <= 19) {
//				System.out.println(new Date() +" Cotação em execução...");
				List<Papel> papeis = papelService.listarAtivas();
				for(Papel papel:papeis) {
					ComportamentoPapeis comportamentoPapeis = wsBovespaCmd.consultarCotacoes(papel.getCodigo());
					if(comportamentoPapeis != null && comportamentoPapeis.getPapel() != null && comportamentoPapeis.getPapel().size() > 0) {
						com.daytrade.integracao.ComportamentoPapeis.Papel papelIt = comportamentoPapeis.getPapel().get(0);
						
						if(papel.getUltimo() == null) {
							papel.setUltimo(BigDecimal.ZERO);
						}
						
						if(papelIt.getUltimo() != null &&
								!papel.getUltimo().equals(papelIt.getUltimo())) {
							papel.setAbertura(papelIt.getAbertura());
							papel.setMinimo(papelIt.getMinimo());
							papel.setMaximo(papelIt.getMaximo());
							papel.setMedio(papelIt.getMedio());
							papel.setUltimo(papelIt.getUltimo());
							papel.setOscilacao(papelIt.getOscilacao());
							papel.setDataUltimaCotacao(new Date());
							papel.setValorTotalInvestido(papel.getValorCompra().multiply(BigDecimal.valueOf(papel.getQuantidade())));
							papel.setValorTotalVender(papel.getUltimo().multiply(BigDecimal.valueOf(papel.getQuantidade())));
							papel.setGanhoReais(papel.getUltimo().multiply(BigDecimal.valueOf(papel.getQuantidade()))
									.subtract(papel.getValorCompra().multiply(BigDecimal.valueOf(papel.getQuantidade()))));
							papel.setDiferenca(papel.getUltimo().subtract(papel.getValorCompra()));
							papel.setPorcentagem(papel.getUltimo().subtract(papel.getValorCompra()).multiply(BigDecimal.valueOf(100)).divide(papel.getValorCompra(),BigDecimal.ROUND_UP));
							papel.setMaxPorcentagem(papelHistoricoService.maxPorcentagem(papel));
							papel.setMinPorcentagem(papelHistoricoService.minPorcentagem(papel));
							comporSituacaoPapel(papel);
							papelService.alterar(papel);
						}	
					}
					
				}
//			`}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}	
		
	}
	
	private void comporSituacaoPapel(Papel papel) {
		if(papel.getPorcentagem().compareTo(BigDecimal.ZERO) == -1) {
			papel.setSituacao(SituacaoPapelEnum.NEGATIVO);
		}
		else if (papel.getPorcentagem().doubleValue() >= 0 && papel.getPorcentagem().doubleValue() < 5) {
			papel.setSituacao(SituacaoPapelEnum.LUCRO_BAIXO);
		}
		else if (papel.getPorcentagem().doubleValue() >= 5 && papel.getPorcentagem().doubleValue() < 10) {
			papel.setSituacao(SituacaoPapelEnum.LUCRO_BAIXO);
		}
		else if (papel.getPorcentagem().doubleValue() >= 10 && papel.getPorcentagem().doubleValue() < 13) {
			papel.setSituacao(SituacaoPapelEnum.LUCRO_QUASE_BOM);
		}
		else if (papel.getPorcentagem().doubleValue() >= 13 && papel.getPorcentagem().doubleValue() < 20) {
			papel.setSituacao(SituacaoPapelEnum.LUCRO_BOM);
		}
		else if (papel.getPorcentagem().doubleValue() >= 20 && papel.getPorcentagem().doubleValue() < 50) {
			papel.setSituacao(SituacaoPapelEnum.LUCRO_OTIMO);
		}
		else if (papel.getPorcentagem().doubleValue() >= 50) {
			papel.setSituacao(SituacaoPapelEnum.EXPETACULAR);
		}
	}
	
	public  int getHoras(Date data) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTimeZone(TimeZone.getTimeZone("GMT-2"));
		calendario.setTime(data);
		return calendario.get(Calendar.HOUR_OF_DAY);
	}
	
	public static void main(String[] args) {
		BigDecimal n1 = new BigDecimal(-20);
		BigDecimal n2 = new BigDecimal(0);
		System.out.println(n1.compareTo(n2));
	}
	
}