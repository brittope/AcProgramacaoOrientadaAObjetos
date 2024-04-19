package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float ap1 = 0;
        float ap2 = 0;
        float ac = 0;
        int numac = 0;

        System.out.println("Qual o tipo de curso? (1 - Padrão, 2 - Avançado)");
        int tipoCurso = scanner.nextInt();
        while (true) {
            if (tipoCurso != 1 && tipoCurso != 2) {
                System.out.println("Tipo de curso inválido.");
            } else {
                while (true) {
                    System.out.print("Digite a nota da AP1: ");
                    ap1 = scanner.nextFloat();
                    if (ap1 >= 0 && ap1 <= 10) {
                        break;
                    }
                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
                }
                while (true) {
                    System.out.print("Digite a nota da AP2: ");
                    ap2 = scanner.nextFloat();
                    if (ap2 >= 0 && ap2 <= 10) {
                        break;
                    }
                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
                }
                while (true) {
                    System.out.print("Digite a nota da AC: ");
                    ac = scanner.nextFloat();
                    if (ac >= 0 && ac <= 10) {
                        break;
                    }
                    System.out.println("Nota inválida. A nota deve ser entre 0 e 10.");
                }
        
                if (tipoCurso == 1) {
                    CursoPadrao cursoPadrao = new CursoPadrao(ap1, ap2, ac);
                    System.out.println("-------------------------");
                    System.out.println("AP1:         " + cursoPadrao.getAp1());
                    System.out.println("AP2:         " + cursoPadrao.getAp2());
                    System.out.printf("AC:          %.1f\n", cursoPadrao.getAc());
                    System.out.println("Nota final:  " + cursoPadrao.calcular());
                    System.out.println("-------------------------");
                    break;
                } else if (tipoCurso == 2) {
                    while (true) {
                        System.out.print("Digite o numero ACs (1-10):");
                        numac = scanner.nextInt();
                        scanner.nextLine();
                        if (numac > 0 && numac <= 10) {
                            break;
                        }
                        System.out.println("Numero Inválido. O numero de ACs deve ser entre 1 e 10.");
                    }
                    
                    CursoAvancado cursoAvancado = new CursoAvancado(ap1, ap2, ac, numac);
                    System.out.println("-------------------------");
                    System.out.println("AP1:         " + cursoAvancado.getAp1());
                    System.out.println("AP2:         " + cursoAvancado.getAp2());
                    System.out.printf("AC:          %.1f (%d/10)\n", cursoAvancado.getAc(), numac);
                    System.out.println("Nota final:  " + cursoAvancado.calcular());
                    System.out.println("-------------------------");
                    break;
                }
            }
        }
        scanner.close();
    }
}
