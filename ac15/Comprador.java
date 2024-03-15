package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac15;

public class Comprador {
    private String nome;
    private int cpf;
    private Ingresso ingresso;

    public Comprador(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void comprarIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }

    public String resumoTransacao() {
        return "Comprador: " + nome + "\nCPF: " + cpf + "\nIngresso: " + ingresso;
    }
}