package Ex06;

public class Atv06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] tabuleiro = {{ 'O' , 'O' , 'X' }, { ' ' , 'X' , 'O' }, { 'X' , 'O' , ' ' }};
        for (int  linha = 0 ; linha < 3 ; linha ++) {
            for (int  coluna = 0 ; coluna < 3 ; coluna ++) {
            	System.out.println(tabuleiro [ linha ][ coluna ]+ " ");
            }
            System.out.println();
        }
	}

}
