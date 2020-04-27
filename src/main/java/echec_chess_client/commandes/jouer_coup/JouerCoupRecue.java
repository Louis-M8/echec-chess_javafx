package echec_chess_client.commandes.jouer_coup;

import commun_client.commandes.CommandeRecue;

public interface JouerCoupRecue extends CommandeRecue {
	
	int getCaseDepartColonne();
	int getCaseDepartRangee();

	int getCaseDestinationColonne();
	int getCaseDestinationRangee();
	
}
