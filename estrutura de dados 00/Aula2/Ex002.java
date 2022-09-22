package Aula02;

import java.util.Scanner;


public class Ex002 {
    private static double orcamento(double horas) {
        double salarioHora = 5, salarioBase = 40;
        
        return salarioBase + (salarioHora * horas);
    }

    public static void main(String[] args) {
        double horas;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Total de horas trabalhadas: ");
            horas = entrada.nextDouble();
        }

        System.out.println("Orçamento: R$ " + orcamento(horas));
    }
}
