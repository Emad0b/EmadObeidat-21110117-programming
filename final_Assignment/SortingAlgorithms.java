package final_Assignment;

import java.util.Random;

public class SortingAlgorithms {
	Random rand = new Random();
	public int[] BubbleSort(int[] arr,boolean choice) 
	{
	    int temp=0;
	    if(!choice) 
	    {
	    	for(int i=0;i<arr.length;i++) 
			{
				for(int j=1;j<arr.length;j++) 
				{
					if(arr[j-1]>arr[j]) 
					{
						temp=arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
	    }
	    else
	    {
		    for(int i=0;i<arr.length;i++) 
		    {
		        for(int j=1;j<arr.length-i;j++) 
		        {
		            if(arr[j-1]<arr[j]) 
		            {
		                temp=arr[j-1];
		                arr[j-1]=arr[j];
		                arr[j]=temp;
		            }
		        }
		    }
	    }
	    return arr;
	} 
	public int[] RandomNum(int[]arr,int limit,boolean isTrue) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(!isTrue) 
			{
				arr[i]=rand.nextInt(limit-60)+60;
			}else 
			{
				arr[i]=rand.nextInt(limit);
			}
		}
		return arr;
	}
}
