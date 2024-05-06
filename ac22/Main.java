package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        while(true) {
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();
            System.out.println("Digite a quantidade desejada: ");
            int quantidade = sc.nextInt();

            Produto produto = new Produto(nome, preco, quantidade);
            carrinho.adicionarProduto(produto);
            carrinho.setTotal(carrinho.getTotal()+preco*quantidade);

            System.out.println("Sair? (1-Sim/2-Não)");
            int x = sc.nextInt();
            sc.nextLine();
            if (x == 1){
                break;
            }
            
        }
        LocalDateTime fechamento = LocalDateTime.now();
        sc.close();
        List<Produto> lista = carrinho.getProdutos();
        System.out.println("-----------------------------");
        System.out.println("Resumo da compra:");
        System.out.println("---------");
        for (Produto p: lista){
            System.out.printf("%s R$%.2f x%d\n", p.getNome(), p.getValor(), p.getQuantidade());
        }
        System.out.println("---------");
        System.out.println("Total: R$" + carrinho.getTotal());
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm");
        String dataFormatada = fechamento.format(formato1);
        String horaFormatada = fechamento.format(formato2);
        System.out.println(dataFormatada + " " + horaFormatada);
        System.out.println("-----------------------------");
    }
}
