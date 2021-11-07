package class8HomeWorks;
import java.util.Scanner;
public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Please enter two integer numbers");
      Scanner scan=new Scanner(System.in);
      int num1=scan.nextInt();
      int num2=scan.nextInt();
      int SumofEven=0;
      int SumofOdd=0;
      for(int i=num1; i<=num2; i++) {
    	  if(i%2==0) {
    		  SumofEven+=i;
    	  }else {
    		  SumofOdd+=i;
    	  }
      }System.out.println("Sum of even numbers is: "+SumofEven);
	System.out.println("Sum of odd numbers is: "+SumofOdd);
		

	}

}
