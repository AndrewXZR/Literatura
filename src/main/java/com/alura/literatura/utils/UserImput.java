package com.alura.literatura.utils;

import java.util.Scanner;

public class UserImput {

    public static <T> T getUserNum(Scanner sc, Class<T> clazz) {
        T input = null;

        if (sc == null) {
            return input;
        }

        try {
            if (Integer.class.equals(clazz) && sc.hasNextInt()) {
                input = clazz.cast(sc.nextInt());
            } else if (Double.class.equals(clazz) && sc.hasNextDouble()) {
                input = clazz.cast(sc.nextDouble());
            }
        } catch (NullPointerException _) {
            System.out.println("Se ha ingresado un caracter no númerico, intente nuevamente.");
        }

        return input;
    }
}
