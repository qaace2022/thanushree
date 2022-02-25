package qaace22training;

public class Overloading
{

	private static void display(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Sum of 3 numbers: " + sum);}
	private static void display(String name)
	{
		System.out.println("Student Name: " + name);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Overloading overload=new Overloading();
		overload.display(50,30,40);
		overload.display("thanushree");
		
	}

}
