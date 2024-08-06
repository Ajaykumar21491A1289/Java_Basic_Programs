package Basic_Programs;

import java.util.Scanner;

public class Linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        System.out.println("Enter 5 Values");
        for (int i = 0; i < n.length; i++)
            n[i] = sc.nextInt();
        
        System.out.println("Enter value to search");
        int key = sc.nextInt();
        
        boolean flag = search(n, key);
        if (flag)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        sc.close();
    }

    public static boolean search(int[] n, int key) {
        boolean flag = false;
        for (int i = 0; i < n.length; i++) {
            if (key == n[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
