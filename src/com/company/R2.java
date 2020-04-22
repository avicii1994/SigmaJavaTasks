package com.company;

import java.util.Scanner;

public class R2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int R1 = userInput.nextInt();
        int S = userInput.nextInt();
        int R2 = 2*S - R1;
        System.out.println(R2);

    }
}
