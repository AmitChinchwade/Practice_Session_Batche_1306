package nonparameter;

public class Constructorprints {

	public static void main(String[] args) {
		class Main {
			private int value;

			public Main() {
				this.value = 5;
				System.out.println("Object created");
			}

			public static void main(String[] args) {
				Main m1 = new Main();
				Main m2 = new Main();
			}
		}

	}

}
