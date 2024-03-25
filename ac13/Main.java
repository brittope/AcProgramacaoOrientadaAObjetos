package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.print("Digite a quantidade de alunos: ");
        aluno.setQntAlunos(sc.nextInt());
        System.out.print("Digite a quantidade de notas: ");
        aluno.setQntNotas(sc.nextInt());
        sc.close();

        int i; 
        for (i = 0; i < aluno.getQntAlunos(); i++) {
            for (int j = 0; j < aluno.getQntNotas(); j++) {
                System.out.print("Digite a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno: ");
                aluno.setNotas(i, j, sc.nextDouble());
            }
        }

        int aprovados = 0;
        int reprovados = 0;
        for (i = 0; i < aluno.getQntAlunos(); i++) {
            double total = 0;
            for (int j = 0; j < aluno.getQntNotas(); j++) {
                total += aluno.getNotas(i, j);
            }
            double media = total / aluno.getQntNotas();
            if (media >= 7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        double percentualAprovados = (double) aprovados / aluno.getQntAlunos() * 100;
        double percentualReprovados = (double) reprovados / aluno.getQntAlunos() * 100;

        System.out.println("Percentual de alunos aprovados: " + percentualAprovados + "%");
        System.out.println("Percentual de alunos reprovados: " + percentualReprovados + "%");

    }
}