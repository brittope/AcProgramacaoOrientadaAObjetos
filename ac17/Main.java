package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac17;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pedro", 20);
        Jogador jogador2 = new Jogador("Anderson", 22);

        Equipe equipe1 = new Equipe("Cruzeiro", "Azul");
        Equipe equipe2 = new Equipe("Atletico-MG", "Preto");

        jogador1.contrato(equipe1);
        jogador2.contrato(equipe2);
        jogador2.contrato(equipe1);

        System.out.println("Equipes de " + jogador2.getNome() + ":");
        for (Equipe equipe : jogador2.getEquipes()) {
            System.out.println(equipe.getNome() + " - " + equipe.getCor());
        }

        System.out.println("\nJogadores em " + equipe1.getNome() + ":");
        for (Jogador jogador : equipe1.getJogadores()) {
            System.out.println(jogador.getNome() + " - (" + jogador.getIdade() + ")");
        }
    }
}
