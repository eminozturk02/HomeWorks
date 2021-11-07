import java.util.Scanner;

/* Create a Java program that will ask if user has a credit card or not.
 *  If you user does not have a credit card then offer them. 
 *  If they do have one ask what is balance on the card? 
 *  If balance of the card is larger than 1000, 
 *  tell them to pay off immediately, otherwise 
 *  you can tell them that they can spend more.
 */
public class SHW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card");
		Boolean CC = input.nextBoolean();
		if (CC == true) {
			System.out.println("What is the balance on CC");
			double balance = input.nextDouble();
			if (balance > 1000) {
				System.out.println("Please pay off");
			} else {
				System.out.println("You may spend more");
			}
		} else {
			System.out.println("Please open a Credit Card account");
		}
	}

}

