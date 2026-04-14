package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
	}
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(int x, int y, boolean selected) {
		/*this.x=x;
		this.y=y;*/
		this(x,y); // ovo mora biti prva naredba u konstruktoru
		this.selected = selected;
	}
	
	public double distance(int x2, int y2) {
		int dx = this.x - x2;
		int dy = this.y - y2;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}
	
	// potpis i povratna vrednost moraju biti iste kao kod metode koju override
	public String toString() {
		return "("+x+","+y+"), selected = "+selected;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Point) { // mora provera tipa podatka da downcast ne bi fail
			Point pomocnaTacka = (Point)obj; //downcast
			if(this.x==pomocnaTacka.x && this.y==pomocnaTacka.y 
					&& this.selected==pomocnaTacka.selected)
				return true;
		}
		
		return false;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	
}
