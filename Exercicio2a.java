import java.util.Scanner;

public class Exercicio2a {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float lado,area;

        //Entrada dos dados
        System.out.println("Insira o tamanho do lado: ");
        lado = input.nextFloat();
        area = lado * lado;
        System.out.println("O total da área é: "+ area);

    }
}