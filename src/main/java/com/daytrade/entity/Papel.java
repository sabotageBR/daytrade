package com.daytrade.entity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.ocpsoft.prettytime.PrettyTime;

import com.daytrade.enums.SituacaoPapelEnum;

@Audited
@Entity
@Table(name = "dt_papel", schema = "public")
@AuditTable(value="dt_papel_historico") 
@XmlRootElement
public class Papel implements java.io.Serializable {

	private static final long serialVersionUID = -3714699261681620589L;
	
	@Id
	@SequenceGenerator(name="PAPEL_ID_GENERATOR", sequenceName="dt_papel_id_seq", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PAPEL_ID_GENERATOR") 
	private Integer id;
 	
	private String nome;
	
	private String codigo;

	@Column(name="valor_compra")
	private BigDecimal valorCompra;
	
	@Column(name="valor_venda")
	private BigDecimal valorVenda;
	
	private Integer quantidade;
	
	@Column(name="data_compra")
	private Date dataCompra;
	
	@Column(name="data_venda")
	private Date dataVenda;
	
	@Column(name="data_ultima_cotacao")
	private Date dataUltimaCotacao;
	
    private BigDecimal abertura;
    
    private BigDecimal minimo;
    
    private BigDecimal maximo;
    
    private BigDecimal medio;
    
    private BigDecimal ultimo;
    
    private BigDecimal oscilacao;
    
    @Column(name="valor_total_investido")
    private BigDecimal valorTotalInvestido;
    
    @Column(name="valor_total_a_vender")
    private BigDecimal valorTotalVender;

    @Column(name="ganho_reais")
    private BigDecimal ganhoReais;

    @Column(name="diferenca")
    private BigDecimal diferenca;

    @Column(name="porcentagem")
    private BigDecimal porcentagem;
    
    @Column(name="situacao")
    private SituacaoPapelEnum situacao;
    
    @Column(name="max_porcentagem")
    private BigDecimal maxPorcentagem;
    
    @Column(name="min_porcentagem")
    private BigDecimal minPorcentagem;
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public BigDecimal getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(BigDecimal valorCompra) {
		this.valorCompra = valorCompra;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Date getDataUltimaCotacao() {
		return dataUltimaCotacao;
	}

	@Transient
	public String getDataUltimaCotacaoFormat() {
		if(getDataUltimaCotacao() != null) {
			PrettyTime p = new PrettyTime(new Locale("pt"));
			return p.format(new Date(getDataUltimaCotacao().getTime()));
		}
		return "";
	}

	public void setDataUltimaCotacao(Date dataUltimaCotacao) {
		this.dataUltimaCotacao = dataUltimaCotacao;
	}

	public BigDecimal getAbertura() {
		return abertura;
	}

	public void setAbertura(BigDecimal abertura) {
		this.abertura = abertura;
	}

	public BigDecimal getMinimo() {
		return minimo;
	}

	public void setMinimo(BigDecimal minimo) {
		this.minimo = minimo;
	}

	public BigDecimal getMaximo() {
		return maximo;
	}

	public void setMaximo(BigDecimal maximo) {
		this.maximo = maximo;
	}

	public BigDecimal getMedio() {
		return medio;
	}

	public void setMedio(BigDecimal medio) {
		this.medio = medio;
	}

	public BigDecimal getUltimo() {
		return ultimo;
	}

	public void setUltimo(BigDecimal ultimo) {
		this.ultimo = ultimo;
	}

	public BigDecimal getOscilacao() {
		return oscilacao;
	}

	public void setOscilacao(BigDecimal oscilacao) {
		this.oscilacao = oscilacao;
	}

	public BigDecimal getValorTotalInvestido() {
		return valorTotalInvestido;
	}

	public void setValorTotalInvestido(BigDecimal valorTotalInvestido) {
		this.valorTotalInvestido = valorTotalInvestido;
	}

	public BigDecimal getValorTotalVender() {
		return valorTotalVender;
	}

	public void setValorTotalVender(BigDecimal valorTotalVender) {
		this.valorTotalVender = valorTotalVender;
	}

	public BigDecimal getGanhoReais() {
		return ganhoReais;
	}

	public void setGanhoReais(BigDecimal ganhoReais) {
		this.ganhoReais = ganhoReais;
	}

	public BigDecimal getDiferenca() {
		return diferenca;
	}

	public void setDiferenca(BigDecimal diferenca) {
		this.diferenca = diferenca;
	}

	public BigDecimal getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(BigDecimal porcentagem) {
		this.porcentagem = porcentagem;
	}

	public SituacaoPapelEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoPapelEnum situacao) {
		this.situacao = situacao;
	}

	public BigDecimal getMaxPorcentagem() {
		return maxPorcentagem;
	}

	public void setMaxPorcentagem(BigDecimal maxPorcentagem) {
		this.maxPorcentagem = maxPorcentagem;
	}

	public BigDecimal getMinPorcentagem() {
		return minPorcentagem;
	}

	public void setMinPorcentagem(BigDecimal minPorcentagem) {
		this.minPorcentagem = minPorcentagem;
	}
	
}
