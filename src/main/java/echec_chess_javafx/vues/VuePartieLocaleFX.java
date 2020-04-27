package echec_chess_javafx.vues;

import java.net.URL;

import java.util.ResourceBundle;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import echec_chess_client.commandes.jouer_coup.JouerCoup;
import echec_chess_client.commandes.jouer_coup.JouerCoupPourEnvoi;
import echec_chess_client.vues.VuePartieLocale;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class VuePartieLocaleFX implements VuePartieLocale, Initializable {
	
	@FXML 
	private Button case01, case02, case03;
	private String textePion;
	
	private JouerCoupPourEnvoi jouerCoup;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(case01);
		DoitEtre.nonNul(case02);
		DoitEtre.nonNul(case03);
		
		// équivalent de %pion dans le xml
		textePion = resources.getString("pion");
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
		
		jouerCoup = FabriqueCommande.obtenirCommandePourEnvoi(JouerCoup.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		case01.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				jouerCoup.setCaseDepart(0, 0);
				jouerCoup.envoyerCommande();
			}
		});
		
		case02.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(1, 1);
				jouerCoup.envoyerCommande();
			}
		});
		
		case03.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(2, 2);
				jouerCoup.envoyerCommande();
			}
		});
	}

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

	@Override
	public void afficherPion(int positionPion) {
		J.appel(this);
		
		if(positionPion == 1) {
			
			case01.setText(textePion);
			case02.setText("");
			case03.setText("");

		}else if(positionPion == 2) {

			case01.setText("");
			case02.setText(textePion);
			case03.setText("");

		}else if(positionPion == 3) {

			case01.setText("");
			case02.setText("");
			case03.setText(textePion);
		}
	}
	
	// TODO: implanter la méthode d'affichage


}
