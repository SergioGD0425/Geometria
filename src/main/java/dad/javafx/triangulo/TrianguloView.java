package dad.javafx.triangulo;

import dad.javafx.geometria.shapes.Triangle;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TrianguloView extends GridPane {
	
	private TextField base;
	private TextField altura;
	private Triangle trianguloShape;
	private Label area;
	

	public TrianguloView() {		
		super();
		
		base = new TextField();
		base.setPromptText("Introduce una base");
		base.setMaxWidth(130);
		

		altura = new TextField();
		altura.setPromptText("Introduce una altura");
		altura.setMaxWidth(130);
		
		area = new Label();
		
		trianguloShape = new Triangle();
		trianguloShape.setFill(Color.GREEN);
		trianguloShape.setStrokeWidth(2);
		trianguloShape.setStroke(Color.BLACK);
		
		
		this.setPadding(new Insets(10));
		this.setAlignment(Pos.CENTER);
		this.setHgap(5);
		this.setVgap(5);
	
		this.addRow(0, new Label("Ancho "), base);
		this.addRow(1, new Label("Alto: "),altura);
		this.addRow(2,trianguloShape);
		this.setColumnSpan(trianguloShape, 2);
		this.addRow(3, new Label("Área: "), area);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		cols[0].setHalignment(HPos.LEFT);
		cols[1].setFillWidth(true);
		

		this.getColumnConstraints().setAll(cols);
		
		
	}


	public TextField getBase() {
		return base;
	}


	public TextField getAltura() {
		return altura;
	}


	public Triangle getTrianguloShape() {
		return trianguloShape;
	}


	public Label getArea() {
		return area;
	}


}
