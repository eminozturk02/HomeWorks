package class9HomeWorks;

public class ArrayIntegersSumofAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int [] numbers={10, 20, 30, 20, 50, 60, 70};
for(int a=0; a<numbers.length; a++) {
	sum+=numbers[a];
}System.out.println("The sum of array numbers is: "+sum);
	}

}
