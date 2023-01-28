package Oops.Interface;

public class Pig implements Animal {

    @Override
    public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }

    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}