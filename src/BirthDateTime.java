import java.util.Scanner;
public class BirthDateTime {

    public static void main(String[] args) {
        int birthYear;
        int birthMonth = 0;
        int birthDay;

        Scanner in = new Scanner(System.in);
        switch (birthMonth) {
            case 2:
                birthDay = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = 30;
                break;
            default:
                birthDay = 31;
                break;
        }

                birthYear = SafeInput.getRangedInt(in, "Enter Birth Year: ");
                birthMonth = SafeInput.getRangedInt(in, "Enter Birth Month: ");
                birthDay = SafeInput.getRangedInt(in, "Enter Birth Day: ");
                System.out.print("You were born:  " + birthMonth + "/" + birthDay + "/" + birthYear);


        }
    }

