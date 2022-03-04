package bankproject;
import java.io.File;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper; 
public class Mainpage {

	public static void main(String[] args) throws Exception {
		Scanner ref=new Scanner(System.in);
		System.out.println("select the user type ");
		System.out.println("1. Admin\n 2. customer");
		int ch;
		ch= ref.nextInt();
		switch (ch) {
		case 1 :
			ObjectMapper objm = new ObjectMapper();
			Bank ref1 = objm.readValue(new File ("bank.json"),Bank.class);
			String a1,a2,a3,a4;
			a3=ref1.getAdmin().username;
			a4=ref1.getAdmin().password;
			System.out.println("type username ");
			a1=ref.next();
			System.out.println("type password");
			a2=ref.next();
			if(a1.contentEquals(a3)&& a2.contentEquals(a4))
			{
				Admin1.main(args);
			}
			else {
				System.out.println("invalid data");
			}
			break;
		case 2:
			Customer1.main(args);
			
			break;


		}
ref.close();
	}

}
