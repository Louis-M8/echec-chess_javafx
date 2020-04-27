package echec_chess_client.afficheurs;

import commun.debogage.J;

import commun.modeles.Modele;
import commun_client.mvc.Afficheur;
import echec_chess.modeles.partie_locale.PartieLocaleLectureSeule;
import echec_chess_client.vues.VuePartieLocale;

public abstract class AfficheurPartieLocale<V extends VuePartieLocale>

		extends Afficheur<PartieLocaleLectureSeule, V> {

	@Override
	public void initialiserAffichage(PartieLocaleLectureSeule partieLectureSeule, VuePartieLocale vue) {
		J.appel(this);
		
		vue.afficherPion(partieLectureSeule.getPositionPion());
		
	}

	@Override
	public void rafraichirAffichage(PartieLocaleLectureSeule partieLectureSeule, VuePartieLocale vue) {
		J.appel(this);
		
		// TODO: appeler le modele pour récupérer l'info à afficher

		// TODO: appeler la vue pour afficher cette info

		vue.afficherPion(partieLectureSeule.getPositionPion());
	}
}
