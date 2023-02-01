package final_Assignment;

import java.util.Random;

public class Teams extends SortingAlgorithms  {
	Random rand = new Random();
	private int upper= 500;
	private int limit= 300;
	private int questions=10;
	private	String[] TeamName ;
	public String getTeamName(int i) {
		return TeamName[i];
	}
	public void setTeamName(String[] teamName) {
			this.TeamName = teamName;	
	}
	public int[] TeamID(int[] arr,boolean isTrue) 
	{
		RandomNum(arr,upper+1,isTrue);
		return arr;
	}
	public int[] TeamAnswers(int[] arr,boolean isTrue) 
	{
		RandomNum(arr, questions+1,isTrue);
		return BubbleSort(arr,isTrue);
	}
	public int[] TeamElapsedTime(int[]arr,boolean isTrue) 
	{		
		RandomNum(arr, limit+1,isTrue);
		return BubbleSort(arr,isTrue);
	}
}
