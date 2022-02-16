package qaace22Training;
public class LargestAndSmallestElementsOfArray
{
	public static void main(String[] args)
	{
	int nums[] = new int[]{444,577,98,90,22,1};
	int smallest = nums[0];
	int largest = nums[0];
	for (int i = 0; i < nums.length; i++)
	{
		if (nums[i] > largest)
			largest = nums[i];
		else if (nums[i] < smallest)
		smallest = nums[i];
		}
	System.out.println("Largest Number is : " + largest);
   System.out.println("Smallest Number is : " + smallest);
		
	}
}







	


