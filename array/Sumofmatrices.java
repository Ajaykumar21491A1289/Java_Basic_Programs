package array;
import java.util.Scanner;
public class Sumofmatrices {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter rows in first matrix");
	 int r1=sc.nextInt();
	 System.out.println("enter columns in second matric");
	 int c1 = sc.nextInt();
	 System.out.println("enter rows in second matrix");
	 int r2 =sc.nextInt();
	 System.out.println("enter columns in second matrix");
	 int c2=sc.nextInt();
	 int a[][]=new int[r1][c1];
	 int a1[][]=new int[r2][c2];
	 int a2[][]=new int[r2][c2];
	 System.out.println("Enter First Matrix values");
		for(int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
		   a[i][j] = sc.nextInt();
	System.out.println("Enter second Matrix values");
		for(int i=0;i<a1.length;i++)
		for(int j=0;j<a1[i].length;j++)
		   a1[i][j] = sc.nextInt();
		
		for(int i=0;i<a2.length;i++)
		for(int j=0;j<a2[i].length;j++)
			   a2[i][j] = a[i][j] + a1[i][j];
		System.out.println("Sum of Matrices");
		
		for(int i=0;i<a2.length;i++)
		{
		   for(int j=0;j<a2[i].length;j++)
		     System.out.print(a2[i][j]+" ");
		   System.out.println();
		}



	}

}
