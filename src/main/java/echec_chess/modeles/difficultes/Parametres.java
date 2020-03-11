package echec_chess.modeles.difficultes;

import java.util.Random;

import commun.debogage.J;


import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {

	Random rand = new Random();
	int upperbound = 4;
	
	private int difficile = rand.nextInt(upperbound);
	

	
	private int difficulteCourante = difficile;
	
	@Override
	public int getDifficulte() {
		
		J.appel(this);
		
		return difficulteCourante;
		
		
	}
	
}
