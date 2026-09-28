package hello;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int minimum = firstNumber;
        if (secondNumber < minimum) {
            minimum = secondNumber;
        }
        if (thirdNumber < minimum) {
            minimum = thirdNumber;
        }

        int sumOfTwoLargest = firstNumber + secondNumber + thirdNumber - minimum;
        System.out.println("Сумма двух наибольших: " + sumOfTwoLargest);
        scanner.close();
    }
}