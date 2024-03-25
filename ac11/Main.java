package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.print("Digite a quantidade de notas: ");
        aluno.setQntNotas(sc.nextInt());
        
        for (int i = 0; i < aluno.getQntNotas(); i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            aluno.setNotas(i,sc.nextDouble());
        }

        System.out.print("Nome: " + aluno.getNome());
        System.out.print("Notas: " +Arrays.toString(aluno.getNotas()));

        sc.close();
    }
    
}
