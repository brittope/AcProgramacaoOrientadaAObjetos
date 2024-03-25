package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do comprador: ");
        String nome = sc.nextLine();
        System.out.print("Digite o cpf do comprador: ");
        int cpf = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Digite o número do ingresso: ");
        int numero = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Digite a descrição do show: ");
        String descricao = sc.nextLine();
        Comprador comprador = new Comprador(nome, cpf);
        Ingresso ingresso = new Ingresso(numero, descricao);
        comprador.comprarIngresso(ingresso);
        System.out.println("------------------");
        System.out.println(comprador.resumoTransacao());
        System.out.println("------------------");
        sc.close();
    }
}
