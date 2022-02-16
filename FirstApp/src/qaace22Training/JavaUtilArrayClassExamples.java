package qaace22Training;
import java.util.Arrays;
public class JavaUtilArrayClassExamples
{
	public static void main(String[] args)
{
		String str[] = {"cheeky", "cheeko", "praveen", "Thanushree", "Kumar"};
 System.out.println("Original String Array: " + Arrays.toString(str));
 System.out.println("Copied Array: " + Arrays.toString(Arrays.copyOf(str, 3)));
 System.out.println("Copied Range of Array: " + Arrays.toString(Arrays.copyOfRange(str,2,4)));
 System.out.println("The array converted to list:" + Arrays.asList(str) );
 Arrays.sort(str);
 System.out.println("Sorted Array:" + Arrays.toString(str));
 Arrays.fill(str,"friends");
 System.out.println("Array after call to fill:" + Arrays.toString(str));
 }
	}


