package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac19;

public class CarroBasico implements Carro{
    private String descricao;
    private double valor;
    private double km;

    public CarroBasico(String descricao, double valor, double km) {
        this.descricao = descricao;
        this.valor = valor;
        this.km = km;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double CalcularDiaria(double valor){
        return valor/2000;
    };

    public boolean VerificarKm(double km) {
        if (km < KMMAX){
            return false;
        } else {
            return true;
        }

    } 
}
