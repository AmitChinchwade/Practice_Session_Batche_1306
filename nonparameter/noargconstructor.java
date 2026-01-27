package nonparameter;

public class noargconstructor {

	public static void main(String[] args) {

		class Cat {
			private String name;
			private int age;

			// No-arg constructor
			public Cat() {
				this.name = "Unknown";
				this.age = 0;
			}

			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}

			public static void main(String[] args) {
				Cat cat = new Cat();
				System.out.println("Name: " + cat.getName() + ", Age: " + cat.getAge());
			}
		}

	}

}
