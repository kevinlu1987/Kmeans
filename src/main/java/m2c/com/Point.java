package kmeans.m2c.com;


public class Point {

	private double x;
	
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0.0;
		this.y = 0.0;
	}

	public void setPosition(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	
	public void setPosition(String pos, String split) {
		
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	public boolean equals(Point p) {
		if (this == p) {
			return true;
		}
		if (this.x != p.x) {
			return false;
		}
		if (this.y != p.y) {
			return false;
		}
		return true;
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}
	
}
