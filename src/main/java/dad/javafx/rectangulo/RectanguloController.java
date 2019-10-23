package dad.javafx.rectangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model = new RectanguloModel();
	private RectanguloView root = new RectanguloView();
	
	public RectanguloController() {

		Bindings.bindBidirectional(root.getAlto().textProperty(),model.altoProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(root.getAncho().textProperty(),model.anchoProperty(), new NumberStringConverter());
		
		root.getArea().textProperty().bind(model.areaProperty().asString());
		root.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		
		root.getRectanguloShape().widthProperty().bind(model.anchoProperty());
		root.getRectanguloShape().heightProperty().bind(model.altoProperty());
		
	}
	
	public RectanguloView getRoot() {
		return root;
	}
	
}
