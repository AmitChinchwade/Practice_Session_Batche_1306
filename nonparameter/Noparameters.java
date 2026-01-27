package nonparameter;

public class Noparameters {

	public static void main(String[] args) {
		class Student {
		    private String name;
		    private int id;

		    public Student() {
		        this.name = "Anonymous";
		        this.id = -1;
		    }

		    public String getName() { return name; }
		    public int getId() { return id; }

		    public static void main(String[] args) {
		        Student student = new Student();
		        System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
		    }
		}

	}

}
