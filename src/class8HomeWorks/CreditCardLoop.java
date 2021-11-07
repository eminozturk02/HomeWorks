package class8HomeWorks;
import java.util.Scanner;
public class CreditCardLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
boolean response=true;
while(response) {
	System.out.println("Do you want to apply for a credit card?");
	String cresponse=scan.nextLine();
	if(cresponse.equalsIgnoreCase("Yes")) {
		break;
	}
} System.out.println("Thank you. Please proceed to next step");

		
		
		
		
		
		
	}

}
