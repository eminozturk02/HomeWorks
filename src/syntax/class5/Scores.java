/* Write a program that will read three inputs of scores 
 * (quiz, mid term, and final scores) and determine 
 * the grade based on the following rules: 
 */

package syntax.class5;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mehmet = new Scanner(System.in);
		System.out.println("Enter your Quiz, mid term and final score");
		int Quiz = mehmet.nextInt();
		int Mid = mehmet.nextInt();
		int Final = mehmet.nextInt();
		int AverageScore = ((Quiz + Mid + Final) / 3);

		String Grade = null;
		if (AverageScore >= 90) {
			Grade = "A";
		} else if (AverageScore >= 70 && AverageScore < 90) {
			Grade = "B";
		} else if (AverageScore >= 50 && AverageScore < 70) {
			Grade = "C";
		} else if (AverageScore < 50) {
			Grade = "F";
		}
		System.out.println("Your grade is " + Grade + ".");
	}

}
