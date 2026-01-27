package nonparameter;

public class noconstructor {

	public static void main(String[] args) {
		class Rectangle {
		    private double length, width;

		    public Rectangle() {
		        this.length = 1.0;
		        this.width = 1.0;
		    }

		    public double getArea() { return length * width; }

		    public static void main(String[] args) {
		        Rectangle rect = new Rectangle();
		        System.out.println("Area: " + rect.getArea());
		    }
		}


	}

}
