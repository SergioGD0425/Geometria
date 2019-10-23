package dad.javafx.circulo;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class CirculoView extends GridPane {
	
	private TextField radio;
	private Circle circuloShape;
	private Label area;
	private Label perimetro;
	

	public CirculoView() {		
		super();
		

		radio = new TextField();
		radio.setPromptText("Introduce un radio");
		radio.setMaxWidth(130);
		
		area = new Label();
		perimetro = new Label();
		
		circuloShape = new Circle();
		circuloShape.setFill(Color.RED);
		circuloShape.setStrokeWidth(2);
		circuloShape.setStroke(Color.BLACK);
		
		this.setPadding(new Insets(10));
		this.setAlignment(Pos.CENTER);
		this.setHgap(5);
		this.setVgap(5);
	
		this.addRow(0, new Label("Radio: "), radio);
		this.addRow(1,circuloShape);
		this.setColumnSpan(circuloShape, 2);
		this.addRow(2, new Label("Área: "), area);
		this.addRow(3, new Label("Perímetro: "),perimetro);
		
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


	public Circle getCirculoShape() {
		return circuloShape;
	}


	public Label getArea() {
		return area;
	}


	public Label getPerimetro() {
		return perimetro;
	}


	
}
