package echec_chess_javafx;



import commun.debogage.DoitEtre;


import commun.debogage.J;
import commun_client.mvc.controleurs.FabriqueControleur;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
import echec_chess.modeles.difficultes.Parametres;
import echec_chess_javafx.afficheurs.AfficheurParametresFX;
import echec_chess_javafx.controleurs.ControleurAccueilFX;
import echec_chess_javafx.controleurs.ControleursParametresFX;
import echec_chess_javafx.vues.VueAccueilFX;
import echec_chess_javafx.vues.VueParametresFX;

import static echec_chess_javafx.Constantes.*;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{
	
	static {
		
		J.appel(Principal.class);
		Initialisateur.initialiser();
		
		}
	
	public static void main(String[] args){
		
			
			J.appel(Principal.class);
			launch(args);
			
			}
	
	@Override
	public void start(Stage fenetrePrincipale) throws Exception{
		J.appel(this);
		
		Scene scene = creerScenePrincipale();
		
		setLargeurFenetre(fenetrePrincipale);
        setHauteurFenetre(fenetrePrincipale);
		
		fenetrePrincipale.setScene(scene);
		
		fenetrePrincipale.show();
	}
	
	

    private void setHauteurFenetre(Stage fenetrePrincipale) {
        J.appel(this);

        fenetrePrincipale.setHeight(HAUTEUR_FENETRE);
        fenetrePrincipale.setMinHeight(HAUTEUR_FENETRE_MIN);
    }

    private void setLargeurFenetre(Stage fenetrePrincipale) {
        J.appel(this);

        fenetrePrincipale.setWidth(LARGEUR_FENETRE);
        fenetrePrincipale.setMinWidth(LARGEUR_FENETRE_MIN);
    }
	
	private Scene creerScenePrincipale() {
		J.appel(this);
		
		ChargeurDeVue <VueAccueilFX>chargeur;
		chargeur = new ChargeurDeVue<VueAccueilFX>(CHEMIN_ACCUEIL_FXML,
				CHEMIN_CHAINES,
				CHEMIN_ACCUEIL_CSS);
		
		VueAccueilFX vue = chargeur.getVue();
		
		DoitEtre.nonNul(vue);
		
		
		FabriqueControleur.creerControleur(ControleurAccueilFX.class, vue);
		
		
		Scene scene = chargeur.nouvelleScene(LARGEUR_SCENE, HAUTEUR_SCENE);

        DoitEtre.nonNul(scene);

        return scene;
		
		
	}
	
	@Override
	public void stop() {
		J.appel(this);
	}
}