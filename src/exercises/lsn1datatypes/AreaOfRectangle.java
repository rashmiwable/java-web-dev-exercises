package exercises.lsn1datatypes;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("what is the length of the rectangle: ");

        double length = Double.parseDouble(input.nextLine());

        System.out.println("what is the width of the rectangle: ");

        double width = Double.parseDouble(input.nextLine());

        double area;

        area = length * width;

        System.out.println( "Area of Rectangle is: "+ area);


    }
}
