package Ex03;

public class Atv03 {

	public static void main(String[] args) {
		double  calcularPopulacao () {
		double  populacaoBase = 50 , crescimento = 1,02 , populacao ;
		int  anoInicial = 1991 ;

		        populacao = populacaoBase ;
		        for ( int  i = 0 ; i < ano - anoInicial ; i ++) {
		            populacao = populacao * crescimento ;
		        }
		        return  populacao ;
		    }

		    private  static  int  calcularAno (double  populacaoFinal) {
		    	Double  populacao = 50 , crescimento = 1,02 ;
		        int  contAno = 0 ;

		        while (populacao <= populacaoFinal) {
		            populacao = populacao * crescimento ;
		           
		            contaAno ++;
		        }

		        return  contaAno ;
		    }
s
		    public  static  void  main (String [] args) {
				Double  populacaoEstimada ;
		        int  anoFinal ;

		        //A)
		        anoFinal = 1992 ;
		        System.out.println ("Popula��o em janeiro de 1992: " + calcularPopulacao (anoFinal) + " milh�es de habitantes");
		        anoFinal = 1994 ;
		        System.out.println ("Popula��o em janeiro de 1994: " + calcularPopulacao (anoFinal) + "milh�es de habitantes");

		        //B)
		        populacaoEstimada = 60 ;
		        System.out.println ("Em" + calcularAno (popula��oEstimada) + "anos, a popula��o ser� maior que 60 milh�es");

		        //C)
		        populacaoEstimada = 50 * 2 ;
		        System.out.println ("Em" + calcularAno (popula��oEstimada) + "anos, a popula��o ser� dobrada");
	}

}
