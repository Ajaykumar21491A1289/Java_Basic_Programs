package array;
import java.util.Scanner;
public class Transpose{
		
	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int[][] n1=new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter 9 elements");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				n[i][j]=sc.nextInt();
				
			}
		}
     System.out.println("original  matrix");
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
				
			}
			System.out.println();
		
		}
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				n1[i][j]=n[j][i];
				
			}
		}
		System.out.println("transpose matrix");
		
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n1[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		

	}

}
