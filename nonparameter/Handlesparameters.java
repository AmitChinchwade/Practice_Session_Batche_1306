package nonparameter;

public class Handlesparameters {

	public static void main(String[] args) {
		class Book {
			private String title;
			private double price;

			public Book() {
				this.title = "Untitled";
				this.price = 0.0;
			}

			public String getTitle() {
				return title;
			}

			public double getPrice() {
				return price;
			}

			public static void main(String[] args) {
				Book book = new Book();
				System.out.println("Title: " + book.getTitle() + ", Price: " + book.getPrice());
			}
		}

	}

}
