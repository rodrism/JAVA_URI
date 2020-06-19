import java.util.Scanner;

public class Uri1006 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float a,b,c,average;

        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();

        average = (a * 2 + b * 3 + c * 5) / 11;

        System.out.printf("MEDIA = %.1f",average);
    }
}