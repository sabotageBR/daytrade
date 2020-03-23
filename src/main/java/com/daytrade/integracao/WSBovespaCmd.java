package com.daytrade.integracao;

import java.io.InputStream;
import java.net.CookieHandler;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

@Singleton
public class WSBovespaCmd {

	private JAXBContext jc = null;

	@PostConstruct
	private void init() {
		try {
			CookieHandler.setDefault(new java.net.CookieManager(null, CookiePolicy.ACCEPT_ALL));
			jc = JAXBContext.newInstance("com.daytrade.integracao");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ComportamentoPapeis consultarCotacoes(String cotas) throws Exception {
		try {
			ComportamentoPapeis retorno = null;
			URL url = new URL("http://bvmf.bmfbovespa.com.br/cotacoes2000/FormConsultaCotacoes.asp?strListaCodigos="+cotas);
			HttpURLConnection http = (HttpURLConnection) url.openConnection(); 
			http.addRequestProperty("User-Agent", "Mozilla/4.76"); 
			InputStream is = http.getInputStream();
			Unmarshaller jaxbUnmarshaller = jc.createUnmarshaller();
			retorno = (ComportamentoPapeis) jaxbUnmarshaller.unmarshal(is);
			return retorno;
		}catch(Exception e) {
			System.out.println("Cotação indisponivel no momento: "+cotas);
			return null;
		}	
	}
	


}
