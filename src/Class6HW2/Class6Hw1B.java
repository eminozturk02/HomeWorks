package Class6HW2;
import java.util.Scanner;
public class Class6Hw1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter first number");
int fn=scan.nextInt();
System.out.println("Enter your second number");
int sn=scan.nextInt();
System.out.println("Choose the operator");
char oper=scan.next().charAt(0);
String result=null;
 switch(oper) {
 case'+':
	 result="Result = "+(fn+sn);
	 break;
 case'-':
	 result="Result = "+(fn-sn);
	 break;	 
 case'/':
	 result="Result = "+(fn/sn);
	 break; 
 case'*':
	 result="Result = "+(fn*sn);
	 break;
 
  }
	System.out.println(result);	
		
		}

}
