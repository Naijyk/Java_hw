package homeWork;

public class Hw3 {
    public static void main(String[] args) {

        // способ 1
        char c1 = 0;
        int q = c1;
        System.out.println(q);

        // способ 2
        char c2 = '0';
        String w = String.valueOf(c2);
        int ww =  Integer.parseInt(w);

        System.out.println(ww);

        // способ 3
        char c3 = '0';
        int e = Character.getNumericValue(c3);

        System.out.println(e);
    }
}
