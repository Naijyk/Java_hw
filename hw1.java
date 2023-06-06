package homeWork;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer you want to integrate into the Decimal: ");
        int a = sc.nextInt();

        System.out.println(a);

        System.out.println("Enter the integer you want to integrate into the Binary: ");
        int b = sc.nextInt();

        System.out.println(Integer.toBinaryString(b));

        System.out.println("Enter the integer you want to integrate into the Octal: ");
        int c = sc.nextInt();

        System.out.println(Integer.toOctalString(c));

        System.out.println("Enter the integer you want to integrate into the Hex: ");
        int d = sc.nextInt();

        System.out.println(Integer.toHexString(d));

        sc.close();
    }
}
