package Ex04;

import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		
		float [] temperaturas = new  float [ 3 ];
		Scanner entrada = new Scanner(System.in);
		float  soma = 0 ;
       for (int  i = 0 ; i < 3 ; i ++) {
    	   System.out.println("Digite a temperatura" + i + ": ");
           temperaturas [ i ] = entrada.pr�ximoFloat ();
           soma += temperaturas [ i ];
       }
        m�dia flutuante = soma / 3 ;
        System.out.println("M�dia das temperaturas: " + m�dia);
       for (int  i = 0 ; i <= 2 ; i ++) {
           float  diferenca = media - temperaturas [ i ];
           System.out.println("Diferen�a:" + diferen�a);
       }
       entrada.close();
	}

}
