package net.codejava;

public class Studente {
	private String nome;
	private String cognome;
	private double media;
	
	public Studente(String nome, String cognome, double media) {
		this.nome = nome;
		this.cognome = cognome;
		this.media = media;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public double getMediaVoti() {
		return media;
	}
	
	public void setMediaVoti(double media, int numero) {
		media = numero;
	}	
	
	public boolean isPromosso() {
		if(media >= 6) {
			return true;
		}
		else {
			return false;
		}
	}
}
