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
	private Button case01, case02, case03, case04, case05, case06, case07, case08, case09;
	private String textePion;
	
	private JouerCoupPourEnvoi jouerCoup;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(case01);
		DoitEtre.nonNul(case02);
		DoitEtre.nonNul(case03);
		DoitEtre.nonNul(case04);
		DoitEtre.nonNul(case05);
		DoitEtre.nonNul(case06);
		DoitEtre.nonNul(case07);
		DoitEtre.nonNul(case08);
		DoitEtre.nonNul(case09);
		
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
		
		case04.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(3, 3);
				jouerCoup.envoyerCommande();
			}
		});
		
		case05.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(4, 4);
				jouerCoup.envoyerCommande();
			}
		});
		
		case06.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(5, 5);
				jouerCoup.envoyerCommande();
			}
		});
		
		case07.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(6, 6);
				jouerCoup.envoyerCommande();
			}
		});
		case08.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(7, 7);
				jouerCoup.envoyerCommande();
			}
		});
		case09.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);

				jouerCoup.setCaseDepart(8, 8);
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
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText("");

		}else if(positionPion == 2) {

			case01.setText("");
			case02.setText(textePion);
			case03.setText("");
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText("");
		}else if(positionPion == 3) {

			case01.setText("");
			case02.setText("");
			case03.setText(textePion);
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText("");
		}
		else if(positionPion == 4) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText(textePion);
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText("");
		}
		else if(positionPion == 5) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText("");
			case05.setText(textePion);
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText("");
		}
		else if(positionPion == 6) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText("");
			case05.setText("");
			case06.setText(textePion);
			case07.setText("");
			case08.setText("");
			case09.setText("");
		}
		else if(positionPion == 7) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText(textePion);
			case08.setText("");
			case09.setText("");
		}
		
		else if(positionPion == 8) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText(textePion);
			case09.setText("");
		}
		
		else if(positionPion == 9) {

			case01.setText("");
			case02.setText("");
			case03.setText("");
			case04.setText("");
			case05.setText("");
			case06.setText("");
			case07.setText("");
			case08.setText("");
			case09.setText(textePion);
		}
	}
	
	// TODO: implanter la méthode d'affichage
    

}
