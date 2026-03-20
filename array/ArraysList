package com.project2;



import java.util.*;



public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Emplyoee> list = new ArrayList<Emplyoee>();

		while (true) {

			System.out.println("-------------");

			System.out.println("1 Add Emplyoee");

			System.out.println("2 view Emplyoee");

			System.out.println("3 search Emplyoee");

			System.out.println("4 Delet emplyoee");

			System.out.println("5 Exist");

			System.out.println("----------------");



			System.out.println("Enter a choice");

			int choice = sc.nextInt();

//			if(choice<=5) {

//				System.out.println("Valid ");	

//				

//			}else {

//				System.out.println("Not valid");

//			}

			if (choice == 1) {

				System.out.println("Enter emplyoee Id");

				int id = sc.nextInt();

				System.out.println("Enter Emplyoee name");

				sc.nextLine();

				String name = sc.nextLine();

				System.out.println("Enter Emplyoee salary");

				double salary = sc.nextDouble();

				Emplyoee emp = new Emplyoee(id, name, salary);

				list.add(emp);

				System.out.println("Emplyoee information is added");

			} else if (choice == 2) {

				for (Emplyoee emplyoee : list) {

					System.out.println(emplyoee);

				}



			} else if (choice == 3) {

				System.out.println("Enter id to search to emplyoee");

				int id = sc.nextInt();

				boolean found = false;

				for (Emplyoee emplyoee : list) {

					if (emplyoee.empId == id) {

						System.out.println(emplyoee);

						found = true;



					}

					if (found == false) {

						System.out.println("emplyoee not found");



					}

				}



			} else if (choice == 4) {

				System.out.println("Enter id to delet");

				int id = sc.nextInt();

				Emplyoee temp = null;

				for (Emplyoee emplyoee : list) {

					if (emplyoee.empId == id) {

						temp = emplyoee;



					}

				}

				if (temp != null) {

					list.remove(temp);

					System.out.println("Emplyoee deleted");



				} else {

					System.out.println("Emplyoee not deleted");

				}



			} else if (choice == 5) {

				System.out.println("Program ended ");

				break;



			}

			



		}

		sc.close();

	}

}
