package dad.javafx.triangulo;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TrianguloController {

	private TrianguloModel model = new TrianguloModel();
	private TrianguloView root = new TrianguloView();
	
	public TrianguloController() {

		Bindings.bindBidirectional(root.getAltura().textProperty(),model.alturaProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(root.getBase().textProperty(),model.baseProperty(), new NumberStringConverter());
		
		root.getArea().textProperty().bind(model.areaProperty().asString());
		
		root.getTrianguloShape().heightProperty().bind(model.alturaProperty());
		root.getTrianguloShape().baseProperty().bind(model.baseProperty());
		
	}
	
	public TrianguloView getRoot() {
		return root;
	}
	
}
