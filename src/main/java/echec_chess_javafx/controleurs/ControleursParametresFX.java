package echec_chess_javafx.controleurs;




import commun.debogage.J;



import commun.systeme.Systeme;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import echec_chess_client.controleurs.ControleurParametres;
import echec_chess_javafx.afficheurs.AfficheurParametresFX;
import echec_chess_javafx.vues.VueParametresFX;
import echec_chess_javafx.controleurs.ControleursParametresFX;
import echec_chess.modeles.difficultes.Parametres;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartie;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartieRecue;
import echec_chess_client.commandes.quitter.Quitter;
import echec_chess_client.commandes.quitter.QuitterRecue;

public  class ControleursParametresFX extends ControleurParametres<VueParametresFX, AfficheurParametresFX>{
	private Parametres para = new Parametres();
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(Quitter.class, new RecepteurCommandeMVC<QuitterRecue>() {
			@Override
			public void executerCommandeMVC(QuitterRecue commande) {
				J.appel(this);

				Systeme.quitter();
			}
		});
		
		installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
			@Override
			public void executerCommandeMVC(NouvellePartieRecue commande) {
				J.appel(this);

				nouvellePageParametres();
			}
       });
		
	}

	@Override
	protected void demarrer() {
		    J.appel(this);
		    instancierMVCParametres();
		
		
	}
	private void nouvellePageParametres() {
		J.appel(this);

		para = new Parametres();
		instancierMVCParametres();
		
	}

	private void instancierMVCParametres() {
		J.appel(this);

		VueParametresFX vuePara = vue.creerVuePartieLocale();

		AfficheurParametresFX afficheur = new AfficheurParametresFX();

		FabriqueControleur.creerControleur(ControleursParametresFX.class, para, vuePara, afficheur);
		
	}


	
	
}
