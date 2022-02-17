package qaace22Training;

public class NumberOfInstance
{
	private static int count;
	public NumberOfInstance() 
	{
		count++;
	}
	
	public static void main(String[] args)
	{

			NumberOfInstance ob1 = new NumberOfInstance(); 
			NumberOfInstance ob2 = new NumberOfInstance(); 
			NumberOfInstance ob3 = new NumberOfInstance(); 
			NumberOfInstance ob4 = new NumberOfInstance(); 
			NumberOfInstance ob5 = new NumberOfInstance();
			System.out.print("Total Number of Objects: " + NumberOfInstance.count);
	
		
	}
}







