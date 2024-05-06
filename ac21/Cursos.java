package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac21;

public enum Cursos {
    
    ADM("Adiministração"),
    CDIA("Ciência de dados & Inteligência Artificial"),
    DIR("Direito"),
    ENP("Engenharia de Produção");

    public final String nomeCompleto;

    Cursos(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}

