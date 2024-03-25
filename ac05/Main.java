package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite a operação a ser realizada (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double res = 0;
        switch (op) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    res = n1 / n2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Erro: Operação inválida.");
                sc.close();
                return;
        }

        System.out.println("\nOperação: " + op);
        System.out.println("Resultado: " + res);

        sc.close();
    }
}