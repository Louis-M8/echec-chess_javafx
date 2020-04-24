package echec_chess_javafx.vues;

import java.net.URL;

import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import echec_chess_client.vues.VuePartieLocale;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	@FXML
	Text tmp;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(tmp);
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
	
	// TODO: implanter la méthode d'affichage


}
