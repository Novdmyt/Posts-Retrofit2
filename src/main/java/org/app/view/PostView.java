package org.app.view;

import java.util.Scanner;

public class PostView {
    private final Scanner scanner = new Scanner(System.in);

    public String getPostId() {
        System.out.print("\nInput post id: ");
        return scanner.nextLine();
    }
}
