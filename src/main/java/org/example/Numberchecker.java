package org.example;

import java.util.Scanner;

public class Numberchecker {
    public static boolean isEven(int number){
        return number % 2==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int number = scanner.nextInt();
        System.out.println("¿Es par? " + isEven(number));
    }
}
