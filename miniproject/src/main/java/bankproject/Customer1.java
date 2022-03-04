package bankproject;

import java.io.File;

import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Customer1 {

	public static void main(String[] args) throws Exception {
		ObjectMapper ref2 = new ObjectMapper();
		Bank bk =ref2.readValue(new File("bank.json"),Bank.class);
		Scanner ref=new Scanner(System.in);
		System.out.println("hi admin ");
		System.out.println("1. check balance  \n2. deposit \n3. withdraw\n4. close \block debit cards");
		int ch;
		ch= ref.nextInt();
		switch (ch) {
		case 1:
			

			break;
		}
		ref.close();
	}

}
