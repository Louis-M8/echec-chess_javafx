package echec_chess_javafx.vues;



import java.net.URL;
import java.util.ResourceBundle;
import commun.debogage.J;
import echec_chess_client.vues.VuePartieLocale;
import javafx.fxml.Initializable;
import echec_chess_javafx.vues.VuePartieLocaleFX;



public class VuePartieLocaleFX implements VuePartieLocale, Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
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
 