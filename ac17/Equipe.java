package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac17;

import java.util.*;

public class Equipe {
    private String nome;
    private String cor;
    private List<Jogador> jogadores;

    public Equipe(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        this.jogadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }
}