//reverse number triangle pattern
package array;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("Enter number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++) {
        	for(int j=1;j<i;j++) {
        		System.out.print(" ");
        	}
        	for(int j=i;j<=n;j++) {
        		System.out.print(j +" ");
        	}
        	System.out.println();
        }
    }
}
/*
Enter number of rows:
6
1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
*/