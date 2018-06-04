package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!\n");
        System.out.println("You are in a creepy house!  Would you like to go 'upstairs' or into the 'kitchen'?");

        answer = sc.next();
        if (answer.toLowerCase().equals("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the 'refrigerator' or look in a 'cabinet' Where would you like to go?");
            answer = sc.next();
            if (answer.toLowerCase().equals("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" + "Would you like to eat some of the food? (\"yes\" or \"no\")");
                answer = sc.next();
                if (answer.toLowerCase().equals("yes")) {
                    System.out.println("Ok, Then Eat it");
                } else if (answer.toLowerCase().equals("no")) {
                    System.out.println("You die of starvation... eventually.");
                } else {
                    System.out.println("Your input is invalid");
                }

            } else if (answer.toLowerCase().equals("cabinet")) {
                System.out.println("There is Yougurt, would you like to eat, Yes/no?");
                answer = sc.next();
                if (answer.toLowerCase().equals("yes")) {
                    System.out.println("Ok, Then go ahead and eat it");
                } else if (answer.toLowerCase().equals("no")) {
                    System.out.println("You die of starvation... eventually.");
                } else {
                    System.out.println("Your input is invalid");
                }
            } else {
                System.out.println("invalid entry");
                }


        } else if (answer.toLowerCase().equals("upstairs")) {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master 'bedroom'.  There is also a 'bathroom' off the hallway.  Where would you like to go?");
            answer = sc.next();
            if (answer.toLowerCase().equals("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                answer = sc.next();
                if (answer.toLowerCase().equals("yes")) {
                    System.out.println("Ok, Then look at it");
                }
                else if (answer.toLowerCase().equals("no")) {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
                else {
                    System.out.println("Your input is invalid");
                }

            }

        }
    }
}
