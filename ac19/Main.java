package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac19;

public class Main {
    public static void main(String[] args) {
        System.out.println("Carros de luxo");
        System.out.println("----------------------");
        CarroLuxo carrol1 = new CarroLuxo("bmw m3", 814950.00, 3000);
        System.out.printf("Carro: %s\n", carrol1.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrol1.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrol1.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrol1.CalcularDiaria(carrol1.getValor()));
        if (carrol1.VerificarKm(carrol1.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
        System.out.println("----------------------");
        CarroLuxo carrol2 = new CarroLuxo("McLaren Senna", 3400000.00, 1500);
        System.out.printf("Carro: %s\n", carrol2.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrol2.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrol2.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrol2.CalcularDiaria(carrol2.getValor()));
        if (carrol2.VerificarKm(carrol2.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
        System.out.println("----------------------");
        CarroLuxo carrol3 = new CarroLuxo("mercedes gls", 2190000.00, 10000);
        System.out.printf("Carro: %s\n", carrol3.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrol3.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrol3.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrol3.CalcularDiaria(carrol3.getValor()));
        if (carrol3.VerificarKm(carrol3.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
        System.out.println("Carros Básicos");
        System.out.println("----------------------");
        CarroBasico carrob1 = new CarroBasico("vw parati", 19373.00, 170000);
        System.out.printf("Carro: %s\n", carrob1.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrob1.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrob1.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrob1.CalcularDiaria(carrob1.getValor()));
        if (carrob1.VerificarKm(carrob1.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
        System.out.println("----------------------");
        CarroBasico carrob2 = new CarroBasico("ford ka", 46900.00, 45000);
        System.out.printf("Carro: %s\n", carrob2.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrob2.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrob2.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrob2.CalcularDiaria(carrob2.getValor()));
        if (carrob2.VerificarKm(carrob2.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
        System.out.println("----------------------");
        CarroBasico carrob3 = new CarroBasico("chevrolet spin",  120358.00, 67000);
        System.out.printf("Carro: %s\n", carrob3.getDescricao());
        System.out.printf("Valor: R$%.2f\n", carrob3.getValor());
        System.out.printf("Quilometragem: %.2f Km\n", carrob3.getKm());
        System.out.printf("Valor da Diária: R$%.2f\n", carrob3.CalcularDiaria(carrob3.getValor()));
        if (carrob3.VerificarKm(carrob3.getKm()) == true) {
            System.out.println("O carro ultrapassou a quilometragem maxima e deve ser levado a uma concesionaria do grupo imediatamente");
        } else {
            System.out.println("O carro não ultrapassou o limite de quilometragem");
        }
    }
}
