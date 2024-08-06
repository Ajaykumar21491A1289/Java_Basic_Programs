package Basic_Programs;
import java.util.Scanner;
public class Big {

	public static void main(String[] args) {
		int larg=0;
		int arr[]=new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<10;i++) {
			System.out.println("Enter a value ");
			 arr[i]=sc.nextInt();

		}
		for(int i=0; i<10;i++) {
			if(arr[i]>larg) {
				larg = arr[i];
			}
		

		}
		
		System.out.println(larg);
	}

}
