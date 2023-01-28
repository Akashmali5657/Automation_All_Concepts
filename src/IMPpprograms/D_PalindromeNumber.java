package IMPpprograms;

public class D_PalindromeNumber {
    public static void main(String[] args) {
        int num = 1213;
        int rev=0;
        int org=num;
        while (num !=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        if ( rev == org){
            System.out.println(rev + " is palindrome number.");
        }
        else {
            System.out.println(rev + " is not palindrome number.");
        }
    }
}