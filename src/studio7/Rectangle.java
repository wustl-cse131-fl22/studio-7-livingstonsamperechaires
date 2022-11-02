package studio7;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle(double l, double w) {
		length = l;
		width = w;
			
	}
	public double rectangleArea() {
		return this.length*this.width;
	}
	public double rectanglePerimeter() {
		return ((2*this.length) + (2*this.width));
	}
	public double isSquare(){
		return (4*length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rSmaller;
		boolean rSquare;
		Rectangle r = new Rectangle(5, 5);
		Rectangle x = new Rectangle(5, 4);
		double area  = r.rectangleArea();
		double perimeter = r.rectanglePerimeter();
		if (r.rectangleArea()>=x.rectangleArea()) {
			 rSmaller = false;
		}
		else {
			 rSmaller = true;
		}
		if (r.rectanglePerimeter() == r.isSquare()) {
			rSquare = true;
		}
		else {
			rSquare = false;
		}
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Smaller than other rectangle? " + rSmaller);
		System.out.println("Is a square? " + rSquare);
		


	}

}
