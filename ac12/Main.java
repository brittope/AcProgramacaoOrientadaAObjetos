package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac12;

import java.util.Arrays;
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
        double total = 0;
        for (i = 0; i < aluno.getQntAlunos(); i++) {
            for (int j = 0; j < aluno.getQntNotas(); j++) {
                total += aluno.getNotas()[i][j];
            }
        }
        double media = total / (aluno.getQntAlunos() * aluno.getQntNotas());

        System.out.println("Notas: " + Arrays.deepToString(aluno.getNotas()));
        System.out.println("Media final da turma = " + media);
    }
}
