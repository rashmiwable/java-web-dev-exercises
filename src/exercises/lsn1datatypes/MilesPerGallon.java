package exercises.lsn1datatypes;


import java.util.Scanner;


public class MilesPerGallon {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles: ");

        double miles = Double.parseDouble(input.nextLine());

        System.out.println("How many gallon");

        double gallon = Double.parseDouble(input.nextLine());

        double milesPerGallon = miles/ gallon;

        System.out.println("what are the miles per gallon: "+ milesPerGallon);



    }
}
