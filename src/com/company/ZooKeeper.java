package com.company;

import java.util.Scanner;

public class ZooKeeper {

    public void startPrompt() {
        Scanner scan = new Scanner(System.in);
        boolean playing = true;
        Zoo zoo = new Zoo();

        do {
            System.out.println("Welcome to the Zoo Management System\n" +
                    "What would you like to do?\n" +
                    "** If you would like to add an animal to a pen, you must choose a pen first.**\n" +
                    "** If you do not have any pens setup, please create one**\n" +
                    "1 - Create an animal pen\n" +
                    "2 - Remove an animal pen\n" +
                    "3 - View all pens\n" +
                    "4 - View all animals in zoo\n"
            );

            String userInput = scan.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("What kind of animal pen would you like to create e.g: Lion, Tiger, Bear");
                    userInput = scan.nextLine();
                    Pen pen = new Pen(userInput);
                    System.out.println("Thank you for creating a new pen named: " + pen.getName());
                    zoo.addPen(pen);
                    break;
                case "2":
                    break;
                case "3":
                    zoo.viewAllPens();
                    System.out.println("Please choose the name of the  pen you would like to add animals to");
                    userInput = scan.nextLine();
                    Pen tempSinglePen = zoo.singlePen(userInput);
                    System.out.println("1 - add animal\n" +
                            "2 - add baby animmal");
                    userInput = scan.nextLine();
                    switch(userInput) {
                        case "1":
                            break;
                        case "2":
                            break;
                        default:
                            break;
                    }

                    break;
                case "4":
                    break;
                default:
                    break;
            }
        }while(playing);

    }
}
