package dad.javafx.geometria;

import dad.javafx.geometria.shapes.Hexagon;
import dad.javafx.geometria.shapes.Triangle;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class GeometriaApp extends Application {

	private Circle circuloShape;
	private Rectangle rectanguloShape;
	private Triangle trianguloShape;
	private Hexagon hexagonoShape;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		circuloShape = new Circle();
		circuloShape.setRadius(40);
		circuloShape.setFill(Color.RED);
		circuloShape.setStrokeWidth(2);
		circuloShape.setStroke(Color.BLACK);
		
		rectanguloShape = new Rectangle();
		rectanguloShape.setWidth(60);
		rectanguloShape.setHeight(80);
		rectanguloShape.setFill(Color.rgb(0, 162, 232));
		rectanguloShape.setStrokeWidth(2);
		rectanguloShape.setStroke(Color.BLACK);
		
		
		trianguloShape = new Triangle();
		trianguloShape.setBase(80);
		trianguloShape.setHeight(60);
		trianguloShape.setFill(Color.GREEN);
		trianguloShape.setStrokeWidth(2);
		trianguloShape.setStroke(Color.BLACK);
		
		hexagonoShape = new Hexagon();
		hexagonoShape.setRadius(40);
		hexagonoShape.setFill(Color.PURPLE);
		hexagonoShape.setStrokeWidth(2);
		hexagonoShape.setStroke(Color.BLACK);
		
		
		GridPane root = new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.setAlignment(Pos.CENTER);
		root.add(circuloShape,1,0);
		root.add(rectanguloShape,0,0);
		root.add(trianguloShape, 0, 1);
		root.add(hexagonoShape, 1, 1);
		
		Scene scene = new Scene(root,640,480);
		
		primaryStage.setTitle("Geometria");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
