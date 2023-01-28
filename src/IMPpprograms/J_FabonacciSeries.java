package IMPpprograms;

public class J_FabonacciSeries {
    public static void main(String[] args) {
        int num=7, t1=0, t2=1,sum=0;

        for (int i=1;i<=num;i++){
            System.out.println(t1 + " ");
            sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
