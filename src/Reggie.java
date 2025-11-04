import java.util.Scanner;
public class Reggie {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String ucID = "";
        String menuChoice = "";

        String regSSN = SafeInput.getRegExString(in,"Enter SSN: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN: " + regSSN);
        ucID = SafeInput.getRegExString(in, "UC ID is: ", "^(M|m)\\d{5}$");
        System.out.println("UC ID: " + ucID);
        menuChoice = SafeInput.getRegExString(in, "Enter menu choice: ", "^[OoSsVvQq]$");
        System.out.println("Menu choice: " + menuChoice);




    }
}
