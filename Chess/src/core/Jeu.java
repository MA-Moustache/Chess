package core;

import java.util.Scanner;

public class Jeu {

	Terrain echiquier;
	int ligneI, colonneI, ligneF, colonneF;
	Scanner scan = new Scanner(System.in);
	
	public Jeu()
	{
		// Cr�ation d'un nouveau terrain et affichage
		
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
		System.out.print("Ligne de la pi�ce � bouger: ");
		ligneI = scan.nextInt();
		System.out.print("Colonne de la pi�ce � bouger: ");
		colonneI = scan.nextInt();
		System.out.print("Ligne de la ligne ou diriger la pi�ce: ");
		ligneF = scan.nextInt();
		System.out.print("Colonne de la ligne ou diriger la pi�ce: ");
		colonneF = scan.nextInt();
		
		deplacer(ligneI, colonneI, ligneF, colonneF);
	}
	
}
