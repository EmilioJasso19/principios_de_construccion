import java.io.Console;
import java.io.StringReader;

public class Main {
    public static void main(String[] args) {
        String user;
        char[] pass;

        Console con = System.console();

        System.out.print("Name: ");
        user = con.readLine();

        System.out.print("Password: ");
        pass = con.readPassword();
        String a = String.valueOf(pass);

        System.out.println("Name: " + user);
        System.out.println("Password: " + a);
    }
}