
public class Circle {
	//the public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//the private 2 attributes
	private double radius;
	private String color;
	
	//constructs a circle with default radius and color
	//1st(default) Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	//constructs a circle with the given radius and default color
	//2nd constructs
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//constructs a circle with the given radius and color
	Circle(double radius , String color){
		this.radius = radius;
		this.color = color;
	}
	//returns the public getter for private attribute radius
	public double getRadius(){
		return this.radius;
	}
	//set the radius-the public setter for private variable radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//returns the public getter for private attribute color
	public String getColor(){
		return this.color;
	}
	//set the radius-the public setter for private variable color
	public void setColor(String color) {
		this.color = color;
	}
	//Return a self-descriptive string for a circle
	public String toString() {
		return "Circle[radius = "+ radius + ",color = "+color + "]";
	}
	public double getArea() {
		return Math.pow(radius,2);
		//return Math.PI * radius * radius;
	}
	
	//Return the circumference of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * radius;
	}

}
