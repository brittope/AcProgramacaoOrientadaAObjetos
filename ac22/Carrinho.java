package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac22;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private double total;

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos(){
        return produtos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }


    
}
