package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do cilindro: ");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura do cilindro: ");
        double altura = sc.nextDouble();

        double area = 2 * Math.PI * raio * (raio + altura);
        double volume = Math.PI * raio * raio * altura;

        System.out.printf("\nÁrea do cilindro: %.2f", area);
        System.out.printf("\nVolume do cilindro: %.2f\n", volume);

        sc.close();
    }
}
