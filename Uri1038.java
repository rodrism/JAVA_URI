import java.util.Scanner;

public class Uri1038 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float dog, xSal, xBac, torrada, refri, total;
        int item, qtd;

        dog = 4.00f;
        xSal = 4.50f;
        xBac = 5.00f;
        torrada = 2.00f;
        refri = 1.50f;

        item = input.nextInt();
        qtd = input.nextInt();

        if (item == 1) {
            total = dog * qtd;
            System.out.printf("Total: R$ %.2f\n", total);
        } else {
            if (item == 2) {
                total = xSal * qtd;
                System.out.printf("Total: R$ %.2f\n", total);
            } else {
                if (item == 3) {
                    total = xBac * qtd;
                    System.out.printf("Total: R$ %.2f\n", total);
                } else {
                    if (item == 4) {
                        total = torrada * qtd;
                        System.out.printf("Total: R$ %.2f\n", total);
                    } else {
                        if (item == 5) {
                            total = refri * qtd;
                            System.out.printf("Total: R$ %.2f\n", total);
                        }
                    }
                }

            }

        }

    }
}