package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac18;

public class CursoAvancado extends Curso{

    private int numac;

    public CursoAvancado(float ap1, float ap2, float ac, int numac) {
        super(ap1, ap2, ac);
        this.numac = numac;
    }

    public float calcular() {
        float total = getAp1() * 3 + getAp2() * 5 + (getAc() /10 * numac) * 2;
        return total / (3 + 5 + 2);
    }
    
}
