// left Half pyramid
package array;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		System.out.println("enter number of rows");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=n-1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
				if(j==k)
				{
					for(int l=k;l<n;l++)
						System.out.print("*");
					k=k-1;
				}
			}
			System.out.println();
		}

	}

}

//here first for loop will loop to rows same as other loops
//second  for loop will loop for columns
//here we print spaces until we reach end we initialize the k value with no.of rows-1
  
/* enter number of rows
6
      *
     ** 
    ***  
   ****   
  *****    
 ******    


*/