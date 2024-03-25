package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac10;

public class Aluno {

    // Variables

    private String nome;
    private int matricula;
    private double ap1;
    private double ap2;
    private double ac;
    private double as;
    private double media;


    //Getters & Setters
   
    public String getNome() {
        return nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public double getAp1() {
        return ap1;
    }
    
    public double getAp2() {
        return ap2;
    }
    
    public double getAc() {
        return ac;
    }
    
    public double getAs() {
        return as;
    }
    
    public double getMedia() {
        return media;
    }
    
    public void setAp1(double ap1) {
        this.ap1 = ap1;
    }
    
    public void setAp2(double ap2) {
        this.ap2 = ap2;
    }

    public void setAc(double ac) {
        this.ac = ac;
    }

    public void setAs(double as) {
        this.as = as;
    }


    // Constructor

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    
    // Methods

    public void calcularMedia() {
        media = ap1 * 4 + ap2 * 4 + ac * 2;
    }

    public void calcularMediaAS() {
        if (ap1 > ap2) {
            media = ap1 * 4 + as * 4 + ac * 2;
        } else {
            media = as * 4 + ap2 * 4 + ac * 2;
        }
    }
    
    public String calcularStatus() {
        if (media > 70) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
 
}
