package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac17;

import java.util.*;

public class Jogador {
    private String nome;
    private int idade;
    private List<Equipe> equipes;

    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.equipes = new ArrayList<>();
    }

    public void contrato(Equipe equipe) {
        equipes.add(equipe);
        equipe.getJogadores().add(this);
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }
}
