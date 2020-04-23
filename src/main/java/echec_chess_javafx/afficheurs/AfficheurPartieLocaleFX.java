package echec_chess_javafx.afficheurs;

import commun.debogage.J;


import echec_chess.modeles.partie_locale.PartieLocaleLectureSeule;
import echec_chess_client.afficheurs.AfficheurPartieLocale;
import echec_chess_javafx.vues.VuePartieLocaleFX;

public  class AfficheurPartieLocaleFX extends AfficheurPartieLocale<VuePartieLocaleFX> {

	@Override
	public void initialiserAffichage(PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue) {
		J.appel(this);

	}

	@Override
	public void rafraichirAffichage(PartieLocaleLectureSeule modeleLectureSeule, VuePartieLocaleFX vue) {
		J.appel(this);

	}


}
