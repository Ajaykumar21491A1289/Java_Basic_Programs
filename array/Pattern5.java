package array;
import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        System.out.println("Enter number of rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 0;

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            spaces++;
            System.out.println();
        }
        sc.close();
    }
}
/*
Enter number of rows:
6
******
 *****
  ****
   ***
    **
     *
*/