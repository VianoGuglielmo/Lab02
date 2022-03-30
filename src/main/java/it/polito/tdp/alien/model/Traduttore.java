package it.polito.tdp.alien.model;

import java.util.ArrayList;
import java.util.List;

public class Traduttore {
	private List<String> par;
	
	public Traduttore(){
		this.par = new ArrayList<String>();
	}
	
	public void add(String p) {
		par.add(p);
	}
	
}
