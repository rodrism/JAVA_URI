import java.util.Scanner; //vou precisar usar a biblioteca Scanner

public class TesteEntrada {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int a,b,c;


        System.out.print("Digite os valores de A e B: ");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = a + b;

        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        System.out.println("Valor de c = " + c);
        System.out.print("Digite o valor de D: ");
        double d = teclado.nextDouble();
        System.out.println("Valor de d = " + d);

    }
}