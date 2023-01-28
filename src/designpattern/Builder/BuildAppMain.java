package designpattern.Builder;

public class BuildAppMain {
    public static void main(String[] args) {

        Phone iphone = new PhoneBuilder().setModel("Apple").setOs("IOS").buildPhone();
        System.out.println(iphone);

        Phone androidPhone = new PhoneBuilder().setModel("Nokia").setOs("Android").setCamera("32MP").buildPhone();
        System.out.println(androidPhone);
    }
}
