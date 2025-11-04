import java.util.Scanner;
public class FavNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double favDouble = 0;
        int favInt = 0;

        favDouble = SafeInput.getDouble(in, "enter fav double: ");
        System.out.println("fav double: " + favDouble);
        favInt = SafeInput.getInt(in, "enter fav int: ");
        System.out.println("fav int: " + favInt);
    }
}
