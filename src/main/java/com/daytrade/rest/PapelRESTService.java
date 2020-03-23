package com.daytrade.rest;


import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.daytrade.entity.Papel;
import com.daytrade.service.papel.PapelService;


@javax.ws.rs.Path(value="/papel")
@javax.enterprise.context.RequestScoped
public class PapelRESTService {
	
	
	private @Inject PapelService papelService;
	
	@GET
	@Path("/listar")
	@Consumes(APPLICATION_JSON)
	@Produces(APPLICATION_JSON)
	public Response listar(){
		List<Papel> papeis = papelService.listarAtivas();
		return Response.ok().entity(papeis).build();
	}
	
}