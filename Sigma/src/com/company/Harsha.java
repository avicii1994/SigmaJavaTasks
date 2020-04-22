//package com.company;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Harsha {
//    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Enter the direction 1");
//        int dir1 = userInput.nextInt();
//        System.out.println("Enter the direction 2");
//        int dir2 = userInput.nextInt();
//        int oppDir1 = dir1-360;
//        int oppDir2 = dir2-360;
//
//        int case1 = dir1-dir2;
//        int case2 = oppDir1-dir2;
//        int case3 = dir1-oppDir2;
////        System.out.println(case1);
////        System.out.println(case2);
////        System.out.println(case3);
//        int[] shortestDistance = { Math.abs(case1), Math.abs(case2), Math.abs(case3) };
//        Arrays.sort(shortestDistance);
//        System.out.println("the shortest distance is "+ shortestDistance[0]);
////        if (shortestDistance[0] == Math.abs(case1))
////            System.out.println( case1);
////        else
////            if (shortestDistance[0] == Math.abs(case2))
////                System.out.println( case2);
////            else
////                if (shortestDistance[0] == Math.abs(case3))
////                    System.out.println( case3);
//
////        System.out.println("the shortest distance between the two directions is "+ min(case1,case2,case3));
//
//    }
////    public static int min(final int a, final int b, final int c){
////        return Math.min(a, Math.min(b, c));
////    }
//
//    }
//}
