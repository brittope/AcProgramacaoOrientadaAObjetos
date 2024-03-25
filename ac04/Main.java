package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a nota da primeira prova: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite a nota da segunda prova: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = sc.nextInt();

        double media = (n1 + n2) / 2;
        double presenca = ((40 - faltas) / 40.0) * 100;

        System.out.println("\nNome do aluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7 && presenca >= 75) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        sc.close();
    }
}
