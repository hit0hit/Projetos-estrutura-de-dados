package Aula03;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex005 {
    public static void main(String[] args) {
        int opcao;
        ArrayList<Bilhetes> bilhetes = new ArrayList<Bilhetes>();

        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("> 1. Reservar bilhete");
            System.out.println("> 2. Cancelar bilhete");
            System.out.println("> 3. Ver reserva bilhete");
            System.out.println("> 4. Ver todos bilhetes");
            System.out.println("> 5. Sair");
            System.out.print("> ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.print("Nome passageiro: ");
                    String nome = entrada.nextLine();
                    bilhetes.add(new Ex005Bilhetes(nextId(bilhetes), nome));
                    break;
                
                case 2:
                    System.out.print("Id do bilhete: ");
                    int id = entrada.nextInt();
                    CancelarBilhetes(id, bilhetes);
                    System.out.println("Bilhete cancelado");
                    break;

                case 3:
                    System.out.print("Id do bilhete: ");
                    id = entrada.nextInt();
                    if (bilhetes.get(id).Cancelado == true) {
                        System.out.println("BILHETE CANCELADO!");
                    }
                    System.out.println("Bilhete: " + bilhetes.get(id).GetBilhete());
                    break;

                case 4:
                    for (Ex005Bilhetes bilhete : bilhetes) {
                        if (bilhete.Cancelado == false) {
                            System.out.println(bilhete.GetBilhete());
                        }
                    }

                case 5:
                    break;
                default:
                    System.out.println("Opção inválida");

            }

        } while (opcao != 5);

        entrada.close();
    }

    public static int nextId(ArrayList<Ex005Bilhetes> bilhete) {
        return bilhete.size();
    }

    public static void CancelarBilhetes(int id, ArrayList<Ex005Bilhetes> bilhete) {
        bilhete.get(id).Cancelado = true;
    }
}
