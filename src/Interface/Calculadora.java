package Interface;

import java.util.Scanner;

class Calculadora implements OperacaoMatematica {

/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int op1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int op2 = scan.nextInt();

    }*/

    @Override
    public void soma(double op1, double op2) {
        System.out.println("Soma: " + op1 + op2);
    }

    @Override
    public void subtracao(double op1, double op2) {
        System.out.println("Subtração: " + (op1 - op2));
    }

    @Override
    public void multiplicacao(double op1, double op2) {
        System.out.println("Multiplicaçao: " + op1 * op2);
    }

    @Override
    public void divisao(double op1, double op2) {
        System.out.println("Divisão: " + op1 / op2);
    }
}
