package nonparameter;

public class Companyemployees {

	public static void main(String[] args) {
		class Company {
			private String name;
			private int employees;

			public Company() {
				this.name = "Startup";
				this.employees = 0;
			}

			public String getName() {
				return name;
			}

			public int getEmployees() {
				return employees;
			}

			public static void main(String[] args) {
				Company comp = new Company();
				System.out.println("Name: " + comp.getName() + ", Employees: " + comp.getEmployees());
			}
		}

	}

}
