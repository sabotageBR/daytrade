package com.daytrade.dao.papel;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.daytrade.dao.AbstractDAO;
import com.daytrade.entity.Papel;

public class PapelDAO extends AbstractDAO<Papel> {

	
	public List<Papel> listarAtivas(){
		CriteriaQuery<Papel> criteria = getCriteriaBuilder().createQuery(Papel.class);
		Root<Papel> root = criteria.from(Papel.class);
		return getManager().createQuery(criteria.select(root).where(getCriteriaBuilder().isNull(root.get("dataVenda")))
				.orderBy(getCriteriaBuilder().desc(root.get("porcentagem")))).getResultList();
	}
	
}
