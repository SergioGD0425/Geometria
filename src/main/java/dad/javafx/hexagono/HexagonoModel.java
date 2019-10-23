package dad.javafx.hexagono;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonoModel {

	private DoubleProperty radio = new SimpleDoubleProperty();

	
	public HexagonoModel() {

	}


	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	


	public final double getRadio() {
		return this.radioProperty().get();
	}
	


	public final void setRadio(final double radio) {
		this.radioProperty().set(radio);
	}
	

}
