package Basic_Programs;
import java.util.Scanner;

public class Enclosers {

    public static void main(String[] args) {
    	System.out.println("enter a Capital Character ");
        Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        
        switch(ch) {
            case 'A':
            case 'D':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':  
                System.out.println("1 encloser");
                break;
            case 'B':
                System.out.println("2 enclosers");
                break;
            default:
                System.out.println("0 enclosers");
        }
        
    }
}
