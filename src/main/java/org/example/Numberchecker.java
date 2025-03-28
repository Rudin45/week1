package org.example;

public class Numberchecker {
    public static boolean isEven(int number){
        return number % 2==0;
    }
    public static void main(String[] args) {
        int number = 8; // cámbialo para probar
        System.out.println("¿Es par? " + isEven(number));
    }
}
