import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner pipe = new Scanner(System.in);
        String reg;
        int number = 0;
        double dub = 0.0;
        int rangcheck = 0;



        String phone = SafeInput.getRegExString(in, "Enter phone number: ", "\\d{3}-\\d{3}-\\d{4}");
        System.out.println("Phone: " + phone);


    }
}
