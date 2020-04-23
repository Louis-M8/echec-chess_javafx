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
import echec_chess_client.commandes.jouer_coup.JouerCoup;
import echec_chess_client.commandes.jouer_coup.JouerCoupPourEnvoi;
import echec_chess_javafx.vues.VuePartieLocaleFX;



public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	@FXML
	private Text texteTmpPartieLocale, texteNombreCoups;

	@FXML
	private Button boutonJouerCoup;

	private JouerCoupPourEnvoi jouerCoup;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(texteTmpPartieLocale);
		DoitEtre.nonNul(texteNombreCoups);

		// Nouvelle vue?
		texteTmpPartieLocale.setText(texteTmpPartieLocale.getText() + " (" + System.identityHashCode(this) + ")");
		
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		jouerCoup = FabriqueCommande.obtenirCommandePourEnvoi(JouerCoup.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		boutonJouerCoup.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setInfoCoup(extraireInfoCoup());

				jouerCoup.envoyerCommande();
			}
		});
		
	}
	
	private int extraireInfoCoup() {
		J.appel(this);

		return (new Random()).nextInt(3);
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
		
	}
	
	@Override
	public void afficherNombreCoups(int nombreCoups) {
		J.appel(this);

		texteNombreCoups.setText(String.valueOf(nombreCoups));
	}


	


}
 