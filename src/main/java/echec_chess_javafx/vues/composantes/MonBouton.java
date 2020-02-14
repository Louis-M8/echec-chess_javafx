package echec_chess_javafx.vues.composantes;

import commun.debogage.J;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.NamedArg;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.util.Duration;


public class MonBouton extends Button {

	private Timeline animationSurvol = new Timeline();
	
	public MonBouton (@NamedArg("text")String text) {
		super(text);
		J.appel(this);
		
		creerAnimation();
		
		animationSurvol.setCycleCount(-1);
		
		installerListeners();
	}
	
	private void installerListeners() {
		J.appel(this);
		
		this.setOnMouseEntered(new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				J.appel(this);
				animationSurvol.playFromStart();
		}
	});
		
		this.setOnMouseExited(new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				J.appel(this);
				animationSurvol.stop();
				MonBouton.this.setOpacity(2);
		}
	});
	}
	
	private void creerAnimation() {
		J.appel(this);
		
		double delaiMillisecondes = 400;
		
		double opaciteNormale = 1.0;
		
		double opaciteBasse = 0.6;
	
	animationSurvol.getKeyFrames()
					.add(new KeyFrame(Duration.ZERO,
							new KeyValue(opacityProperty(),
									opaciteNormale)));
	
	
	animationSurvol.getKeyFrames()
	.add(new KeyFrame(new Duration(delaiMillisecondes),
			new KeyValue(opacityProperty(),
					opaciteBasse)));
	
	
	
	animationSurvol.getKeyFrames()
	.add(new KeyFrame(new Duration(delaiMillisecondes*2),
			new KeyValue(opacityProperty(),
					opaciteNormale)));
	}
	
	
}
