import java.util.Scanner;

public class Uri1037 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        float number;
        
        number = input.nextFloat();

        if (number >=0 && number <= 25){
            System.out.printf ("Intervalo [0,25]\n");
        } else {
            if (number > 25 && number <= 50) {
                System.out.printf ("Intervalo (25,50]\n");
            } else {
                if (number > 50 && number <= 75) {
                    System.out.printf ("Intervalo (50,75]\n");
                } else {
                    if (number > 75 && number <= 100) {
                        System.out.printf ("Intervalo (75,100]\n");
                    } else {
                        System.out.println ("Fora de intervalo");
                    }
                }
            }
        }
    }
}