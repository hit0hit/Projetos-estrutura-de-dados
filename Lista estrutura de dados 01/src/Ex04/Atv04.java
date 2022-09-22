package Ex04;

import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		
		float [] temperaturas = new  float [ 3 ];
		Scanner entrada = new Scanner(System.in);
		float  soma = 0 ;
       for (int  i = 0 ; i < 3 ; i ++) {
    	   System.out.println("Digite a temperatura" + i + ": ");
           temperaturas [ i ] = entrada.próximoFloat ();
           soma += temperaturas [ i ];
       }
        mídia flutuante = soma / 3 ;
        System.out.println("Mídia das temperaturas: " + mídia);
       for (int  i = 0 ; i <= 2 ; i ++) {
           float  diferenca = media - temperaturas [ i ];
           System.out.println("Diferença:" + diferença);
       }
       entrada.close();
	}

}
