package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "J@vaPOO";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.println("Digite a senha: ");
            String inputSenha = sc.nextLine();
            tentativas++;

            if (inputSenha.equals(senha)) {
                System.out.println("Senha correta!");
                break;
            } else if (tentativas == 3) {
                System.out.println("Você excedeu o número máximo de tentativas.");
            } else {
                System.out.println("Tentativa " + tentativas + " incorreta, tente novamente.");
            }
        }

        sc.close();
    }
}