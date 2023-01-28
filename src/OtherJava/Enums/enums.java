package OtherJava.Enums;

public class enums {

    //Enum is short for "enumerations", which means "specifically listed".
    // An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    // To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. Note that they should be in uppercase letters:
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        Level myVar1 = Level.LOW;
        Level myVar2 = Level.HIGH;
        System.out.println(myVar);
        System.out.println(myVar1);
        System.out.println(myVar2);
    }
}
