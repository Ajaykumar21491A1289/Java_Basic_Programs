package Basic_Programs;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int num=n,res=0;
        while(n!=0) {
        	int rem=0;
        	rem = n%10;
        	res = res*10 + rem;
        	n = n/10;
        }
        System.out.println(res);
        if(num == res) {
        	System.out.println("it is a palindrome");
        }
        else {
        	System.out.println("Not a palindrome");
        }
	}

}
