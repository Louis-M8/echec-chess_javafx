package echec_chess_javafx.vues;

import static echec_chess_javafx.Constantes.CHEMIN_CHAINES;
import static echec_chess_javafx.Constantes.CHEMIN_PARTIE_LOCALE_CSS;
import static echec_chess_javafx.Constantes.CHEMIN_PARTIE_LOCALE_FXML;

import java.net.URL;








import java.util.ResourceBundle;



import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import echec_chess_client.vues.VueParametres;
import echec_chess_javafx.vues.composantes.MonBouton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import echec_chess_javafx.vues.VueParametresFX;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartie;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import echec_chess_client.commandes.quitter.Quitter;
import echec_chess_client.commandes.quitter.QuitterPourEnvoi;



public class VueParametresFX implements VueParametres, Initializable {

	@FXML
	MenuItem menuNouvellePartie ,menuQuitter;
	
	@FXML
	VBox conteneurBoite;
	QuitterPourEnvoi quitterPourEnvoi;
	NouvellePartiePourEnvoi nouvellePartiePourEnvoi;
	@FXML
	MonBouton boutonFacile;
	
	@FXML
	MonBouton boutonMoyen;
	
	@FXML
	MonBouton boutonDifficile;
	
	@FXML
	MonBouton boutonMaitre;
	
	@Override
	public void initialize(URL location, ResourceBundle ressource) {
		J.appel(this);
		
		DoitEtre.nonNul(boutonFacile);
		DoitEtre.nonNul(boutonMoyen);
		DoitEtre.nonNul(boutonDifficile);
		DoitEtre.nonNul(boutonMaitre);
		
	}
	
	public void afficherDifficulte(int nombre){
		
		boutonFacile.getStyleClass().remove("Rouge");
		boutonMoyen.getStyleClass().remove("Bleu");
		boutonDifficile.getStyleClass().remove("Vert");
		boutonMaitre.getStyleClass().remove("Orange");
		switch (nombre) {
		case 0:
			
			boutonFacile.getStyleClass().add("Rouge");
			break;
       
		case 1:
			boutonMoyen.getStyleClass().add("Bleu");
			break;
			
		case 2:
			boutonDifficile.getStyleClass().add("Vert");
			break;
			
		case 3:
			boutonMaitre.getStyleClass().add("Orange");
			break;
		default:
			break;
		}
		
		
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		quitterPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(Quitter.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		
		menuQuitter.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				quitterPourEnvoi.envoyerCommande();
			}
		});
		
		
		
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}

	public VueParametresFX creerVuePartieLocale() {
		J.appel(this);

		ChargeurDeVue<VueParametresFX> chargeur = new ChargeurDeVue<VueParametresFX>(CHEMIN_PARTIE_LOCALE_FXML,
				CHEMIN_CHAINES, CHEMIN_PARTIE_LOCALE_CSS);

		VueParametresFX vuePara = chargeur.getVue();

		Parent parent = chargeur.getParent();

		conteneurBoite.getChildren().clear();
		conteneurBoite.getChildren().add(parent);

		return vuePara;
	}

	


}
 