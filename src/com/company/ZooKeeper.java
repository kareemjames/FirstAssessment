package com.company;

import java.util.Scanner;

public class ZooKeeper {

    public void startPrompt() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Zoo Management System\n" +
                "What would you like to do?\n" +
                "** If you would like to add an animal to a pen, you must choose a pen first.**\n" +
                "** If you do not have any pens setup, please create one**" +
                "1 - Create an animal pen\n" +
                "2 - Remove an animal pen\n" +
                "3 - View all pens\n" +
                "4 - View all animals in zoo\n"
        );

        String userInput = scan.nextLine();
        switch (userInput) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                break;
        }


    }
}
