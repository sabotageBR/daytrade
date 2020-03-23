package com.daytrade.controller.papel;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.daytrade.controller.AbstractController;
import com.daytrade.service.papel.PapelService;
import com.daytrade.to.PapelTO;

public class PapelController extends AbstractController<PapelTO> {

	private @Inject PapelService papelService;
	
	@PostConstruct
	private void init() {
		getTo().setPapeis(papelService.listar());
	}
	
}
