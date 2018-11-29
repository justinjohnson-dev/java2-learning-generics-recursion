package model;

import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner input = new Scanner(System.in);
        log("Which type of bag do you want? sorted/unsorted: ");
        String userChoice = input.next();
        // decide whether to open SortedBag or UnsortedBag

        log("How many items to put in the bag? ");
        int itemNumber = input.nextInt();
        // will allow the user to add items into the bag using recursion on our add method
    }

    public static void log(String m) {
        System.out.println(m);
    }
}
