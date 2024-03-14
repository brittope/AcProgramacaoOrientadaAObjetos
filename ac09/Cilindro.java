package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac09;

public class Cilindro {
    double raio; 
    double altura;
    double area;
    double volume;

    public double calcularArea() {
        area = 2 * 2.14 * raio * (raio + altura);
        return area;
    }
    public double calcularVolume() {
        volume = 2.14 * (Math.pow(raio, 2)) * altura;
        return volume;
    }

    public void imprimirDetalhesCilindro() {
        System.out.println(area);
    }
    
}
