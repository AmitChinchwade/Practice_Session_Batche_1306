package nonparameter;

public class employee {

	public static void main(String[] args) {
		class Employee {
			private String empName;
			private double salary;

			public Employee() {
				this.empName = "New Hire";
				this.salary = 0.0;
			}

			public String getEmpName() {
				return empName;
			}

			public double getSalary() {
				return salary;
			}

			public static void main(String[] args) {
				Employee emp = new Employee();
				System.out.println("Name: " + emp.getEmpName() + ", Salary: " + emp.getSalary());
			}
		}

	}

}
