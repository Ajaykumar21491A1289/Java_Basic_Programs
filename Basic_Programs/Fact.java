package Basic_Programs;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		int res = 1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a value");
		int num = sc.nextInt();
		for(int i=1; i<=num ; i++)
		{
			res = i*res;
		}
		System.out.println(res);
	}

}
