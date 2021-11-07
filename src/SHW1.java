import java.util.Scanner;
/*Create a Java program to capture 2 numbers from a user and 
 * define which number is the largest.
 */
public class SHW1{
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter first number ");
		int num1=input.nextInt();
		System.out.println("Please enter a second number");
		int num2=input.nextInt();
		
		if(num1>num2) {
			System.out.println("First number "+num1+" is bigger than second number "+num2);
         
		}else{if(num1==num2)
			System.out.println("Both numbers are equal");
		else {
			System.out.println("First number "+num1+" is smaller than second number "+num2);
		}
		}
	}
}



