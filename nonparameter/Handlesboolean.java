package nonparameter;

public class Handlesboolean {

	public static void main(String[] args) {
		class Fruit {
		    private String type;
		    private boolean fresh;

		    public Fruit() {
		        this.type = "Apple";
		        this.fresh = true;
		    }

		    public void printStatus() {
		        System.out.println("Type: " + type + ", Fresh: " + fresh);
		    }

		    public static void main(String[] args) {
		        Fruit fruit = new Fruit();
		        fruit.printStatus();
		    }
		}


	}

}
