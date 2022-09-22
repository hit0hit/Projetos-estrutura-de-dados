package Ex05;

import java.útil.ListaMatriz ;
import java.útil.ListaVinculada ;

public class Atv05 {

	public static void main(String[] args) {
		 	ArrayList < Integer > arrayList = new  ArrayList < Integer >();
	        LinkedList < Integer > linkedList = new  LinkedList < Integer >();
	        long  tempoInicio = System.currentTimeMillis ();
	        for (int  i = 0 ; i < repetições ; i ++) {
	            arrayList . adicionar ( i );
	        }
	        tempoInicio = mostrarTempo ("ArrayList primeiro add: " , tempoInicio);
	        for (int  i = 0 ; i < repetições ; i ++) {
	        	arrayList.adicionar ( i );
	        }
	        tempoInicio = mostrarTempo ("LinkedList primeiro add: " , tempoInicio);
	        for (int  i = 0 ; i < repetições ; i ++) {
	            arrayList.adicionar ( 0 , i );
	        }
	        tempoInicio = mostrarTempo ("ArrayList segundo add: " , tempoInicio);
	        for (int  i = 0 ; i < repetições ; i ++) {
	        	arrayList.adicionar ( 0 , i );
	        }
	        tempoInicio = mostrarTempo ("LinkedList segundo add: " , tempoInicio);
	    }

	    private  static  long  mostrarTempo (String  frase , long  tempoInicio) {
	        long  tempoFim = System.currentTimeMillis();
	        System.out.println ( frase + (tempoFim - tempoInicio));
	         return.currentTimeMillis ();

	}

}
