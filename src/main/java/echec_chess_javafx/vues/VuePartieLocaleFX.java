package echec_chess_javafx.vues;



import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import echec_chess_client.vues.VuePartieLocale;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;





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
		// TODO Auto-generated method stub
		
	}
	
	

	
	

	


}
 