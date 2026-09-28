package hello;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа вычисляет площадь круга по формуле S = pi * r^2");

        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();

        if (radius <= 0) {
            System.out.println("Ошибка: радиус должен быть положительным числом");
            scanner.close();
            return;
        }

        double area = Math.PI * radius * radius;

        System.out.println("Площадь круга равна: " + area);
        scanner.close();
    }
}