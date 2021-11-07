/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
 /*If loan is less or equal to 200,000 then you would lend the money 
  * otherwise you would reject the client.
  */
 import java.util.Scanner;
public class SHW2 {
	public static void main(String[] args) {
		
		Scanner loan=new Scanner(System.in);
		System.out.println("How much loan do you need?");
		double money=loan.nextDouble();
		if(money<=200.000) {
			System.out.println("Requested loan  approved");
		}else {
			System.out.println("Requested loan isn't approved");
		}
	}

}
