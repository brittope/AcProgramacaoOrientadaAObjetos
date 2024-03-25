package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("\nValores inseridos: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Δ = " + delta);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);

        sc.close();
    }
}
