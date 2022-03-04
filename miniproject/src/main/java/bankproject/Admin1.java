package bankproject;

import java.io.File;

import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Admin1 {
	public static void main (String[]args) throws Exception{
		ObjectMapper ref2 = new ObjectMapper();
		Bank bk =ref2.readValue(new File("bank.json"),Bank.class);
		Scanner ref=new Scanner(System.in);
		System.out.println("hi admin ");
		for (int i=1;i<=3;) {
			System.out.println("1. view all customer data \n2. add new customer \n3. issue new debit card\n4. view blocked debit cards\n5. close \block debit cards");
			int ch;
			ch= ref.nextInt();
			switch (ch) {
			case 1:
				for(Customers cs1: bk.getCustomers()) {
					System.out.println(cs1.getId());
					System.out.println(cs1.getName());
					for(Dcards dcs: cs1.getCards()) {
						System.out.println(dcs.getCardNum());
						System.out.println(dcs.getPin());
						System.out.println(dcs.getBalance());
						System.out.println(dcs.isActive());
					}
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				for(Customers c1: bk.getCustomers()) {
					for(Dcards dc: c1.getCards()) {
						if(dc.isActive()==false) {
							System.out.println(dc.getCardNum());
							System.out.println(dc.getPin());
							System.out.println(dc.getBalance());
						}
					}
				}
				break;
			case 5:
				break;
			}
			i++;
		}
		ref.close();
	}

}
