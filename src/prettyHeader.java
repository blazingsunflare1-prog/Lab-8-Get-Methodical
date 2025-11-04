import java.util.Scanner;

public class prettyHeader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pretMes = "";

        pretMes = SafeInput.PrettyHeader(in,"Insert msg here:  ");
        System.out.print(pretMes);

    }
}
