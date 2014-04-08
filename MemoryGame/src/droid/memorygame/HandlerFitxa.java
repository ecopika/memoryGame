package droid.memorygame;

import java.util.Random;

public class HandlerFitxa {

	private FitxaThread taulell[][];
	private int imatges[];
	private Random r;

	public HandlerFitxa(FitxaThread[][] taulell) {
		this.taulell = taulell;
		imatges = new int[8];
		r = new Random();
	}

	public void ompleTaulell() {
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				int imatge = (r.nextInt(9-0)+0);
				taulell[i][x] = new FitxaThread(imatges[imatge], i, x);
			}
		}
	}

}
