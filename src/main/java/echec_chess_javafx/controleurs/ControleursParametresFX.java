package echec_chess_javafx.controleurs;


import commun.debogage.J;
import echec_chess_client.controleurs.ControleurParametres;
import echec_chess_javafx.afficheurs.AfficheurParametresFX;
import echec_chess_javafx.vues.VueParametresFX;
import echec_chess_javafx.controleurs.ControleursParametresFX;

public  class ControleursParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX>{

	@Override
	protected void demarrer() {
		    J.appel(this);
		
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
	}


	
	
}
