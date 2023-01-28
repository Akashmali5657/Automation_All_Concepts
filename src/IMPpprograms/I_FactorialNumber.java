package IMPpprograms;

public class I_FactorialNumber {
    public static void main(String[] args) {
        int num=5;
        int fact=0;

        for (int i=0;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
