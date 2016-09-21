package prob4;

public class Rectangle extends Shape implements Resizable {
	
	public Rectangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public double getPerimeter() {
		return getWidth() * 2 + getHeight() * 2;
	}
	
	@Override
	public void resize(double s) {
		setWidth(getWidth() * s);
		setHeight(getHeight() * s);
	}

}
