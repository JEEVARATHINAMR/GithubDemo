package MyFirstProject;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = read.nextInt();
		
		if (number %2 == 0) {
			System.out.println("It is a largest number" +number);
		}
		else {
			System.out.println("It is a smallest number" +number);
			
		}
		

	}

}
