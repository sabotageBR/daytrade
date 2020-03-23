package com.daytrade.dao.papelhistorico;

import java.math.BigDecimal;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.daytrade.dao.AbstractDAO;
import com.daytrade.entity.Papel;
import com.daytrade.entity.PapelHistorico;

public class PapelHistoricoDAO extends AbstractDAO<PapelHistorico> {

	public BigDecimal maxPorcentagem(Papel papel) {
		CriteriaQuery<BigDecimal> criteria = getCriteriaBuilder().createQuery(BigDecimal.class);
		Root<PapelHistorico> root = criteria.from(PapelHistorico.class);
		criteria.select(getCriteriaBuilder().max(root.get("porcentagem")))
		.where(getCriteriaBuilder().equal(root.get("id"), papel.getId()));
		return getManager().createQuery(criteria).getSingleResult();
	}
	
	public BigDecimal minPorcentagem(Papel papel) {
		CriteriaQuery<BigDecimal> criteria = getCriteriaBuilder().createQuery(BigDecimal.class);
		Root<PapelHistorico> root = criteria.from(PapelHistorico.class);
		criteria.select(getCriteriaBuilder().min(root.get("porcentagem")))
			.where(getCriteriaBuilder().equal(root.get("id"), papel.getId()));
		return getManager().createQuery(criteria).getSingleResult();
	}
	
}
