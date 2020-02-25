package echec_chess_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import commun.debogage.J;
import echec_chess_client.vues.VueParametres;
import javafx.fxml.Initializable;

public  class VueParametresFX implements VueParametres, Initializable {

	@Override
	public void initialize(URL location, ResourceBundle ressource) {
		J.appel(this);
		
	}

}
 