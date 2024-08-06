package Basic_Programs;
import java.util.Scanner;
import java.util.Arrays;
public class BigSmall {

	public static void main(String[] args) {
		int[] a= {10,21,13,14,52};
		Arrays.sort(a);
		System.out.println("first smallest"+a[0]);
		System.out.println("second smallest"+a[1]);
		System.out.println("first largest"+a[a.length-1]);
		System.out.println("second largest"+a[a.length-2]);
		System.out.println("mid element is"+a[a.length/2]);
	}

}
