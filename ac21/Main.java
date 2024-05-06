package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código do curso: ");
        String codigo = sc.nextLine();
        sc.close();

        for(Cursos cursos: Cursos.values()) {
            if (cursos.name().equals(codigo)){
                System.out.println(cursos.getNomeCompleto());
            }
        }
    }
}
