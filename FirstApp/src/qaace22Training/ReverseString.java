package qaace22Training;

public class ReverseString {
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
	public static void main(String args[])
		{  
		    System.out.println(reverseString("my name is thanushree"));  
		    System.out.println(reverseString("I am "));      
		    }  
		}  
