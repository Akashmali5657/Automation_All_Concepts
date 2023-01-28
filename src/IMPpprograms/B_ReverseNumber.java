package IMPpprograms;

public class B_ReverseNumber {
    public static void main(String[] args) {
        int num=123;
        int rev=0;
        while (num !=0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);

        //String Buffer
        int num1=543;
        System.out.println("String Buffer reverse : " + new StringBuffer(String.valueOf(num1)).reverse());
    }
}