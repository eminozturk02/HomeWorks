package class8HomeWorks;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Clock--------");
for (int h=0;h<23; h++) {
	for(int m=0; m<=59; m++) {
		if(h<10 && m<10) {
			System.out.println("0"+h+":0"+m);
		}else if(h>=10 && m<10) {
			System.out.println(h+":0"+m);
		}else if(h<10 && m>=10) {
			System.out.println("0"+h+":"+m);
		}else {
			System.out.println(h+":"+m);
		}
	}
}

	}

}


