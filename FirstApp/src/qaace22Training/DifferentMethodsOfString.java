package qaace22Training;

public class DifferentMethodsOfString {

	public static void main(String[] args) {
		String myString = "Shree", myString2 = "thanu", myString3="Shree";
		String s="    welcome   ", s1="";
		System.out.println(myString.charAt(3));
		System.out.println(myString.length());
		System.out.println(myString.equals("Shree"));
		System.out.println(myString.concat(myString2));
		System.out.println(myString.indexOf("e"));
		System.out.println(myString.compareTo(myString3));
		System.out.println(myString.toUpperCase());
		System.out.println(myString.toLowerCase());
		System.out.println(s.trim());
		System.out.println(myString.split(""));
		System.out.println(s1.join(":","1","3"));
		System.out.println(myString.contains("ree"));
		System.out.println(myString.substring(0,4));
		System.out.println(myString.replace("e","h"));
		System.out.println(s1.isEmpty());



	}

}
