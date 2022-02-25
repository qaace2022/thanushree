package qaace22training;
final class Person
{
	public String name;
	public int age;
	public char gender;
	public Person(String name, int age, char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		}}
public class ReturnString
{
	public static Person getDetails()
	{
	String name = "cheeko";
	int age = 24;
	char gender = 'M';
	return new Person(name, age, gender);
	}
public static void main(String[] args)
{
	Person person = getDetails();
	System.out.println("Name is " + person.name);
	System.out.println("Age is " + person.age);
	System.out.println("Gender is " + person.gender);
	}
}



