package core;

public class Jeu {

	Terrain echiquier;

	
	public Jeu()
	{
		echiquier = new Terrain();
		System.out.println(echiquier.toString() + "\n");
	}
	
	public void deplacer(int i, int y, int nextI, int nextY)
	{
		echiquier.getGrille()[i][y].deplacer(nextI, nextY);
		System.out.println(echiquier.toString());
	}
	
	
}
