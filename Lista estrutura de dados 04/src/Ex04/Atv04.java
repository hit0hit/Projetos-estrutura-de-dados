package Ex04;

import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		
		Repository ListaVetor = new  ListaVetor ();
		System.out.println ("Adicionando 5 elementos na lista:");
        repository.adicionar ( 10 );
        repository.adicionar ( 20 );
        repository.adicionar ( 30 );
        repository.adicionar ( 40 );
        repository.adicionar ( 50 );
        repository.showAll ();

        System.out.println ("Adicionando um elemento no in�cio da lista:");
        repository.dicionar ( 0,7 ) ; _
        reposit�rio.showAll ();

        System.out.println ("Adicionando um elemento no meio da lista:");
        repository.adicionar ( 3 , 8 );
        repository.showAll ();

        System.out.println ("Adicionando um elemento no final da lista:");
        repository.adicionar ( 9 );
        repository.showAll ();

        System.out.println ("Tamanho da lista: " + repository.tamanho ());

        System.out.println ("Elemento na posi��o 3: " + repository.pegar ( 3 ));

        System.out.println ("�ndice do n�mero 30: " + repository.indiceDe ( 30 ));

        System.out.println ("�ndice do n�mero 30: " + repository.contem ( 30 ));

        System.out.println ("Removendo no in�cio da lista:");
        repository.remover ( 0 );
        repository.showAll ();

        System.out.println ("Removendo no meio da lista:");
        repository.remover ( 2 );
        repository.showAll ();

        System.out.println ("Removendo no fim da lista:");
        repository.remover ( 5 );
        repository.showAll ();

        System.out.println ("Removendo todos os elementos da lista:");
        repository.removeAll ();
        repository.showAll ();
	}

}
