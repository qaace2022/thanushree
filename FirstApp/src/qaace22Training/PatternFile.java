package qaace22Training;
import java.io.*;
public class PatternFile 
{
	public static void main(String[] args) {
	try {
		FileWriter fan = new FileWriter("D:/pattern.txt");
		PrintWriter fat= new PrintWriter(fan);
		int i, j,n=4;
		for(i=0; i<n; i++)
		{for(j=0; j<=i; j++)
			{
			fat.print("* ");
			}
		fat.println();
		}
		System.out.println("File Created");
		fat.close();}
	catch (IOException e) 
	{e.printStackTrace();
	} 
	}
}


