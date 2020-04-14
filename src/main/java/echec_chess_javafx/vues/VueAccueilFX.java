package echec_chess_javafx.vues;

import java.net.URL;
import java.util.ResourceBundle;

import static echec_chess_javafx.Constantes.*;

import commun.debogage.DoitEtre;
import commun.debogage.J;
import commun_client.commandes.FabriqueCommande;
import commun_javafx.ChargeurDeVue;
import echec_chess_client.commandes.afficher_parametres.AfficherParametres;
import echec_chess_client.commandes.afficher_parametres.AfficherParametresPourEnvoi;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartie;
import echec_chess_client.commandes.nouvelle_partie.NouvellePartiePourEnvoi;
import echec_chess_client.commandes.quitter.Quitter;
import echec_chess_client.commandes.quitter.QuitterPourEnvoi;
import echec_chess_client.vues.VueAccueil;
import echec_chess_client.vues.VueParametres;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

public class VueAccueilFX implements VueAccueil, Initializable {

	@FXML
	private MenuItem menuNouvellePartie, menuAfficherParametres, menuQuitter;
	
	@FXML
	private VBox conteneurContenu;

	private QuitterPourEnvoi quitterPourEnvoi;
	private NouvellePartiePourEnvoi nouvellePartiePourEnvoi;
	private AfficherParametresPourEnvoi afficherParametresPourEnvoi;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		J.appel(this);
		
		DoitEtre.nonNul(menuNouvellePartie);
		DoitEtre.nonNul(menuAfficherParametres);
		DoitEtre.nonNul(menuQuitter);
		DoitEtre.nonNul(conteneurContenu);
		
	}
	

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);

		quitterPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(Quitter.class);
		nouvellePartiePourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(NouvellePartie.class);
		afficherParametresPourEnvoi = FabriqueCommande.obtenirCommandePourEnvoi(AfficherParametres.class);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		menuAfficherParametres.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				afficherParametresPourEnvoi.envoyerCommande();
			}
		});
		
		menuNouvellePartie.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				nouvellePartiePourEnvoi.envoyerCommande();
			}
		});

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

	
	@Override
	public VueParametres creerVueParametres() {
		J.appel(this);

		ChargeurDeVue<VueParametresFX> chargeur = new ChargeurDeVue<VueParametresFX>(CHEMIN_PARAMETRES_FXML,
				CHEMIN_CHAINES, CHEMIN_PARAMETRES_CSS);

		VueParametresFX vuePara = chargeur.getVue();

		Parent parent = chargeur.getParent();

		conteneurContenu.getChildren().clear();
		conteneurContenu.getChildren().add(parent);

		return vuePara;
	}

}
