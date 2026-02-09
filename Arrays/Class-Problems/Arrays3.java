import java.util.Arrays;

public class Arrays3 {
	
	public static void main(String[] args) {
	int arr[]= {12,23,96,54,76};
	
	System.out.println("Printing an Array using toString :- ");
	System.out.println(Arrays.toString(arr));
	
	System.out.println("Printing an Array with for Loop :- ");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Using for each Loops :- ");
	for(int i : arr)
	{
		System.out.println(i);
	}
	
	System.out.println("Reverse the Array :- ");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]);
	}
	
	
	System.out.println("Max element :- ");
	int max=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}

	}
	System.out.println(max);

	System.out.println("Linear Search :- ");
	
	int target=96;
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==target)

	{
			System.out.println(i);
			}
	}
	
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	System.out.println("sum of array :- "+ sum);
	    }
	
}