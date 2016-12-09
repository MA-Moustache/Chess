package core;

public abstract class Piece {

		protected String forme, side;
		protected int ligne, colonne;
		
		protected abstract void mourir();
		protected abstract void deplacer(int i, int y);
		protected abstract void manger();

		public String getForme() {
			
			return this.forme;
		}

}
