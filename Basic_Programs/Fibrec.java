package Basic_Programs;
import java.util.Scanner;
public class Fibrec {

	public static void main(String[] args) {
		int res = 0;
		System.out.println("enter a value");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		while(n>0) {
			int rem = 0;
			rem=n%10;
			res+=rem*(rem*rem);
			n=n/10;
		}
		if(res == num) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not a Amstrong Number");
		}
		
		
	}

}
