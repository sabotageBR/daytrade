package com.daytrade.service.papel;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.daytrade.dao.AbstractDAO;
import com.daytrade.dao.papel.PapelDAO;
import com.daytrade.entity.Papel;
import com.daytrade.service.AbstractService;

@Stateless
public class PapelService extends AbstractService<Papel> {

	private @Inject PapelDAO papelDAO;
	
	@Override
	public AbstractDAO<Papel> getDAO() {
		return papelDAO;
	}
	
	public List<Papel> listarAtivas(){
		return papelDAO.listarAtivas();
	}

}
