package echec_chess_client.controleurs;

import commun.debogage.J;
import commun.systeme.Systeme;
import commun_client.mvc.controleurs.ControleurVue;
import commun_client.mvc.controleurs.RecepteurCommandeMVC;
import echec_chess.modeles.difficultes.Parametres;
import echec_chess.modeles.partie_locale.PartieLocale;
import echec_chess_client.commandes.afficher_parametres.AfficherParametres;
import echec_chess_client.commandes.afficher_parametres.AfficherParametresRecue;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartie;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartieRecue;
import echec_chess_client.commandes.quitter.Quitter;
import echec_chess_client.commandes.quitter.QuitterRecue;
import echec_chess_client.vues.VueAccueil;

public abstract class ControleurAccueil<V extends VueAccueil> extends ControleurVue<V> {
	
	protected Parametres para;
	protected PartieLocale partie;


	@Override
	protected void demarrer() {
		J.appel(this);
		
	}

	private void afficherParametres() {
		J.appel(this);
		
		para = new Parametres();
		
		instancierMVCParametres();
	}

	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		
		installerRecepteurCommande(AfficherParametres.class, new RecepteurCommandeMVC<AfficherParametresRecue>() {
			@Override
			public void executerCommandeMVC(AfficherParametresRecue commande) {
				J.appel(this);
				
				afficherParametres();
			}
		});
		
		installerRecepteurCommande(NouvellePartie.class, new RecepteurCommandeMVC<NouvellePartieRecue>() {
			@Override
			public void executerCommandeMVC(NouvellePartieRecue commande) {
				J.appel(this);
				
				nouvellePartieLocale();
			}
		});
		
		installerRecepteurCommande(Quitter.class, new RecepteurCommandeMVC<QuitterRecue>() {
			@Override
			public void executerCommandeMVC(QuitterRecue commande) {
				J.appel(this);
				
				Systeme.quitter();
			}
		});
		
		
	}

	
	protected void nouvellePartieLocale() {
		
		partie = new PartieLocale();
		instancierMVCPartieLocale();
		
	}

	protected abstract void instancierMVCParametres();
	protected abstract void instancierMVCPartieLocale();
	


}
