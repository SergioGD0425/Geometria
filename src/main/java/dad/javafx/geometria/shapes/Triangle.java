package dad.javafx.geometria.shapes;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

public class Triangle extends Polygon {
	
	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();
	
	public Triangle() {
		this(0.0,0.0);
	}
	
	public Triangle(double base,double height) {
		super();
		this.base.set(base);
		this.height.set(height);
		createPoints();	
		
		this.base.addListener((o,ov,nv)->createPoints());
		this.height.addListener((o,ov,nv)->createPoints());
	}
	
	private void createPoints() {
		getPoints().clear();
		getPoints().addAll(base.get() / 2.0, 0.0);
		getPoints().addAll(0.0, height.get());
		getPoints().addAll(base.get() , height.get());
		
		
		
		
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getBase() {
		return this.baseProperty().get();
	}
	

	public final void setBase(final double base) {
		this.baseProperty().set(base);
	}
	

	public final DoubleProperty heightProperty() {
		return this.height;
	}
	

	public final double getHeight() {
		return this.heightProperty().get();
	}
	

	public final void setHeight(final double height) {
		this.heightProperty().set(height);
	}
	
}
