package IMPpprograms;

public class E_PalindromeString {

    public static void main(String[] args) {
        String str="radar";
        String orgStr=str;
        int length=str.length();
        String rev="";

        for (int i=length-1;i>=0;i--){
            rev=rev+ str.charAt(i);
        }
        System.out.println(rev);

        if (str.equalsIgnoreCase(rev)) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
