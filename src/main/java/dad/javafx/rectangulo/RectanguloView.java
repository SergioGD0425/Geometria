package dad.javafx.rectangulo;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends GridPane {
	
	private TextField ancho;
	private TextField alto;
	private Rectangle rectanguloShape;
	private Label area;
	private Label perimetro;
	

	public RectanguloView() {		
		super();
		
		ancho = new TextField();
		ancho.setPromptText("Introduce un ancho");
		ancho.setMaxWidth(130);
		

		alto = new TextField();
		alto.setPromptText("Introduce una altura");
		ancho.setMaxWidth(130);
		
		area = new Label();
		perimetro = new Label();
		
		rectanguloShape = new Rectangle();
		rectanguloShape.setFill(Color.rgb(0, 162, 232));
		rectanguloShape.setStrokeWidth(2);
		rectanguloShape.setStroke(Color.BLACK);
		
		this.setPadding(new Insets(10));
		this.setAlignment(Pos.CENTER);
		this.setHgap(5);
		this.setVgap(5);
	
		this.addRow(0, new Label("Ancho "), ancho);
		this.addRow(1, new Label("Alto: "),alto);
		this.addRow(2,rectanguloShape);
		this.setColumnSpan(rectanguloShape, 2);
		this.addRow(3, new Label("Área: "), area);
		this.addRow(4, new Label("Perímetro: "),perimetro);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		
		cols[0].setHalignment(HPos.LEFT);
		cols[1].setFillWidth(true);
		

		this.getColumnConstraints().setAll(cols);
		
		
	}


	public TextField getAncho() {
		return ancho;
	}


	public TextField getAlto() {
		return alto;
	}


	public Rectangle getRectanguloShape() {
		return rectanguloShape;
	}


	public Label getArea() {
		return area;
	}


	public Label getPerimetro() {
		return perimetro;
	}
	
}
