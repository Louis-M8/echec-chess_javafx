package echec_chess_client.controleurs;

import commun_client.mvc.controleurs.ControleurModeleVue;

import echec_chess.modeles.partie_locale.PartieLocale;
import echec_chess.modeles.partie_locale.PartieLocaleLectureSeule;
import echec_chess_client.afficheurs.AfficheurPartieLocale;
import echec_chess_client.vues.VuePartieLocale;

public abstract class ControleurPartieLocale<V extends VuePartieLocale, A extends AfficheurPartieLocale<V>>
extends ControleurModeleVue<PartieLocaleLectureSeule, PartieLocale, V, A>{

}
