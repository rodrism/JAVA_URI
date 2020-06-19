import java.util.Scanner;

public class Exercicio4 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float valorHora, qtdHoras, descontoInss, salarioLiquido;

        //Entrada
        System.out.print("Insira o valor da Hora: ");
        valorHora = input.nextFloat();
        System.out.print("Insira a quantidade de horas trabalhadas: ");
        qtdHoras = input.nextFloat();
        System.out.print("Insira o % de desconto do INSS: ");
        descontoInss = input.nextFloat();
        descontoInss = descontoInss / 100f; 

        //Processamento
        salarioLiquido = (valorHora * qtdHoras);
        salarioLiquido = salarioLiquido - salarioLiquido * descontoInss;

        //Saida 
        System.out.printf("O salário liquido é:  %.2f\n", salarioLiquido);

    }
}