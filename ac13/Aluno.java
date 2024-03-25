package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac13;

public class Aluno {
    private int qntAlunos;
    private int qntNotas;
    private double[][] notas;

    public int getQntAlunos() {
        return qntAlunos;
    }

    public void setQntAlunos(int qntAlunos) {
        this.qntAlunos = qntAlunos;
        this.notas = new double[qntAlunos][]; // Initialize the array when qntAlunos is set
    }

    public int getQntNotas() {
        return qntNotas;
    }

    public void setQntNotas(int qntNotas) {
        this.qntNotas = qntNotas;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = new double[qntNotas]; // Initialize the inner arrays when qntNotas is set
        }
    }

    public double getNotas(int alunoIndex, int notaIndex) {
        return notas[alunoIndex][notaIndex];
    }

    public void setNotas(int alunoIndex, int notaIndex, double value) {
        notas[alunoIndex][notaIndex] = value;
    }
}
