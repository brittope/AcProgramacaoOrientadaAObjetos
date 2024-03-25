package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salariototal = 0;
        String[] funcionarios = new String[3];
        double[] salarios = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do funcionário: ");
            funcionarios[i] = sc.nextLine();

            System.out.println("Digite o salário do funcionário: ");
            salarios[i] = sc.nextDouble();
            sc.nextLine();

            salariototal += salarios[i];
        }
        double media = salariototal / 3;

        System.out.println("\nResumo: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário: " + funcionarios[i] + " | Salário: " + salarios[i]);
        }
        System.out.println("Média salarial: " + media);
        sc.close();
    }
}
