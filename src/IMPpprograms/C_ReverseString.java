package IMPpprograms;

public class C_ReverseString {
    public static void main(String[] args) {
        String str = "Akash mali";
        int length = str.length();
        String rev=" ";
        for (int i=length-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse String : " +rev);

        //reverse string using buffer class
        StringBuffer sb=new StringBuffer(str);
        System.out.println("Reverse using String Buffer :" + sb.reverse());

        //how to remove junk or Special characters
        String str1 = "@@@@ Akash *&$%";
        String str1Output = str1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("remove junk or Special characters : " + str1Output);
    }
}