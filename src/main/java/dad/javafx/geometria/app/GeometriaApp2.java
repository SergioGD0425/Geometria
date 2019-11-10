package dad.javafx.geometria.app;

import dad.javafx.circulo.CirculoController;
import dad.javafx.hexagono.HexagonoController;
import dad.javafx.rectangulo.RectanguloController;
import dad.javafx.triangulo.TrianguloController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.stage.Stage;

public class GeometriaApp2 extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TabPane root = new TabPane();
		
		Tab rectangulo = new Tab("Rectángulo");
		rectangulo.setContent(new RectanguloController().getRoot());
		
		Tab circulo = new Tab("Circulo");
		circulo.setContent(new CirculoController().getRoot());
		
		Tab triangulo = new Tab("Triangulo");
		triangulo.setContent(new TrianguloController().getRoot());
		
		Tab hexagono = new Tab("Hexagono");
		hexagono.setContent(new HexagonoController().getRoot());
		
		root.getTabs().addAll(rectangulo,circulo,triangulo,hexagono);
		root.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		Scene scene = new Scene(root,640,480);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Geometría");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
