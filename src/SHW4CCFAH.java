/*Create a Java program that will ask user to input city and temperature. 
 * Your program should convert Fahrenheit into celsius and print
 *  “The temperature is the city __ is __”
 */

import java.util.Scanner;
public class SHW4CCFAH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner city=new Scanner(System.in);
		System.out.println("Please enter city name ");
		String cityName=city.nextLine();
		System.out.println("Enter Fahrenheit Temperature");
		int Fahrenheit=city.nextInt();
		System.out.println("The temperature in the city of "+cityName+" is "+(Fahrenheit-32)/2+" Celcius");
	}
}
	


