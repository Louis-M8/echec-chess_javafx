package echec_chess_javafx.controleurs;

import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import echec_chess.modeles.difficultes.Parametres;
import echec_chess.modeles.partie_locale.PartieLocale;
import echec_chess_client.controleurs.ControleurAccueil;
import echec_chess_javafx.afficheurs.AfficheurParametresFX;
import echec_chess_javafx.afficheurs.AfficheurPartieLocaleFX;
import echec_chess_javafx.vues.VueAccueilFX;
import echec_chess_javafx.vues.VueParametresFX;
import echec_chess_javafx.vues.VuePartieLocaleFX;

public class ControleurAccueilFX extends ControleurAccueil<VueAccueilFX> {
	
	private Parametres para;
	private PartieLocale partie;


	protected void instancierMVCParametres() {
		J.appel(this);

		para = new Parametres();

		VueParametresFX vuePara = (VueParametresFX) vue.creerVueParametres();

		AfficheurParametresFX afficheur = new AfficheurParametresFX();

		FabriqueControleur.creerControleur(ControleursParametresFX.class, para, vuePara, afficheur);
		
	}



	@Override
	protected void nouvellePartieLocale() {
		J.appel(this);
		
		VuePartieLocaleFX vuePartie = (VuePartieLocaleFX) vue.creerVuePartieLocale();
		
		partie = new PartieLocale();
		
		AfficheurPartieLocaleFX afficheur = new AfficheurPartieLocaleFX();
		
		
	}

}
