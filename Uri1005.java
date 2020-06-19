import java.util.Scanner;

public class Uri1005{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
       
            double a,b,average;

            a = input.nextDouble();
            b = input.nextDouble();
            
            average = (a * 3.5 + b * 7.5) / 11;

            System.out.printf("MEDIA = %.5f\n",average);
    }
}