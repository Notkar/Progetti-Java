package net.codejava;

public class Main {

	public static void main(String[] args) {
		Studente s1 = new Studente("Mario", "Rossi", 5.5);
		Studente s2 = new Studente("Giuseppe", "Verdi", 8);
		Studente s3 = new Studente("Letizia", "Neri", 5.5);
		Studente s4 = new Studente("Giacomo", "Leopardi", 6.5);
		Studente s5 = new Studente("Alessandro", "Manzoni", 7.5);
		
		Classe c = new Classe();
		
		c.aggiungiStudente(s1);
		c.aggiungiStudente(s2);
		c.aggiungiStudente(s3);
		c.aggiungiStudente(s4);
		c.aggiungiStudente(s5);
		
		c.getNumeroStudenti(5);
		
		System.out.print("Gli studenti presenti sono: " + "\n" + s1.getNome() + " " + s1.getCognome() + ", con una media di: " + s1.getMediaVoti() + "\n" + s2.getNome() + " "+ s2.getCognome() + ", con una media di: " + s2.getMediaVoti() + "\n" + s3.getNome() + " " + s3.getCognome() + ", con una media di: " + s3.getMediaVoti() + "\n" + s4.getNome() + " " + s4.getCognome() + ", con una media di: " + s4.getMediaVoti() + "\n" + s5.getNome() + " " + s5.getCognome() + ", con una media di: " + s5.getMediaVoti());
		System.out.println("\n" + "La media dei voti della classe e': " + c.getMediaVotiClasse() + "\n" + "Il numero dei promossi e': " + c.getNumeroPromossi());
	}

}
