package hello;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вычисление функции y = x*sqrt(x) + x^3 + e^x");
        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();
        double result = x * Math.sqrt(x) + Math.pow(x, 3) + Math.exp(x);
        System.out.println("y = " + result);
        scanner.close();
    }
}