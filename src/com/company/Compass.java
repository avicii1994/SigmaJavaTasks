package com.company;
import java.util.Scanner;
public class Compass {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int initialAngle = scan.nextInt();
            int finalAngle = scan.nextInt();

            int angleDifference = finalAngle - initialAngle;
            int sign = (int) Math.signum(angleDifference);

            if (Math.abs(angleDifference) <= 360 - Math.abs(angleDifference))
                System.out.println(angleDifference);
            else
                System.out.println(sign * (Math.abs(angleDifference) - 360 ));
        }
    }
}
//first commit