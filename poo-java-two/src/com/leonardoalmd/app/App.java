package com.leonardoalmd.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer f0 = 0;
        Integer f1 = 1;

        System.out.println("Enter the limit: ");
        Integer limit = sc.nextInt();

        while (f1 < limit) {
            Integer fn = f0 + f1;

            if (fn > limit) {
                break;
            }
            System.out.println(fn);
            f0 = f1;
            f1 = fn;
        }
    }
}
