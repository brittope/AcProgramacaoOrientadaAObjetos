package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac19;

public class CarroLuxo implements Carro{
    private String descricao;
    private double valor;
    private double km;

    public CarroLuxo(String descricao, double valor, double km) {
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
        if (valor/1000 > 190){
            return 190;
        } else {
            return valor / 1000;
        }
    };

    public boolean VerificarKm(double km) {
        if (km < KMMAX){
            return false;
        } else {
            return true;
        }

    } 
}
