package src.java;

import java.util.Scanner;

//The purpose of this program is to simulate the shopping process by calculating the costs of the items
//and producing a receipt for the shopping trip.
//CPS 180
//Joseph Eastman
//September 24, 2014

public class StoreReceipt {
    static final double TSHIRT_PRICE = 16.1075;
    static final double CHIPS_PRICE = 1.5215;
    static final double COKE_PRICE = 2.99;
    String a;
    static int numberShirts;
    static int numberChips;
    static int numberCoke;
    static double tshirtTotal = TSHIRT_PRICE * numberShirts;
    static double chipsTotal = CHIPS_PRICE * numberChips;
    static double cokeTotal = (COKE_PRICE + 1.20) * numberCoke;
    static double finalTotal = tshirtTotal + chipsTotal + cokeTotal;
    {
    }   

    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("What's your name?");
        String a = input.nextLine();
        System.out.println("Welcome to Denny's Market, " + a + "! We have the following items for sale:");
        System.out.println("T-shirt     $18.95    15% off");
        System.out.println("Chips       $1.79     15% off");
        System.out.println("Coke        $2.99");
        System.out.println("How many T-shirts do you want?");
        String numberShirts = input.nextLine();
        System.out.println("How many bags of potato chips?");
        String numberChips = input.nextLine();
        System.out.println("What about 12-pack coke?");
        String numberCoke = input.nextLine();
        tshirtTotal = tshirtTotal * .85;
        chipsTotal = chipsTotal * .85;
        tshirtTotal = tshirtTotal * 1.06;
        System.out.println("Your total is: " + finalTotal);

}

}