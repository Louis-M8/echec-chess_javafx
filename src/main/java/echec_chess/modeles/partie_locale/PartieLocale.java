package echec_chess.modeles.partie_locale;

import java.util.ArrayList;

import java.util.List;

import commun.debogage.J;
import commun.modeles.Modele;

public class PartieLocale extends Modele<PartieLocaleLectureSeule> implements PartieLocaleLectureSeule {
	
	// TODO: stoquer de l'information sur la partie
	private int positionPion = 0;

	public void jouerCoup(int caseDepartColonne, int caseDepartRangee, int caseDestinationColonne,
			int caseDestinationRangee) {
		
		J.appel(this);
		
		if(caseDepartColonne == 0) {
			
			positionPion = 1;
			

		}else if(caseDepartColonne == 1 ) {
			
			positionPion = 2;

		}else if(caseDepartColonne == 2) {

			positionPion = 3;
		
		}else if(caseDepartColonne == 3 ) {
			
			positionPion = 4;

		}else if(caseDepartColonne == 4) {

			positionPion = 5;
		}else if(caseDepartColonne == 5 ) {
			
			positionPion = 6;

		}else if(caseDepartColonne == 6) {

			positionPion = 7;
			}
		else if(caseDepartColonne == 7 ) {
			
			positionPion = 8;

		}else if(caseDepartColonne == 8) {

			positionPion = 9;
			}
	}

	@Override
	public int getPositionPion() {
		J.appel(this);
		
		return positionPion;
	}

}
