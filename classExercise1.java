package csc201;

import java.util.Scanner;
public class classExercise {

	public static void main(String[] args) {
		
	//1.	
		String trueName = "NOVA";
		String truePassword = "123456";
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the user name: ");
		String name = scan.nextLine();
 
		System.out.println("Please enter the password: ");
		String password = scan.nextLine();
		
		if ( name.equals(trueName) && password.equals(truePassword)) 
		{ 
			System.out.println("Welcome " + name);
		}
		else {
			System.out.println("You entered invalid Username or Password.");
		}
		
		System.out.println("");
		
	//2.	
		for (int i = 1; i<= 100; i=i+2)
		{
			System.out.println(i);
		}
			
		
		System.out.println("");
		
		
	//3.
			int j = 0; 
			while (j <100)
			{
				j = j+2;
				System.out.println(j);
			}
			
			
		}
		
	}

		
	


