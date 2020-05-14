package echec_chess.modeles.difficultes;

import java.util.Random;



import commun.debogage.J;


import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {
	
	Random rand = new Random();
	int upperbound = 4;
	int upperRand = 3;
	
	private int difficile = rand.nextInt(upperbound);
    private int positionPion = rand.nextInt(upperRand);
	private int difficulteCourante = difficile;
	private int positionCourante = positionPion;
	
	@Override
	public int getDifficulte() {
		
		J.appel(this);
		
		return difficulteCourante;
		
		
	}

	@Override
	public int getPositionCourantePion() {
		J.appel(this);
		return positionCourante;
	}
	
	

	
	
}
