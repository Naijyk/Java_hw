package homework;

public class Pizza {

    public double result1, result2, result3, result4, result5, result6, result7;

    public int cal0;

    public int r24 = 12;

    public int r28 = 14;

    public Pizza(int cal0) {

        this.cal0 = cal0;

        pow();
        neg1();
        neg2();
        pow1();
        neg3();
        neg4();
        sub1();

        printResult();
    }

    private void pow() {
        result1 = Math.pow(r24, 2);
    }

    private void neg1() {
        result2 = Math.PI * result1;
    }

    private void neg2() {
        result3 = cal0 * result2;
    }

    private void pow1() {
        result4 = Math.pow(r28, 2);
    }

    private void neg3() {
        result5 = Math.PI * result4;
    }

    private void neg4() {
        result6 = cal0 * result5;
    }

    private void sub1() {
        result7 = result6 - result3;
    }

    public void printResult() {
        System.out.println(result7);
    }


}
