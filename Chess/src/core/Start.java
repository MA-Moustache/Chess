package core;

import java.util.Scanner;

public class Start {
	
	public static void main(String[] args)
	{
		int ligneI, colonneI, ligneF, colonneF;
		Scanner scan = new Scanner(System.in);
		Jeu chess = new Jeu();
		
		System.out.print("Ligne de la pi�ce � bouger: ");
		ligneI = scan.nextInt();
		System.out.print("Colonne de la pi�ce � bouger: ");
		colonneI = scan.nextInt();
		System.out.print("Ligne de la ligne ou diriger la pi�ce: ");
		ligneF = scan.nextInt();
		System.out.print("Colonne de la ligne ou diriger la pi�ce: ");
		colonneF = scan.nextInt();

		
		chess.deplacer(ligneI, colonneI, ligneF, colonneF);
		
	}
}
