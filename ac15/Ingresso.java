package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac15;

public class Ingresso {
    private int numero;
    private String descricao;

    public Ingresso(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return numero + " - " + descricao;
    }
}
