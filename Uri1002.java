import java.util.Scanner;

public class Uri1002 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double a,n,r;
        n = 3.14159;
        r = input.nextDouble();
        a = n * (r * r);

        System.out.printf ("A=%.4f",a);

    }
}