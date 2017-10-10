package projetocalculos;

import java.util.Scanner;

public class CalculoGraus {

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        double temperaturaC;
        double temperaturaF;
        int flag = 0;

        System.out.println("Este programa destina-se a converter temperaturas em Celsius para Farenheit, e vice versa.");
        System.out.println("Se você pretende converter Celcios em Farenheit digite 1, se  você pretende converter farenheit em Celcios digite 2");
        flag = lendo.nextInt();

        if (flag == 1) {
            System.out.print("Digite o valor da temperatura em graus Celsius: ");
            temperaturaC = lendo.nextDouble();
            temperaturaF = (temperaturaC * 1.8) + 32;
            System.out.print("O valor da temperatura " + temperaturaC + "°C em graus Farenheit é: " + temperaturaF + "°F.");
        } else {
            System.out.print("Digite o valor da temperatura em Farenheit: ");
            temperaturaF = lendo.nextInt();
            temperaturaC = 5 * (temperaturaF - 32) / 9;
            System.out.print("O valor da temperatura " + temperaturaF + "°F em graus Celcius é: " + temperaturaC + "°C.");
        }
    }

}
