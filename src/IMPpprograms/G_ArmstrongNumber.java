package IMPpprograms;

public class G_ArmstrongNumber {
    public static void main(String[] args) {
        //153=1x1x+5x5x+3x3x3

        int num = 153;
        int orgNum = num;
        int sum = 0, rem;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + rem * rem * rem;
        }
        if (orgNum == sum) {
            System.out.println(sum + " is Armstrong number.");
        } else {
            System.out.println(sum + " is not Armstrong number.");
        }
    }
}
