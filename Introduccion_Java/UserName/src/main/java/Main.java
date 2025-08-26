import java.util.Scanner;

public class Main {
    public static Boolean CodelandUsernameValidation(String str){

        if (str.length()<4 || str.length()>25) {
            return false;
        }
        if (!Character.toString(str.charAt(0)).matches("[a-zA-Z]")) {
            return false;
        }
        if (!str.matches("^[a-zA-Z0-9_]*$")) {
            return false;
        }
        if (Character.toString(str.charAt(str.length()-1)).matches("_")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre de usuario: ");
        var userName = scanner.nextLine();

        System.out.println(CodelandUsernameValidation(userName));
    }
}
