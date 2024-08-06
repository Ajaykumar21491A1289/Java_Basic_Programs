package array;
import java.util.Scanner;
public class Linear {

	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int key=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		for(int i=0;i<3;i++) 
			for(int j=0;j< 3;j++) 
				n[i][j]=sc.nextInt();
			
		System.out.println("enter the element to search");
		key=sc.nextInt();
		boolean b=false;
		for(int i=0;i<3;i++) {
			for(int j=0;j< 3;j++) {
				if(key == n[i][j]) 
					b=true;
				
				else 
					b=false;
				
			}
		}
		if(b)
			System.out.println("Element found");
		else
			System.out.println("element not found");

	}

}
