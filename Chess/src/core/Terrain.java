package core;

public class Terrain {


	private Piece[][] grille;
	private String side, grilleToString;
	private int position, positionPion;
	
	public Terrain()
	{
		grille = new Piece[8][8];
		build();
		
	}
	
	private void build()
	{
		// INITIALISATIONS DES NOIRS
		side = "Black";
		position = 0;
		positionPion = 1;
		
		for(int k = 0; k < 2; k++)
		{
		// Initialisation des pions
		for(int i = 0; i < 8; i++)
		{
			grille[positionPion][i] = new Pion(positionPion, i, side);
		}
		
		// Initialisation des tours 
		grille[position][0] = new Tour(side);
		grille[position][7] = new Tour(side);
		
		// Initialisation des cavaliers
		grille[position][1] = new Cavalier(side);
		grille[position][6] = new Cavalier(side);
		
		// Initialisation des fous
		
		grille[position][2] = new Fou(side);
		grille[position][5] = new Fou(side);
		
		// Initialisation de la reine
		grille[position][3] = new Reine(side);
		
		// Initialisation du roi
		grille[position][4] = new Roi(side);
		
		// INITIALISATIONS DES BLANCS
		side = "White";
		position = 7;
		positionPion = 6;
		}
	}
	
	
	public String toString()
	{
		grilleToString = "";
		for(int i = 0; i < 8; i++)
		{
			for(int y = 0; y < 8; y++)
			{
				if(grille[i][y] instanceof Piece)
				{
					grilleToString += (grille[i][y].getForme() + " ");
				}
				else
				{
					grilleToString += "X ";
				}
			}
			grilleToString += "\n";
		}
		return grilleToString;
	}
	
	public void move(int ligneClear, int colonneClear, int ligneNew, int colonneNew, Piece piece)
	{
	
		grille[ligneClear][colonneClear] = null;
		grille[ligneNew][colonneNew] = piece;
	}
	
	public Piece[][] getGrille()
	{
		return grille;
	}
	
	public void setGrille(Piece[][] grille)
	{
		this.grille = grille;
	}
	
	public Object getContent(int i, int y)
	{
		return grille[i][y];
	}
}
