package com.daytrade.service.papelhistorico;

import java.math.BigDecimal;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.daytrade.dao.AbstractDAO;
import com.daytrade.dao.papelhistorico.PapelHistoricoDAO;
import com.daytrade.entity.Papel;
import com.daytrade.entity.PapelHistorico;
import com.daytrade.service.AbstractService;

@Stateless
public class PapelHistoricoService extends AbstractService<PapelHistorico> {

	private @Inject PapelHistoricoDAO papelHistoricoDAO;
	
	@Override
	public AbstractDAO<PapelHistorico> getDAO() {
		return papelHistoricoDAO;
	}
	
	
	public BigDecimal maxPorcentagem(Papel papel) {
		return papelHistoricoDAO.maxPorcentagem(papel);
	}
	
	
	public BigDecimal minPorcentagem(Papel papel) {
		return papelHistoricoDAO.minPorcentagem(papel);
	}
	

}
