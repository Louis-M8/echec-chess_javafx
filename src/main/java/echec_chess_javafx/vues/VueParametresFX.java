package echec_chess_javafx.vues;

import java.net.URL;

import java.util.ResourceBundle;



import commun.debogage.DoitEtre;
import commun.debogage.J;
import echec_chess_client.vues.VueParametres;
import echec_chess_javafx.vues.composantes.MonBouton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public   class VueParametresFX implements VueParametres, Initializable {

	
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
		
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}


}
 