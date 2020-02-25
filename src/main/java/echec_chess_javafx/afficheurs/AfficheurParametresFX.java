package echec_chess_javafx.afficheurs;

import commun.debogage.J;
import echec_chess.modeles.difficultes.ParametresLectureSeule;
import echec_chess_client.afficheurs.AfficheurParametres;
import echec_chess_javafx.vues.VueParametresFX;

public class AfficheurParametresFX extends AfficheurParametres<VueParametresFX> {

	@Override
	public void initialiserAffichage(ParametresLectureSeule modeleLectureSeule, VueParametresFX vue) {
		J.appel(this);
		
	}

}
