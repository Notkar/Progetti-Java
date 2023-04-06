package net.codejava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Seleziona un'opzione:");
		System.out.println("1. Compila scheda medici.");
		System.out.println("2. Compila scheda pazienti.");
		System.out.println("0. Esci dal programma.");
		int num = s.nextInt();
		
		switch(num) {
		case 1: 
			Medici m = new Medici(3, 3);
			m.compilaMedici();
			m.stampaMedici();
			break;
		case 2:
			Pazienti p = new Pazienti(3,3);
			p.compilaPazienti();
			p.stampaPazienti();
			break;
		case 0:
			System.out.println("Grazie per aver usato il programma, Arrivederci!");
			break;
		}
	}
}
