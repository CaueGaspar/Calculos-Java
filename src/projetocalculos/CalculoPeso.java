package projetocalculos;

import java.util.Scanner;

public class CalculoPeso {

    public static void main(String[] args) {

        Scanner lendo = new Scanner(System.in);
        double altura;
        double calculo;

        System.out.println("Este programa se destina a informar o peso ideal, de acordo com a altura.");

        System.out.print("Digite a sua altura: ");
        altura = lendo.nextDouble();
        calculo = (72.7 * altura) - 58;
  
        System.out.println("Sua média de peso ideal deve ser de " + calculo + "Kg.");
    }

}
