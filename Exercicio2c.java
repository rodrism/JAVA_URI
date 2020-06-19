import java.util.Scanner;

public class Exercicio2c {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float area,base,altura;
        
        System.out.print("Insira o valor para base: ");
        base = input.nextFloat();
        System.out.print("Insira o valor para altura: ");
        altura = input.nextFloat();
        area = (base*altura)/2;
        System.out.println("A área do triangulo é: " + area);

    }
}