package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac24;

public class Calculadora {
    int x;
    int y;
    int z;
    int result = 0;

    public Calculadora(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void Calcular() {
        if (z == 1) {
            result = x + y;
        } else if (z == 2) {
            result = x - y;
        } else if (z == 3) {
            if (y == 0) {
                throw new ArithmeticException();
            } else {
                result = x * y;
            }
        } else {
            result = x / y;
        }
        
    }

    public int getResult() {
        return result;
    }

    
}
