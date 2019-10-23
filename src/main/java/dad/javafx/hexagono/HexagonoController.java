package dad.javafx.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoController {

	private HexagonoModel model = new HexagonoModel();
	private HexagonoView root = new HexagonoView();
	
	public HexagonoController() {

		Bindings.bindBidirectional(root.getRadio().textProperty(),model.radioProperty(), new NumberStringConverter());

		
		
		root.getHexagonoShape().radiusProperty().bind(model.radioProperty());
		
	}
	
	public HexagonoView getRoot() {
		return root;
	}
	
}
