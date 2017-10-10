package projetocalculos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoCirculo {

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);
        double diametro; //Diâmetro = reta que passa pelo centro e em dois pontos do círculo
        double raio;     // Raio = diametro do círculo dividido por 2
        double calculo;  // raio ao quadrado
        double area;     // valor de pi, multiplicado por raio ao quadrado (A=∏*r²)

        System.out.println("Programa que calcula a partir do diametro informado o raio e a área de um circulo ");

        System.out.print("Insira o valor do diâmetro do cículo: ");
        diametro = lendo.nextDouble();
        raio = diametro / 2;
        calculo = raio * raio;
        calculo = calculo * Math.PI;// 3,14 = valor de pi
        area = calculo;

        System.out.println("Seguem abaixo os valores calculados.");

        System.out.println("Diâmetro do círculo: " + diametro + "cm.");
        System.out.println("Raio do círculo: " + raio + "cm.");

        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(area);
        System.out.println("Área do círculo: " + dx + "cm.");
    }

}
