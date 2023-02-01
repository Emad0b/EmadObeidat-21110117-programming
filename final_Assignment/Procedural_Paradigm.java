package final_Assignment;

import java.util.Scanner;

public class Procedural_Paradigm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fist number:");
		double num1= sc.nextDouble();
		System.out.println("Enter the Second number:");
		double num2= sc.nextDouble();
		System.out.println("Enter the Operation:");
		String operator= sc.next();
		System.out.print("The answer is:");
		switch(operator) 
		{
		case "*":
			System.out.println(multiply(num1,num2));
		break;
		case "+":
			System.out.println(addition(num1,num2));
		break;
		case "-":
			System.out.println(subtraction(num1,num2));
		break;
		case "/":
			System.out.println(divide(num1,num2));
		break;
		default:
		System.out.println("Unkown operator");
		}
	}
	static double addition(double x,double y) 
	{
		return x+y;
	}
	static double subtraction(double x,double y) 
	{
		return x-y;

	}
	static double multiply(double x,double y) 
	{
		return x*y;

	}
	static double divide(double x,double y) 
	{
		return x/y;
	}

}
