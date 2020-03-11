package echec_chess_javafx.vues;

import java.net.URL;

import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import echec_chess_client.vues.VueParametres;
import echec_chess_javafx.vues.composantes.MonBouton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public  class VueParametresFX implements VueParametres, Initializable {

	
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
		
		switch (nombre) {
		case 0:
			
			boutonFacile.setBackground(null);
			break;
       
		case 1:
			boutonMoyen.setBackground(Color.GREEN);
			break;
			
		case 2:
			boutonDifficile.setBackground(Color.BLUE);
			break;
			
		case 3:
			boutonMaitre.setBackground(Color.RED);
			break;
		default:
			break;
		}
		
		
	}


}
 