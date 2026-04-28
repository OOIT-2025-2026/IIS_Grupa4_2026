package geometry;

public class Rectangle {
	private Point upperLeftPoint;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle() {

	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}
	
	public int area() {
		return width * height;
	}
	
	public int circumference() {
		return 2 * (width + height);
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) 
					&& this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
		}
		return false;
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint + ", width = " + width + ", height = " + height;
	}
	
	public boolean contains(int x, int y) {
		if(this.upperLeftPoint.getX() <= x /*levo*/ &&
				this.upperLeftPoint.getY() <= y /*iznad*/ &&
				this.upperLeftPoint.getX() + width >= x /*desno*/ &&
				this.upperLeftPoint.getY() + height >= y /*ispod*/) {
			return true;
		}
		return false;
	}
	
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
