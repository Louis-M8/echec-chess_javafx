package echec_chess_javafx.controleurs;


import commun.debogage.J;


import echec_chess_client.controleurs.ControleurPartieLocale;
import echec_chess_javafx.afficheurs.AfficheurPartieLocaleFX;
import echec_chess_javafx.vues.VuePartieLocaleFX;
import echec_chess_javafx.controleurs.ControleursPartieLocaleFX;


public  class ControleursPartieLocaleFX extends ControleurPartieLocale<VuePartieLocaleFX, AfficheurPartieLocaleFX>{

	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		
	}
	
}
