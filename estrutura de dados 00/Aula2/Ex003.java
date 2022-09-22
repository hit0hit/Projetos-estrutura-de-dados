package Aula02;

import java.util.Scanner;

public class Ex003 {
    private static double gastoPlano(int consultas, double fixo, double var) {
        return fixo + (consultas * var);
    }

    private static void resultado(int consultas) {
        double fixoA = 140, varA = 20, fixoB = 110, varB = 25;

        if (gastoPlano(consultas, fixoA, varA) < gastoPlano(consultas, fixoB, varB)) {
            System.out.println("O plano A é mais econômico!");
            System.out.println("Valor: R$ " + gastoPlano(consultas, fixoA, varA));
        } else if (gastoPlano(consultas, fixoA, varA) > gastoPlano(consultas, fixoB, varB)){
            System.out.println("O plano B é mais econômico!");
            System.out.println("Valor: R$ " + gastoPlano(consultas, fixoB, varB));
        } else {
            System.out.println("Os 2 planos vão ter o mesmo valor");
        }
    }

    public static void main(String[] args) {
        int consultas;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Total de consultas: ");
            consultas = entrada.nextInt();
        }
        
        resultado(consultas);
    }
}
