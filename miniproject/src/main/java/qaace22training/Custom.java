package qaace22training;

@SuppressWarnings("serial")
class MaxLimitReached extends Exception{
	public MaxLimitReached(String s) {
		super(s);
	}
}
public class Custom {

	static int count;
	public Custom()   
	{ 
		count++;  
	} 
	static void validate(int count) throws MaxLimitReached{
		if(count>3) {
			throw new MaxLimitReached("More Than Three Cannot Be Created");
		}
		else {
			System.out.println("Total Number of Objects:" + count);
		}
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Custom ob1 = new Custom();  
		Custom ob2 = new Custom();  
		Custom ob3 = new Custom();
		Custom ob4 = new Custom();
		try {
			validate(count);
		}
		catch(MaxLimitReached ex) {
			System.out.println(ex);
		}
	}
}