package dad.javafx.circulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CirculoController {

	private CirculoModel model = new CirculoModel();
	private CirculoView root = new CirculoView();
	
	public CirculoController() {

		Bindings.bindBidirectional(root.getRadio().textProperty(),model.radioProperty(), new NumberStringConverter());
		
		root.getArea().textProperty().bind(model.areaProperty().asString());
		root.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		
		root.getCirculoShape().radiusProperty().bind(model.radioProperty());
		
	}
	
	public CirculoView getRoot() {
		return root;
	}
	
}
