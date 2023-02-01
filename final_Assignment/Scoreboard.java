package final_Assignment;

import java.util.Random;
import java.util.Scanner;

public class Scoreboard {
	String[] category = { "  Rank\t", " Teams ID ", "\tTeams Name", "  Solved Questions ", "  Elapsed Time ", };
	String[] random= {"Coders-HTU","Syntax-JU","Fast-JUST","Techno-UNI","Asriyya","blue-LOCK","Sumaya-UNI","GDVC","9","10"};
	Teams id= new Teams(); 
	Random rand = new Random();
	int[] arr = new int[10];
	int tableSize = 75;
	boolean isType=true;
	public Scoreboard(int[] array,int[] array2,String[]array3) {
		Scanner sc= new Scanner(System.in);
		int test=0;
		boolean isLoop=true;
		while(isLoop) // the loop takes the user input whether he wanted to enter team name himself or choose the ones stored in the array and breaks the operation depending on the users input 
		{
			System.out.println("Do you want to enter team names MANUALLY or AUTOMATICALLY:\n1.MANUALLY\n2.AUTOMATICALLY ");
			test=sc.nextInt();

			if(test==1) 
			{
				for(int x=0;x<array3.length;x++) 
				{
					System.out.println("Enter Team Name(10 chracters limit): ");
					array3[x]=sc.next();
				}
				break;
			}else if(test==2) 
			{
				array3=random;
				break;
			}else 
			{
				System.err.println("Wrong input");
			}
		}
		//method calling
		id.setTeamName(array3);
		id.TeamAnswers(array,isType);
		id.TeamElapsedTime(array2,!isType);
		
		
		for (int i = 1; i < tableSize; i++) {// Print out the first row of the table
			System.out.print("#");
		}
		System.out.println();
		System.out.print("#");
		for (int i = 0; i < category.length; i++) {// print out the second row of the table with elements
			System.out.printf(category[i] + " #");
		}
		System.out.println();
		for (int i = 1; i < tableSize; i++) {// Print out the third row of the table
			System.out.printf("#");
		}
		System.out.println();
		for (int i = 1; i <=10; i++) {// Print the board rows
			for (int j = 1; j <= 5; j++) {// print the board columns
				switch (j) {
				case 1:
					System.out.printf("#%5d\t #", i);
				break;
				case 2:
					int []TeamID=id.TeamID(arr,isType);
					System.out.print(String.format("%5d\t     #",TeamID[i-1]));//the parameter we give the TeamID method is i-1 because the loop begins from 1 not from 0
				break;
				case 3:
					String sc2=id.getTeamName(i-1);
					System.out.printf("%10s   #", sc2);
				break;
				case 4:
					System.out.printf("%8d/10\t\t#", array[i-1]);//the parameter we give the array is i-1 because the loop begins from 1 not from 0
				break;
				case 5:
					System.out.printf("%10s\t #", array2[i-1]);//the parameter we give the array is i-1 because the loop begins from 1 not from 0
				break;
				}
			}
			System.out.println();
		}
	}
}
