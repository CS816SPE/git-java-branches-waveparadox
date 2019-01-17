// Comment 1!

import java.util.Scanner;
public class hello {
	public static void main (String args[]){
		float a,b, res;
		char choice, ch;
		Scanner scan = new Scanner (System.in);
		do{
			System.out.print("1. Add, 2. Multiply\n");
			System.out.print("3. Exit\n");
			System.out.print("enter your choice: ");
			choice=scan.next().charAt(0);
			switch(choice){
				case '1': System.out.print("enter 2 numbers: ");
						  a=scan.nextFloat();
						  b=scan.nextFloat();
						  res=a+b;
						  System.out.print("Result = "+res);
						  break;
				case '2': System.out.print("enter 2 numbers: ");
						  a=scan.nextFloat();
						  b=scan.nextFloat();
						  res=a*b;
						  System.out.print("Result = "+res);
						  break;
				case '3': System.exit(0);
						  break;
				default : System.out.print("Invalid choice \n");
						  break;

			}
			System.out.print("\n--------------");
		}while(choice!=2);
	}
}