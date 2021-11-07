import java.util.Scanner;

/*You are DMV representative and you need to ask customer their age. 
 * If they are 18 and older you will issue a driver license to them, 
 * otherwise you will offer them to get a learners permit. 
 */
public class SHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dmv = new Scanner(System.in);
		System.out.println("What is your age");
		int age = dmv.nextInt();
		if (age >= 18) {
			System.out.println("You will be issued with a driver licence");
		} else {
			System.out.println("You can get a learner permit");
		}
	}

}
