package IMPpprograms;

public class A_PrimeNumber {

    static int count;
    static int num = 4;

    public static void main(String[] args) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " Is not prime");
        }
    }
}
