package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
		
	private List<String> parole;
	
	public Parole() {
		parole = new ArrayList<>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		
		Collections.sort(parole);
		
		return parole;
	}
	
	public void reset() {
		parole.clear();
	}

}
