package class7HomeWork;

import java.util.Scanner;

public class Class7Hw {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");

		int a = 1, b = 1, installment = 1, SoE = 0, SoO = 0;
		for (a = 1; a <= 100; a++) {
			if (a % 2 == 0) {
				SoE += a;
			}
		}

		System.out.println(SoE);
		for (b = 1; b <= 100; b++) {
			if (b % 2 == 1) {
				SoO += b;
			}
		}
		System.out.println("*********************************************");
		System.out.println(SoO);
		System.out.println("*********************************************");
		System.out.println("What do you want to buy");
		Scanner scan = new Scanner(System.in);
		String itm = scan.next();
		System.out.println("What is the price of " + itm + "?");
		double prc = scan.nextDouble();
		double blnc = prc;
		while (blnc > 0) {
			System.out.println("Enter how much do you want to pay in your installment" + installment);
			double pymnt = scan.nextDouble();
			blnc -= pymnt;
			if (blnc > 0) {
				System.out.println("Your remaining balance is " + blnc);
				installment++;
			} else
				System.out.println("Your change amount is " + (0 - blnc) + ". Thank you for shopping with us!!!");
		}
	}

}

