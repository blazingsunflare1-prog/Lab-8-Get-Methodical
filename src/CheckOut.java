import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double total = 0.0;
        boolean keepShop = true;

        while (keepShop) {

            double price = SafeInput.getRangedDouble(in, "Enter item price ($0.50 - $10.00): ");
            total += price;

            System.out.println("Item price: " + price);
            System.out.println("Current total: " + total);


            keepShop = SafeInput.getYNConfirm(in, "Do you have more items? Y/N: ");
            System.out.println();
        }


        System.out.printf("Total cost: " + total);
    }
}