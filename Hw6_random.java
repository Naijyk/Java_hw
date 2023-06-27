package homework;

import java.util.Random;

public class Hw6_random {
    public static void main(String[] args) {

        Random r = new Random();

        int s = r.nextInt(28801); // [0;28800]
        int h = s / 3600;


        System.out.println("Осталось: " + s + " секунд");

        if (h < 1) {
            System.out.println("Осталось менее часа");
        } else if (h == 1) {
            System.out.println("Остался " + h + " час");
        } else if (h == 2 || h == 3 || h == 4) {
            System.out.println("Осталось " + h + " часа");
        } else {
            System.out.println("Осталось " + h + " часов");
        }
    }
}