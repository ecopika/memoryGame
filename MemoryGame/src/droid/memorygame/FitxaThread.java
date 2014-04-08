package droid.memorygame;


public class FitxaThread extends Thread{

	private int imatge;
	private int posX;
	private int posY;
	private boolean seleccionat;
	private boolean girat;

	public FitxaThread(int img, int posX, int posY) {
		this.imatge = img;
		this.posX = posX;
		this.posY = posY;
		seleccionat = false;
	}
	
	public int getImatge(){
		return imatge; 
	}
	
	public int posX(){
		return posX;
	}
	
	public int posY(){
		return posY;
	}
	
	

	public void run() {
			if (!girat && !seleccionat) {
				seleccionat = true;
			}
		
			 
	}

}
