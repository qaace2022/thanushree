
package qaace22training;
public class string 
{
	
		public  static void main(String args[]){
			String b1= "thanu";
			String b2= "shree";
			b1=b1.concat("cheeko");
			System.out.println(b1);
			System.out.println(b2.isEmpty());
			String replaceString=b1.replace('a','e');
			System.out.println(replaceString);
			String replaceString1=b1.replace("thanu","cheeko");
			System.out.println(replaceString1);
			System.out.println(b1.equalsIgnoreCase(b2));
			}
	}


