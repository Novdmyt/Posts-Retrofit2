package org.app.view;

import java.util.Scanner;

public class AppView {
    private final Scanner scanner = new Scanner(System.in);

    public void getOutput(String output) {
        System.out.println(output);
        scanner.close();
        System.exit(0);
    }
    private static void getMenu() {
        System.out.println(""" 
                                                   
                _________ MENU __________
                1 - Get all posts.
                2 - Get post by id.
                0 - Close the application.
                """);
    }
    public String chooseOption() {
        getMenu();
        return scanner.nextLine();
    }
}
