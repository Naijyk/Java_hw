package homework;

import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = sc.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Число чётное");
        } else if ((number % 2) != 0) {
            System.out.println("Число нечётное");
        }
        sc.close();
    }
}
