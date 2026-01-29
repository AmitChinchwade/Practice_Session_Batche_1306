package Bank;

public class Person {

	public static void main(String[] args) {

		class Person {
			private String name;
			private int age;

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				if (age > 0) {
					this.age = age;
				}
			}

			public static void main(String[] args) {
				Person person = new Person();
				person.setName("Alice");
				person.setAge(25);
				System.out.println("Name: " + person.getName());
				System.out.println("Age: " + person.getAge());
			}
		}

	}

}
