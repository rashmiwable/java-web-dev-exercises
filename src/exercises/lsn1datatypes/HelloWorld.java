// packages
package exercises.lsn1datatypes;

// imports
import java.util.Scanner;

// Main class
public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, what is your name:");

        String name = input.nextLine();


        System.out.println("Hello " + name);

    }
}
