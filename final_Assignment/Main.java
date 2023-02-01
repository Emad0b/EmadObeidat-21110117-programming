package final_Assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr1=new int[10];
		int[] arr2=new int[10];
		String[] arr3=new String[10];
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Choose Algorithm to run:\n1.ScoreBoard\n2.OOP\n");
		choice=sc.nextInt();
		switch(choice) 
			{
			case 1:
				Scoreboard main1= new Scoreboard(arr1,arr2,arr3);
			break;
			case 2:
				System.out.print("Enter the base amount in your savings account:");
				double BaseAmount=sc.nextDouble();
				System.out.print("how many years has your account been open:");
				int Years=sc.nextInt();
				System.out.print("how much is the rate of interest:");
				double rate=sc.nextDouble();
				OOChildClass main2=new OOChildClass("Emad","Obeidat" , "21110117",Years ,BaseAmount,rate);
				System.out.println(main2.toString());
			break;
			default:
				System.out.println("Wrong Input");
			}
	}

}
