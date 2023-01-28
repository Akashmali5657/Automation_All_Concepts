package OtherJava.String;

public class Stringmethods {

    public static void main(String[] args) {
        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String txt2 = "Hello World";
        String txt3 = "Please locate where 'locate' occurs!";

        System.out.println("The length of the txt string is: " + txt1.length());
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"
        System.out.println(txt3.indexOf("locate")); // Outputs 7
        System.out.println("Charater At: " + txt1.charAt(4));
        System.out.println("contains: "+txt2.contains("H"));
        System.out.println("replace: " + txt2.replace("H","h"));
        System.out.println("replace: " + txt2.substring(2));

       //Concatenation
//        String firstName = "John";
//        String lastName = "Doe";
//        System.out.println(firstName + " " + lastName);

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}
