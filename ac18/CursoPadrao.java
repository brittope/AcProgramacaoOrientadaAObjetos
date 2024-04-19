package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac18;

public class CursoPadrao extends Curso{
    
    public CursoPadrao(float ap1, float ap2, float ac) {
        super(ap1, ap2, ac);
    }

    public float calcular() {
        return (getAp1() + getAp2() + getAc()) / 3;
    }
}
