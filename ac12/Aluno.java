package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac12;

public class Aluno {
    private int qntAlunos;
    private int qntNotas;
    private double [][]notas;

    public int getQntAlunos() {
        return qntAlunos;
    }
    public void setQntAlunos(int qntAlunos) {
        this.qntAlunos = qntAlunos;
        if (this.qntAlunos != 0) {
            this.notas = new double[qntAlunos][qntNotas];
        }
    }
    public int getQntNotas() {
        return qntNotas;
    }
    public void setQntNotas(int qntNotas) {
        this.qntNotas = qntNotas;
        if (this.qntAlunos != 0) {
            this.notas = new double[qntAlunos][qntNotas];
        }
    }
    public double[][] getNotas() {
        return notas;
    }
    public void setNotas(int index1, int index2, double value) {
        notas[index1][index2] = value;
    }
    
}
