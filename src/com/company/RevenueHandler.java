package com.company;

import java.util.Scanner;

public class RevenueHandler {
    public static void main(String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int noOfCases = sc.nextInt();
            long revenue, revenueWithAdvertisment, costOfAdvertising;

            while (noOfCases > 0) {
                revenue = sc.nextLong();
                revenueWithAdvertisment = sc.nextLong();
                costOfAdvertising = sc.nextLong();
                long expectedProfitWithAdvertising = revenueWithAdvertisment - costOfAdvertising;
                if (expectedProfitWithAdvertising == revenue) {
                    System.out.println("does not matter");
                } else if (expectedProfitWithAdvertising > revenue) {
                    System.out.println("advertise");

                } else {
                    System.out.println("do not advertise");
                }
                noOfCases--;
            }
        }
    }
}
