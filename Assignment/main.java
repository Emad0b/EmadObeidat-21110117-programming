package Assignment;
public class main {

	public static void main(String[] args) {
		RandomNum test= new RandomNum();
		int [] arr= new int[12];
		System.out.println("RANDOM NUMBER GENERATOR");
		test.random(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
		System.out.println("---------------------------------------");
		System.out.println("BUBBLE SORT");
		test.BubbleSort(arr);
		System.out.print("[");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
		System.out.println("---------------------------------------");
		System.out.println("Binary Search");
		test.BinarySearch(arr);

	}

}
