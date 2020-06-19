import java.util.Scanner;

public class Uri1018{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        int valor, nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;

        valor = input.nextInt();

        nota100 = valor / 100;
        resto = nota100 % 100;
        nota20 = nota50 / 50;
        nota10 = nota20 % 50;
        nota5 = nota10 / 5;
        nota2 = nota5 % 5;
        nota1 = nota2 / 1;
        
        System.out.println (valor);
        System.out.println (nota100 + " nota(s) de R$ 100,00");
        System.out.println (nota50 + " nota(s) de R$ 50,00");
        System.out.println (nota20 + " nota(s) de R$ 20,00");
        System.out.println (nota10 + " nota(s) de R$ 10,00");
        System.out.println (nota5 + " nota(s) de R$ 5,00");
        System.out.println (nota2 + " nota(s) de R$ 2,00");
        System.out.println (nota1 + " nota(s) de R$ 1,00");

    }
}