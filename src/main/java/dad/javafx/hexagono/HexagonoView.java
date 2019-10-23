package dad.javafx.hexagono;

import dad.javafx.geometria.shapes.Hexagon;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class HexagonoView extends GridPane {
	
	private TextField radio;
	private Hexagon hexagonoShape;
	

	public HexagonoView() {		
		super();
		
		radio = new TextField();
		radio.setPromptText("Introduce un radio");
		radio.setMaxWidth(130);
		
		hexagonoShape = new Hexagon();
		hexagonoShape.setFill(Color.PURPLE);
		hexagonoShape.setStrokeWidth(2);
		hexagonoShape.setStroke(Color.BLACK);
		
		this.setPadding(new Insets(10));
		this.setAlignment(Pos.CENTER);
		this.setHgap(5);
		this.setVgap(5);
	
		this.addRow(0, new Label("Radio: "), radio);
		this.addRow(1,hexagonoShape);
		this.setColumnSpan(hexagonoShape, 2);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		cols[0].setHalignment(HPos.LEFT);
		cols[1].setFillWidth(true);
		

		this.getColumnConstraints().setAll(cols);
		
		
	}


	public TextField getRadio() {
		return radio;
	}


	public Hexagon getHexagonoShape() {
		return hexagonoShape;
	}


}
