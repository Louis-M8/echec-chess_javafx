package echec_chess_client.afficheurs;

import commun.debogage.J;

import commun.modeles.Modele;
import commun_client.mvc.Afficheur;
import echec_chess.modeles.partie_locale.PartieLocaleLectureSeule;
import echec_chess_client.vues.VuePartieLocale;

public abstract class AfficheurPartieLocale<V extends VuePartieLocale>

		extends Afficheur<PartieLocaleLectureSeule, V> {

	
}
