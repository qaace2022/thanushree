package qaace22Training;

public class ReverseWithoutLoop {

	public static void main(String[] args) {
		int number = 12;
		String str = String.valueOf(number);
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		number = Integer.parseInt(builder.toString());
		System.out.println(number);



	}

}
