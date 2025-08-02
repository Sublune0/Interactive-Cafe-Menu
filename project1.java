/*
* Assignment: Project1 
* Name: Benjamin Bever
* Date: 07/12/2025
*
* Program Description:
* This program lets the user order one item from a small café menu.
* If they choose coffee, they can pick if they want milk and sugar.
* It then shows the total price and gives a discount if it’s over $25.
*
* Honor Code Statement:
* I affirm that this program is my own work and that I have not
* shared this code or provided unauthorized assistance with it.
*
* Purpose:
* To learn how to take user input, use if and switch, and do math
* in a simple menu program.
*
* Input:
* A menu item number, how many the user wants, and an option for coffee.
*
* Output:
* Shows what was ordered, how many, and the final price.
*
*/

package Lesson4.Project1;

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int menuPick;
        int howMany;
        int coffeeOption = 0;
        double price = 0.0;
        double finalTotal = 0.0;

        System.out.println("Welcome to the Cafe!");
        System.out.println("Please choose an item:");
        System.out.println("1. Coffee - $3.00");
        System.out.println("2. Tea - $2.50");
        System.out.println("3. Sandwich - $6.00");
        System.out.println("4. Muffin - $3.75");
        System.out.println("5. Juice - $2.95");

        System.out.print("Enter item number (1-5): ");
        menuPick = scnr.nextInt();

        if (menuPick == 1) {
            price = 3.00;

            System.out.println("Add milk and sugar?");
            System.out.println("1. Yes (+$0.50)");
            System.out.println("2. No extra charge");
            coffeeOption = scnr.nextInt();

            if (coffeeOption == 1) {
                price = price + 0.50;
            }
        } else if (menuPick == 2) {
            price = 2.50;
        } else if (menuPick == 3) {
            price = 6.00;
        } else if (menuPick == 4) {
            price = 3.75;
        } else if (menuPick == 5) {
            price = 2.95;
        } else {
            System.out.println("Invalid menu choice.");
            scnr.close();
            return;
        }

        System.out.print("Enter quantity: ");
        howMany = scnr.nextInt();

        finalTotal = price * howMany;

        if (finalTotal > 25.00) {
            finalTotal = finalTotal * 0.90;  // Apply 10% discount
        }

        System.out.println("\n--- Order Details ---");

        if (menuPick == 1) {
            System.out.println("Item: Coffee");
            if (coffeeOption == 1) {
                System.out.println("Add-ons: Milk and Sugar");
            } else {
                System.out.println("Add-ons: None");
            }
        } else if (menuPick == 2) {
            System.out.println("Item: Tea");
        } else if (menuPick == 3) {
            System.out.println("Item: Sandwich");
        } else if (menuPick == 4) {
            System.out.println("Item: Muffin");
        } else if (menuPick == 5) {
            System.out.println("Item: Juice");
        }

        System.out.println("Amount: " + howMany);
        System.out.printf("Total: $%.2f\n", finalTotal);

        scnr.close();
    }
}
