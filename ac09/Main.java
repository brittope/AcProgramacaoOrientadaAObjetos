package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a Altura do Cilindro: ");
        cilindro.altura = sc.nextDouble();
        System.out.println("Insira o raio do Cilindro: ");
        cilindro.raio = sc.nextDouble();
        System.out.printf("Area: %.2f // Volume: %.2f", cilindro.calcularArea(),cilindro.calcularVolume());
        sc.close();
    }
}
