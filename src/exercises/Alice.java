package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);

        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                 "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                 " but it had no pictures or conversations in it," +
                 " 'and what is the use of a book," +
                 "' thought Alice 'without pictures or conversation?'";

        text = text.toUpperCase();

        System.out.println("Enter search term:");

        String searchTerm = input.nextLine();

        searchTerm = searchTerm.toUpperCase();

        int abc = text.indexOf(searchTerm);

        if (abc == -1){
            System.out.println(" search term not found");
        } else {
            System.out.println(" search term found");
        }



    }
}
