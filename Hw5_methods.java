package homework;

public class Hw5_methods {
    public static void main(String[] args) {

        int cal0 = 40;

        Pizza pizza = new Pizza(cal0);

        // simple 

        double delta = (cal0 * (Math.PI * Math.pow(14,2))) - (cal0 * (Math.PI * Math.pow(12,2)));
        System.out.println(delta);
        // S = p * r^2
        // (1) cal24 = cal0 * ( p * r^2)
        // pow, neg1, neg2
        // delta = s2 - s1
        // delta = (cal0(PI * r^2)) - (cal0(PI * r^2))

    }
}



