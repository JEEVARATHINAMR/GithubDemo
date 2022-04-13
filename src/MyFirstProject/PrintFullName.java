package MyFirstProject;

import java.util.Scanner;

public class PrintFullName {
	public static void printMyName(String firstname, String lastname) {
		System.out.print(firstname);
		System.out.print(" ");
		System.out.print(lastname);
}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String firstname = scan.next();
		System.out.println("Enter rhe last name");
		String lastname = scan.next();
		printMyName(firstname, lastname);
				
	}

}
