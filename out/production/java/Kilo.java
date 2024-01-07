package out.production.java;

import java.util.Scanner;

public class Kilo {
 static double miles;
    double kilo;


    public static void main(String[] args) {
        Scanner rz = new Scanner(System.in);
        System.out.println("enter the value in Kilometer :");
        Double kilo  =rz.nextDouble();
        miles = kilo * 0.621371;


        System.out.println("the value in miles is : "+miles+"m");
    }

}
