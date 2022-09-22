package Ex02;

import java.util.Scanner;
import java.util.ListaMatriz ;

public class Atv02 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
	
		        int  opcao ;
		        ArrayList < Ex005Bilhetes > entradas = new  ArrayList < Ex005Bilhetes >();

		            do {
		        	System.out.println ();
		        	System.out.println ("> 1. Bilhete de reserva");
		        	System.out.println ("> 2. Cancelar bilhete");
		        	System.out.println ("> 3. Ver reserva do bilhete");
		        	System.out.println ("> 4. Ver todos os bilhetes");
		        	System.out.println ("> 5. Sair");
		        	System.out.println (">");
		            opcao = entrada.nextInt ();
		            System.out.println ();

		            switch ( opcao ) {
		            case  1 :
		                	System.out.println ("Nome passageiro: ");
		                    String  nome = entrada.nextLine ();
		                    add (new  Ex005Bilhetes (nextId (notas), nome));
		                    break ;

		                    case  2 :
		                	System.out.print ("Id do bilhete: ");
		                    int  id = bilhete ();
		                    CancelarBilhetes (id , bilhetes);
		                    System.out.println ("Cancelamento de Bilhete");
		                    break ;

		                    case  3 :
		                	System.out.println ("Id do bilhete: ");
		                    id = c ();
		                    if (bilhetes . get (id). Cancelado == true) {
		                    	System.out.println ("BILHETE CANCELADO!");
		                    }
		                    System.out.println ("Bilhete: " + ticket.get(id).GetBilhete ());
		                    break ;

		                    case  4 :
		                    for (Ex00 Bilhetes  bilhete : bilhetes 5) {
		                        if (bilhete . Cancelado == false) {
		                        	System.out.println (ticket.GetBilhete ());
		                        }
		                    }

		                    case  5 :
		                	break ;
		                padrão :
		                	System.out.println ("Opção inválida");

		            }

		        } while (opcao != 5);

		        entrada.close ();
		    }

		    public  static  int  nextId (ArrayList < Ex005Bilhetes > bilhete) {
		    	return bilhete.tamanho ;
		    }

		    public  static  void  CancelarBilhetes (int  id , ArrayList < Ex005Bilhetes > bilhete) {
		        bilhete.obter(id).Cancel = true ;
	}

}
