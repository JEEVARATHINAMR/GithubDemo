package MyFirstProject;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = read.nextInt();
		
		if (number %2 == 0) {
			System.out.println("It is positive number" +number);
		}
		else {
			System.out.println("It is negative number" +number);
			
		}
		int a = 6;
				
		//postfix increment
		System.out.println(a++);
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		//prefix increment
		System.out.println(++a);
		System.out.println(a);
		
		
		
				
	}

}

