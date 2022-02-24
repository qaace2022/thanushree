package qaace22Training;
	import java.util.*;
	import java.io.*;
	public class StringInFile 
	{
		public static void main(String[] args) {
		String text;Scanner s = new Scanner(System.in);
		System.out.println("Enter The String : ");
		text = s.nextLine();
		byte[] byte1 = text.getBytes();
		try {
			FileOutputStream file = new FileOutputStream("D:/output.txt");
			file.write(byte1);
			file.close();
			} 
		catch (IOException e)
		{
			e.printStackTrace();
			}
		s.close();
		}
	}

