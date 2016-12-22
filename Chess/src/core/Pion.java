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
	public void deplacer(int i, int y, Terrain echiquier) {
		if(this.side.equals("White"))
		{

				if(y == this.colonne) // Avancer tout droit
				{
					if(this.ligne - i == 1 && echiquier.getContent(this.ligne - 1, this.colonne) == null)	// Avancer d'une case
					{
						echiquier.move(this.ligne, this.colonne, i, y, this); // Si bug, new Pion(..);
					}
					else if(this.ligne - i == 2 && echiquier.getContent(this.ligne - 2, y) == null && this.ligne == 6 && echiquier.getContent(i - 1, y) == null) // Avancer de deux cases si le pion se trouve sur la ligne de d�part
					{
						echiquier.move(this.ligne, this.colonne, i, y, this); // Idem si bug
					}
					else
					{
						System.out.println("D�placement impossible. Erreur: Une pi�ce bloque le d�placement ou bien les coordonn�es sont invalides");
					}
				}
				else if((y == this.colonne - 1 || y == this.colonne + 1) && i == this.ligne - 1 && (echiquier.getContent(i, y) instanceof Piece)) // D�placement diagonale pour "manger" une piece
				{
					echiquier.move(this.ligne, this.colonne, i, y, this);
				}
				else
				{
					System.out.println("D�placement impossible. Erreur: Il n'y a rien � manger sur cette position ou bien les coordonn�es sont invalides");
				}

		}
		else
		{
			// side == black
			if(y == this.colonne) // Avancer tout droit
			{
				if(i - this.ligne == 1 && echiquier.getContent(i + 1, y) == null)	// Avancer d'une case
				{
					echiquier.move(this.ligne, this.colonne, i, y, this); // Si bug, new Pion(..);
				}
				else if(i - this.ligne == 2 && echiquier.getContent(i + 2, y) == null && this.ligne == 1 && echiquier.getContent(i + 1, y) == null) // Avancer de deux cases si le pion se trouve sur la ligne de d�part
				{
					echiquier.move(this.ligne, this.colonne, i, y, this); // Idem si bug
				}
				else
				{
					System.out.println("D�placement impossible. Erreur: Une pi�ce bloque le d�placement ou bien les coordonn�es sont invalides");
				}
			}
			else if((y == this.colonne - 1 || y == this.colonne + 1) && i == this.ligne + 1 && (echiquier.getContent(i, y) instanceof Piece)) // D�placement diagonale pour "manger" une piece
			{
				echiquier.move(this.ligne, this.colonne, i, y, this);
			}
			else
			{
				System.out.println("D�placement impossible. Erreur: Il n'y a rien � manger sur cette position ou bien les coordonn�es sont invalides");
			}
			
			
		}
	}

	@Override
	protected void manger() {
		
	}

}
