package Basic_Programs;
import java.util.Scanner;

public class Netprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting inputs
        System.out.print("Enter item number: ");
        int itemNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        // Calculating price
        double price = rate * quantity;

        // Calculating discount
        double discount = 0.0;
        if (price >= 100 && price < 200) {
            discount = 0.10 * price;
        } else if (price >= 200 && price < 300) {
            discount = 0.15 * price;
        } else if (price >= 300 && price < 500) {
            discount = 0.20 * price;
        } else if (price >= 500) {
            discount = 0.25 * price;
        }

        // Calculating net price
        double netPrice = price - discount;

        // Displaying the results
        System.out.println("\nItem Number: " + itemNo);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("Net Price: $" + netPrice);
        
        sc.close();
    }
}
