package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac11;

public class Aluno {
    private String nome;
    private int qntNotas;
    private double [] notas;

    // Getters and Setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQntNotas() {
        return qntNotas;
    }
    public void setQntNotas(int qntNotas) {
        this.qntNotas = qntNotas;
        this.notas = new double[qntNotas];
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(int index, double value) {
        notas[index] = value;
    }
    
}
