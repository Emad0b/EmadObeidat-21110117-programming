package Assignment;
import java.util.Random;
public class RandomNum {
	Random rand = new Random();
	int upper= 100;
	int index_up=12;

	public int[] random(int[] arr) 
	{

			for(int i=0;i<arr.length;i++) 
		{
			arr[i]=rand.nextInt(upper);
		}
		return arr;
	}
	public int[] BubbleSort(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=1;j<arr.length-1;j++) 
			{
				if(arr[j-1]>arr[j]) 
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	} 
	public void BinarySearch(int[] arr) 
	{
	    int secretNum = arr[rand.nextInt(index_up)];
	    System.out.println("The number we want is "+secretNum);
	    int y=arr.length-1;
	    int x=0;
		int mid=0;
		int i=0;
		while (x<=y) 
		{
			mid = (x+y)/2;

			if(arr[mid]==secretNum) 
			{
				System.out.println(secretNum+" Found at index: " + mid);  
				break;  
		
			}else if(arr[mid]>secretNum)
			{
				y=mid-1;
			}else
			{
				x=mid+1;
			}

		}

	}
	}


