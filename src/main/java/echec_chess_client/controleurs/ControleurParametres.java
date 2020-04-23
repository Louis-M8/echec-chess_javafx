package echec_chess_client.controleurs;

import commun_client.mvc.controleurs.ControleurModeleVue;

import echec_chess.modeles.difficultes.Parametres;
import echec_chess.modeles.difficultes.ParametresLectureSeule;
import echec_chess_client.afficheurs.AfficheurParametres;
import echec_chess_client.vues.VueParametres;

public abstract class ControleurParametres<V extends VueParametres, A extends AfficheurParametres<V>>
extends ControleurModeleVue<ParametresLectureSeule, Parametres, V, A>{

}
