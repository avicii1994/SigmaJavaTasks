package com.company;

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {


    Scanner userInput = new Scanner(System.in);
    int val1 = userInput.nextInt();
    int val2 = userInput.nextInt();

    if(val1 > 0 && val2 > 0){
        System.out.println("1");
    }else if (val1 <0 && val2 >0)
        System.out.println("2");
        else if(val1 <0 && val2 <0)
            System.out.println("3");
        else
        System.out.println("4");

}
}