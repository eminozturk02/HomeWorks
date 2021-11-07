package class6;

import java.util.Scanner;

public class Class6HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		// numbers from 100 to 1 with space
		int b = 100;
		while (b >= 1) {
			System.out.print(b + " ");
			b--;
		}
		System.out.println();
		// even numbers from 20 to 100
		int c = 20;
		while (c <= 100) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;
		}
		System.out.println();

		// only odd numbers from 100 to 1
		{
			int d = 100;
			while (d > 0) {
				if (d % 2 != 0) {
					System.out.print(d + " ");

				}
				d--;
			}
		}

	}

}

