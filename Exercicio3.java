import java.util.Scanner;

public class Exercicio3 {
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario, kwGasto; 
        float valorKw, valorReais;

        System.out.println("Insira o valor do salario minimo: ");
        salario = teclado.nextFloat();
        valorKw = (salario / 7) / 100;
        System.out.printf("O valor de cada Kw é: = %.2f\n", valorKw ) ;

        System.out.println("Insira a quantidade Kw gasto: ");
        kwGasto = teclado.nextFloat();
        valorReais = kwGasto * valorKw;
        System.out.printf("O valor a ser pago é: = %.2f\n", valorReais);

        valorReais = valorReais - (valorReais * 0.1f);
        System.out.printf("O valor com desconto de 10%% é: = %.2f\n", valorReais);


    }
}