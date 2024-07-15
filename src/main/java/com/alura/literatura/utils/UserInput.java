package com.alura.literatura.utils;

import java.util.Scanner;

public class UserInput {

    public static int getUserInt(Scanner sc) {
        int input = -1;

        if (sc == null) {
            return input;
        }

        if(sc.hasNextInt()){
            input = sc.nextInt();
        }

        return input;
    }
}
