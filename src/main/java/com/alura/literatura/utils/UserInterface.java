package com.alura.literatura.utils;

public class UserInterface {
    public static void showWelcomeMessage() {
        System.out.println("****************************************** Bienvenido a Literatura ***********" +
                "******************************\n");
    }

    public static void messageLoop() {
        System.out.println("*************************************************************************************" +
                "************************");
        System.out.println("1 - Buscar libro por título");
        System.out.println("2 - Listar libros registrados");
        System.out.println("3 - Listar autores registrados");
        System.out.println("4 - Listar autores vivos en un año determinado");
        System.out.println("5 - Listar libros por idioma");
        System.out.println("6 - Salir");
        System.out.println("*************************************************************************************" +
                "************************");
    }
}
