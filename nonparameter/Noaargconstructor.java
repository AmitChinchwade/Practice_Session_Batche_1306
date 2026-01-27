package nonparameter;

public class Noaargconstructor {

	public static void main(String[] args) {
		class Point {
			private int x, y;

			public Point() {
				this.x = 0;
				this.y = 0;
			}

			public void display() {
				System.out.println("x: " + x + ", y: " + y);
			}

			public static void main(String[] args) {
				Point p = new Point();
				p.display();
			}
		}

	}

}
