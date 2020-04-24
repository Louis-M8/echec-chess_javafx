package echec_chess_client.commandes.jouer_coup;

import commun_client.commandes.CommandePourEnvoi;

public interface JouerCoupPourEnvoi extends CommandePourEnvoi { 
	
	void setCaseDepart(int indiceColonne, int indiceRangee);
	void setCaseDestination(int indiceColonne, int indiceRangee);
	
	
}
