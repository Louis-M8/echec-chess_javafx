package echec_chess_javafx;



import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_javafx.ChargeurDeVue;
import commun_javafx.Initialisateur;
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
		
		ChargeurDeVue chargeur = new ChargeurDeVue(CHEMIN_PARTIE_LOCALE_FXML,
				CHEMIN_CHAINES,
				CHEMIN_PARTIE_LOCALE_CSS);
		
		
		Scene scene = chargeur.nouvelleScene(LARGEUR_SCENE, HAUTEUR_SCENE);

        DoitEtre.nonNul(scene);

        return scene;
		
		
	}
	
	@Override
	public void stop() {
		J.appel(this);
	}
}