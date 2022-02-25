package qaace22training;

public class Bank {

	interface bank {
		public void ICICI();
		public void HDFC();
		public void AXIS();}
	public static class BankROI implements bank{
		public void ICICI() {
			double ROI=89.5;
			System.out.println("ICICI Bank Rate Of Interest is "+ROI);
			}
		public void HDFC() {
			double ROI=90.5;
			System.out.println("HDFC Bank Rate Of Interest is "+ROI);
			}
		public void AXIS() {
			double ROI=100.25;
			System.out.println("AXIS Bank Rate Of Interest is "+ROI);
			}
		public static void main(String[]args)
		{
			bank obj = new BankROI();
			obj.ICICI();
			obj.HDFC();
			obj.AXIS();
			}
		}



}
