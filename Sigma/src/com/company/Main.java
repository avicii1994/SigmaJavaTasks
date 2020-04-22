package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int currentdir = userInput.nextInt();
        int finaldir = userInput.nextInt();

        int angleDifference = finaldir - currentdir;
        int sign = (int) Math.signum(angleDifference);

        if (Math.abs(angleDifference) == 180)
            System.out.println(Math.abs(angleDifference));
        else if (Math.abs(angleDifference) < 360 - Math.abs(angleDifference))
            System.out.println(angleDifference);
        else
            System.out.println(sign * (Math.abs(angleDifference) - 360 ));
    }
}
