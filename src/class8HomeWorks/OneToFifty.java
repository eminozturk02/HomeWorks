package class8HomeWorks;

public class OneToFifty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i + " ");
		}

	}
}
