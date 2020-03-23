package com.daytrade.to;

import java.util.ArrayList;
import java.util.List;

import com.daytrade.entity.Papel;

public class PapelTO {
	
	private Papel papel;
	private List<Papel> papeis;
	
	
	public Papel getPapel() {
		return papel;
	}
	public void setPapel(Papel papel) {
		this.papel = papel;
	}
	
	public List<Papel> getPapeis() {
		if (papeis == null) {
			papeis = new ArrayList<Papel>();
		}
		return papeis;
	}
	
	public void setPapeis(List<Papel> papeis) {
		this.papeis = papeis;
	}
	
	
	
	

}
