package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExplodingBatteries {

    int numOfBatteries = 2;
    private final int[][] attempts;

    private ExplodingBatteries(int maxValue) {
        attempts = new int[maxValue + 1][numOfBatteries + 1];
        fillTheArrayWithDP(maxValue);
    }

    private void fillTheArrayWithDP(int maxValue) { // Dynamic Programming
        int battery = 1; // For one battery, number of attempts is same as the threshold current
        for (int current = 0; current < maxValue + 1; current++) {
            attempts[current][battery] = current;
        }

        int current = 1; // For current 1amp, number of attempts for n number of batteries is always one
        for (battery = 0; battery <= numOfBatteries; battery++) {
            attempts[current][battery] = 1;
        }
        for (int i = 2; i < maxValue + 1; i++) {
            for (int j = 2; j < 3; j++) {
                attempts[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x < i; x++) {
                    final int batteryExplodedTries = attempts[x - 1][j - 1];
                    final int batteryNoteExplodedTries = attempts[i - x][j];
                    int temp = Math.max(batteryExplodedTries, batteryNoteExplodedTries) + 1;
                    if (temp < attempts[i][j]) {
                        attempts[i][j] = temp;
                    }
                }
            }
        }

        for (int thresholdCurrent = 2; thresholdCurrent < maxValue + 1; thresholdCurrent++) {
            attempts[thresholdCurrent][numOfBatteries] = Integer.MAX_VALUE;
            for (current = 1; current < thresholdCurrent; current++) {
                final int batteryExplodedTries = attempts[current - 1][numOfBatteries - 1];
                final int batteryNotExplodedTries = attempts[thresholdCurrent - current][numOfBatteries];
                int numOfAttempts = Math.max(batteryExplodedTries, batteryNotExplodedTries) + 1;
                if (numOfAttempts < attempts[thresholdCurrent][numOfBatteries]) {
                    attempts[thresholdCurrent][numOfBatteries] = numOfAttempts;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                final int input = sc.nextInt();
                if (input == 0) {
                    break;
                } else {
                    inputList.add(input);
                }
            }
        }
        final Integer maxValue = Collections.max(inputList);
        ExplodingBatteries explodingBatteries = new ExplodingBatteries(maxValue);
        inputList.forEach(n -> System.out.println(explodingBatteries.getValue(n)));

    }

    private int getValue(int thresholdCurrent) {
        return attempts[thresholdCurrent - 1][numOfBatteries];
    }
}