package echec_chess_javafx.vues.composantes;

import commun.debogage.J;

import commun_javafx.vues.composants.ImageAjustable;
import javafx.beans.NamedArg;

public class CaseAjustable extends ImageAjustable {

public CaseAjustable (@NamedArg("url")String url) {
	super(url);
	J.appel(this);
}

}
