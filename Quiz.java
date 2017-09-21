import java.util.Scanner;

import java.io.*;

 
public class Quiz {

 
	public int add(int num1, int num2){

 
		int sum;

		sum = num1 + num2;

 
		return sum;

	}

 
	public int sub(int num1, int num2){

 
		int sum;

		sum = num1 - num2;

 
		return sum;

	}

 
	public int multi(int num1, int num2){

 
		int sum;

		sum = num1 * num2;

 
		return sum;

	}

 
	public int div(int num1, int num2){

 
		int sum;

		sum = num1 / num2;

 
		return sum;

	}

 
	public int mod(int num1, int num2){

 
		int sum;

		sum = num1 % num2;

 
		return sum;

	}

 
	public int pow(int base, int exp){

 
		int sum = 1;

 
		if (exp == 0)

		{

			sum = 1;

		}

 
		while (exp > 0)

		{

			sum = sum * base;

			exp--;

 
		}

 
 
		return sum;

 
	}

 
    public static void main(String[] args) {

 
    	int choice;

    	int x;

    	int y;

    	int sum;

    	PrintStream out;

 
    	Quiz calc = new Quiz();

 
 
    	try

    	{

    		out = new PrintStream ("calclog.txt");

 
    		do

    		{

    			System.out.println("Calculator Option Menu");

    			System.out.println("1.  Add two integers");

    			System.out.println("2.  Subtract an integer from an integer");

    			System.out.println("3.  Multiply two integer");

    			System.out.println("4.  Divide an integer into an integer");

    			System.out.println("5. Exit\n");

    			System.out.println("Select one of the option numbers from avobe: ");

 
    			Scanner input = new Scanner(System.in);

    			choice = input.nextInt();

 
    			while ((choice < 1 || choice > 6) && choice != 99)

    			{

    				System.out.println("Please enter a 1, 2, 3, 4, 5, or 6: " );

    				choice = input.nextInt();

    			}

 
 
    			System.out.println("Please enter 2 numbers only: ");

    			x = input.nextInt();

    			y = input.nextInt();

 
    				switch (choice)

    				{

    					case 1: 

    						sum = calc.add(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "+" + y + "=" + sum);
    			
    						break;

 
    					case 2:

    						sum = calc.sub(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "-" + y + "=" + sum);

    						break;

 
    					case 3:

    						sum = calc.multi(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "*" + y + "=" + sum);

    						break;

 
    					case 4:

    						sum = calc.div(x,y);

    						System.out.printf("The sum is %d\n\n",sum);

    						out.println(x + "/" + y + "=" + sum);

    						break;
    				}

 
    		}

 
    		while (choice != 99);

    		System.out.println("Ending program...");

 
    	}

 
    	catch(Exception e)

    	{

    		System.out.println("ERROR: Could not open file!");

    	}

 
 
    }

}