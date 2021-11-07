package syntax.class5;
import java.util.Scanner;
public class HWbirth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan=new Scanner(System.in);
System.out.println(("Enter your birth Month"));
String Month=Scan.nextLine();
String Season=null;

if(Month.equalsIgnoreCase("June") || Month.equalsIgnoreCase("July") || Month.equalsIgnoreCase("August")) {
	Season="Summer";
}else if (Month.equalsIgnoreCase("September") || Month.equalsIgnoreCase("October") || Month.equalsIgnoreCase("November")) {
	Season="Fall";
}else if (Month.equalsIgnoreCase("December") || Month.equalsIgnoreCase("January") || Month.equalsIgnoreCase("February")){
	Season="Winter";
}else if (Month.equalsIgnoreCase("March") || Month.equalsIgnoreCase("April") || Month.equalsIgnoreCase("May")) {
    Season="Spring";
}
System.out.println("Season you were born is "+Season);
	}
}