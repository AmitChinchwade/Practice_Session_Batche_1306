package nonparameter;

public class constructor {

	public static void main(String[] args) {
		class Car {
			private String model;
			private int year;

			public Car() {
				this.model = "Basic";
				this.year = 2026;
			}

			public String getModel() {
				return model;
			}

			public int getYear() {
				return year;
			}

			public static void main(String[] args) {
				Car car = new Car();
				System.out.println("Model: " + car.getModel() + ", Year: " + car.getYear());
			}
		}

	}

}
