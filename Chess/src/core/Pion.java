package core;

public class Pion extends Piece{

	public Pion(int ligne, int colonne, String side)
	{
		this.ligne = ligne;
		this.colonne = colonne;
		this.side = side;
		this.forme = "P";
	}
	
	@Override
	protected void mourir() {
		
	}

	@Override
	public void deplacer(int i, int y) {
		if(this.side.equals("White"))
		{
			if((this.ligne - i == 2 || this.ligne - i == 1) && this.colonne == y)
			{
				Terrain.move(this.ligne, this.colonne, i, y, new Pion(i, y, this.side));
			}
			else
			{
				System.out.println("Déplacement impossible");
			}
		}
		else
		{
			
		}
	}

	@Override
	protected void manger() {
		
	}

}
