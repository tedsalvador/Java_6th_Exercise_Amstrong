package com.example.amstrong;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es un número de Amstrong: ");
        int number = scanner.nextInt();

        AmstrongChecker checker = new AmstrongChecker();
        boolean isAmstrong = checker.isAmstrong(number);

        if (isAmstrong) {
            System.out.println(number + " es un número de Amstrong.");
        } else {
            System.out.println(number + " no es un número de Amstrong.");
        }

        scanner.close();
    }
}
