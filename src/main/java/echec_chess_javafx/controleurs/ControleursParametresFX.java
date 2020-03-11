package echec_chess_javafx.controleurs;

import commun.debogage.J;
import echec_chess_client.controleurs.ControleurParametres;
import echec_chess_javafx.afficheurs.AfficheurParametresFX;
import echec_chess_javafx.vues.VueParametresFX;

public  class ControleursParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX>{

	@Override
	public void demarrer() {
		J.appel(this);
		
	}

	@Override
	public void installerReceptionCommandes() {
		// TODO Auto-generated method stub
		
	}

	
	
}
