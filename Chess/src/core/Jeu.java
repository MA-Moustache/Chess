package core;

import java.util.Scanner;

public class Jeu {

	Terrain echiquier;
	int ligneI, colonneI, ligneF, colonneF;
	Scanner scan = new Scanner(System.in);
	
	public Jeu()
	{
		// Création d'un nouveau terrain et affichage
		
		echiquier = new Terrain();
		System.out.println(echiquier.toString() + "\n");
		
		do
		{
			action();
		}while(true);
		
		
	}
	
	public void deplacer(int i, int y, int nextI, int nextY)
	{
		echiquier.getGrille()[i][y].deplacer(nextI, nextY, echiquier);
		System.out.println(echiquier.toString());
	}
	
	public void action()
	{
		System.out.print("Ligne de la pièce à bouger: ");
		ligneI = scan.nextInt();
		System.out.print("Colonne de la pièce à bouger: ");
		colonneI = scan.nextInt();
		System.out.print("Ligne de la ligne ou diriger la pièce: ");
		ligneF = scan.nextInt();
		System.out.print("Colonne de la ligne ou diriger la pièce: ");
		colonneF = scan.nextInt();
		
		deplacer(ligneI, colonneI, ligneF, colonneF);
	}
	
}
