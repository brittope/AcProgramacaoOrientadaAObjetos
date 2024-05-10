package ProgramacaoOrientadaAObjetos.AcProgramacaoOrientadaAObjetos.ac24;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = 0;
        while(true){
            try{
                System.out.println("Digite o primeiro numero");
                int x = sc.nextInt();
                System.out.println("Digite o segundo numero");
                int y = sc.nextInt();
                while(true){
                    System.out.printf("Digite a operação desejada \n(1 - Soma/ 2 - Subtração/ 3 - Multiplicação/ 4 - Divisão)\n");
                    z = sc.nextInt();
                    if (z > 4 || z < 1){
                    ;
                    } else {
                        break;
                    }
                }
                Calculadora calc = new Calculadora(x, y, z);
                calc.Calcular();
                System.out.println(calc.getResult());
            } catch(InputMismatchException e){
                System.out.println("Erro: Input inválido");
                ;
            } catch(ArithmeticException e){
                System.out.println("Erro: Atimética");
                ;
            }

            sc.close();
        }
    }
}
