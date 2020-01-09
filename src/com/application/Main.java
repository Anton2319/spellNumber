package com.application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> numberPos = new ArrayList();
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int number = Integer.parseInt(inputString);
        toSpell(number);
    }

    public static void toSpell(int number) {
        if(getCountsOfDigits(number) > 8) {
            System.out.println("Numbers higher than 999 millions is not supported");
            System.exit(0);
        }
        String decimals[] = {"hundred", "thousand", "million"};
        String numbers[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int lenght = numberPos.size();
        for(int i = lenght - 1; i >= 0; i--) {
            if(i>7) {
                if(numberPos.get(i) == 1) {
                    System.out.println();
                }
                if(numberPos.get(i) == 2) {
                    System.out.println();
                }
                if(numberPos.get(i) == 3) {
                    System.out.println();
                }
                if(numberPos.get(i) == 4) {
                    System.out.println();
                }
                if(numberPos.get(i) == 5) {
                    System.out.println();
                }
                if(numberPos.get(i) == 6) {
                    System.out.println();
                }
                if(numberPos.get(i) == 7) {
                    System.out.println();
                }
                if(numberPos.get(i) == 8) {
                    System.out.println();
                }
                if(numberPos.get(i) == 9) {
                    System.out.println();
                }
            }
        }
    }
    public static int getCountsOfDigits(int number) {
        //Ну а чо звучит хайпово
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            double numberDouble = number;
            count++;
            numberDouble /= 10;
            numberPos.add(getNumberAfterComma(numberDouble));
            number /= 10;
        }
        return count;
    }
    public static int getNumberAfterComma(double number) {
        Double d = number;
        int i = Integer.parseInt(d.toString().split("\\.")[1]);
        return i;
    }
}
