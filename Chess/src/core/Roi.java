package core;

public class Roi extends Piece {
	
	public Roi(String side)
	{
		this.side = side;
		this.forme = "K";
	}
	
	
	public void isCheck()
	{
		
	}

	@Override
	protected void mourir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void deplacer(int i, int y, Terrain echiquier) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void manger() {
		
	}
}
