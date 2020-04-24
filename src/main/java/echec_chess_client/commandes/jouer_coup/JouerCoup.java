package echec_chess_client.commandes.jouer_coup;

import commun.debogage.J;
import commun_client.commandes.Commande;

public class JouerCoup extends Commande<JouerCoupPourEnvoi, 
                                       JouerCoupRecue> 

                      implements JouerCoupPourEnvoi, 
                                 JouerCoupRecue {
	
	private int caseDepartColonne;
	private int caseDepartRangee;

	private int caseDestinationColonne;
	private int caseDestinationRangee;

	@Override
	public int getCaseDepartColonne() {
		J.appel(this);
		
		return caseDepartColonne;
	}

	@Override
	public int getCaseDepartRangee() {
		J.appel(this);

		return caseDepartRangee;
	}

	@Override
	public int getCaseDestinationColonne() {
		J.appel(this);

		return caseDestinationColonne;
	}

	@Override
	public int getCaseDestinationRangee() {
		J.appel(this);
		
		return caseDestinationRangee;
	}

	@Override
	public void setCaseDepart(int indiceColonne, int indiceRangee) {
		J.appel(this);
		
		this.caseDepartColonne = indiceColonne;
		this.caseDepartRangee = indiceRangee;
	}

	@Override
	public void setCaseDestination(int indiceColonne, int indiceRangee) {
		J.appel(this);

		this.caseDestinationColonne = indiceColonne;
		this.caseDestinationRangee = indiceRangee;
	}
	
}
