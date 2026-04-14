package geometry;

public class Line {
	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public Line() {
	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line pomocna = (Line) obj;
			if (this.startPoint.equals(pomocna.startPoint)
					&& this.endPoint.equals(pomocna.endPoint)
					&& this.selected == pomocna.selected)
				return true;
		}
		return false;
	}
	
	public String toString() {
		return startPoint.toString() + "-->" + endPoint;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
