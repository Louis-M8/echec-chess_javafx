package echec_chess.modeles.difficultes;

import commun.debogage.J;

import commun.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {

	
	
	private int difficile = 2;
	

	
	private int difficulteCourante = difficile;
	
	@Override
	public int getDifficulte() {
		
		J.appel(this);
		
		return difficulteCourante;
		
		
	}
	
}
