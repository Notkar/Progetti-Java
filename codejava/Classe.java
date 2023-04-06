package net.codejava;

import java.util.ArrayList;

public class Classe {
	private ArrayList<Studente> studenti;
	
	public Classe() {
		this.studenti = new ArrayList<>();
	}
	
    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }
    
    public void getNumeroStudenti(int numero) {
    	numero = studenti.size();
    	System.out.println("Il numero degli studenti presenti in classe e': " + numero);
    }
    
    public double getMediaVotiClasse() {
		double somma = 0;
		for(Studente i : studenti) {
			somma += i.getMediaVoti();
		}
		return somma/studenti.size();
    }
    
    public int getNumeroPromossi() {
    	int promossi = 0;
    	for(Studente i : studenti) {
    		if(i.isPromosso()) {
    			promossi++;
    		}
    	}
    	return promossi;
    }
}
