package echec_chess_client.vues;

import commun_client.mvc.Vue;

public interface VueAccueil extends Vue { 
	
	VueParametres creerVueParametres();
	VuePartieLocale creerVuePartieLocale();
	
}
