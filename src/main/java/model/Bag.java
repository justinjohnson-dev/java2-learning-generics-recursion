package model;

import interfaces.IBag;
import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Scanner input = new Scanner(System.in);
        log("Which type of bag do you want? sorted/unsorted: ");
        String userChoice = input.next();

        IBag bag = createUserBag(userChoice);

        log("");
        log("How many items to put in the bag? ");
        int numberOfItems = input.nextInt();
        for (int i = 0; i <= numberOfItems -1; i++) {
            log("Enter item " + (i+1) + ":");
            String item = input.next();
            bag.add(item);
        }

        log("");
        log("You can check if something is in the bag.");
        boolean isDone = true;
        while(isDone) {
            log("Check for (type done to stop): ");
            String usersCheck = input.next();
            if (usersCheck.equals("done")) {
                isDone = false;
            } else {
                String msg = bag.contains(usersCheck)
                        ? "Yes, it's in the bag."
                        : "No, it's not in the bag.";
                log("");
                log(msg);
            }
        }

        log("");
        log("Let's remove stuff from the bag:");
        while (!bag.empty()) {
            if (!bag.empty()) {
                log("Removing item: " + bag.remove());
            }
        }
    }

    private static void log(String m) {
        System.out.println(m);
    }

    private static IBag createUserBag(String typeOfBag) {
        if (typeOfBag.equals("sorted")) {
            return new SortedBag<>();
        } else {
            return new UnsortedBag<>();
        }
    }
}
