package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac14;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> listaCompra = new ArrayList<Produto>();
        
        int fim=0;
        while(fim==0){
            Produto prod = new Produto();
            System.out.println("Digite o nome do produto: ");
            prod.setNome(sc.nextLine());
            System.out.println("Digite o preco do produto: ");
            prod.setPreco(sc.nextDouble());
            listaCompra.add(prod);
            System.out.println("Deseja adicionar mais produtos? (0 - Sim, 1 - Nao)");
            fim = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Digite o numero de parcelas:");
        int parcelas = sc.nextInt();
        double precoFinal = 0;
        for (Produto produto : listaCompra) {
            precoFinal += produto.getPreco();
        }
        double precoParcelas = precoFinal/parcelas;

        for (Produto produto : listaCompra) {
            System.out.println("Produto: " + produto.getNome() + " - Preco: " + produto.getPreco());
        }
        System.out.printf("Preco final: %.2f\n", precoFinal);
        System.out.printf("Preco das parcelas: %.2f", precoParcelas);

        sc.close();
    }
}
