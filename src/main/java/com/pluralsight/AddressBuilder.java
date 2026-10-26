package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        //Getting
        System.out.println("Please provide the following information");

        System.out.println("Full name: ");
        String name = myscanner.nextLine();

        System.out.println("Billing Street: ");
        String billingStreet = myscanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity = myscanner.nextLine();
        System.out.println("Billing State: ");
        String billingState = myscanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip = myscanner.nextLine();
        System.out.println();


        System.out.println("Shipping Street: ");
        String shippingStreet = myscanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = myscanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = myscanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = myscanner.nextLine();
        System.out.println();

        StringBuilder billing = new StringBuilder();
        billing.append().append("\n\n");

        billing.append("Billing Address:\n");



    }

}
