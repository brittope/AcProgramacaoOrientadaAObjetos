package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char x = 'n';
        Scanner sc = new Scanner(System.in);
          while (x == 'n') {  
            String nome;
            int matricula;

            // 1
            System.out.print("Nome: "); 
            nome = sc.nextLine();
            System.out.print("Matricula: ");
            matricula = sc.nextInt();
            sc.nextLine();
            Aluno md = new Aluno(nome, matricula);

            // 2
            System.out.print("Ap1: ");
            md.setAp1(sc.nextDouble());
            System.out.print("Ap2: ");
            md.setAp2(sc.nextDouble());
            System.out.print("Ac: ");
            md.setAc(sc.nextDouble());

            // 3
            md.calcularMedia();
            if (md.getMedia() < 70 && md.getMedia() > 30) {
                System.out.print("As: ");
                md.setAs(sc.nextDouble());
                md.calcularMediaAS();
            }

            // 4
            System.out.printf("Nome:       %s\n", md.getNome());
            System.out.printf("Matricula:  %d\n", md.getMatricula());
            System.out.printf("Ap1:        %.1f\n", md.getAp1());
            System.out.printf("Ap2:        %.1f\n", md.getAp2());
            System.out.printf("Ac:         %.1f\n", md.getAc());
            if (md.getAs() != 0) {
                System.out.printf("As:         %.1f\n", md.getNome());
            }
            System.out.printf("Media:      %.1f\n", md.getMedia());
            System.out.printf("Status:     %s\n", md.calcularStatus());
            
            sc.nextLine();
            System.out.print("Sair? (sim/nao) ");
            x = sc.next().charAt(0);
            sc.nextLine();
        }
        sc.close();
    }
}