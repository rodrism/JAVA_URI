import java.util.Scanner;

public class Exercicio2b {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float area,base,altura;

        System.out.print("Insira o tamanho da base: ");
        base = input.nextFloat();
        System.out.print("Insira a altura: ");
        altura = input.nextFloat();
        area = base * altura;
        System.out.println("A area do retangulo é: " + area);


    }
}