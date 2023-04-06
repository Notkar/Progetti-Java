package net.codejava;

import java.util.Scanner;

public class Medici {
	Scanner s = new Scanner(System.in);
	
	private String[][] info;
	
	public Medici(int nrighe, int ncolonne) {
		info = new String[nrighe][ncolonne];
	}
	//Metodo per riempire l'array bidimensionale da input
	public void compilaMedici() {	
		int i, j;
		for(i = 0; i < info.length; i++) {
			for(j = 0; j < info[i].length; j++) {
				System.out.println("Inserisci dato in riga " + (i+1) + " e in colonna " + (j+1) + " : ");
				info[i][j] = s.nextLine();
			}
		}
	}
	//Metodo per stampare l'array bidimensionale
	public void stampaMedici() {
		int i, j;
		for(i = 0; i < info.length; i++) {
			for(j = 0; j < info[i].length; j++) {
				System.out.print(info[i][j] + " ");
			}
			System.out.println();
		}
	}	
}
	
	
