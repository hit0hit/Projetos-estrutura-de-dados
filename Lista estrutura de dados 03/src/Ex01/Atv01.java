package Ex01;

public class Atv01 {
int populacao, ano, anoInicial, crescimento;

	public static void main(String[] args) {
		for ( int  i = 0 ; i < ano - anoInicial ; i ++) {
            populacao = populacao * crescimento ;
        }
        return  populacao ;
         }

    private  static  int  calcularAno (double  populacaoFinal) {
    	Double  popula��o = 50 , crescimento = 1,02 ;
        int  contAno = 0 ;
        while ( populacao <= populacaoFinal ) {
            populacao = populacao * crescimento ;
          
            contaAno ++;
        }
        return  contaAno ;
    }
    public  static  void  main (String [] args) {
    	Double  populacaoEstimada ;
        int  anoFinal ;
        
        //UMA)
        anoFinal = 1992 ;
        System.out.println ("Popula��o em janeiro de 1992: " + calcularPopulacao (anoFinal) + " milh�es de habitantes");
        anoFinal = 1994 ;
        System.out.println ("Popula��o em janeiro de 1994: " + calcularPopulacao (anoFinal) + "milh�es de habitantes");
        
        //B)
        populacao Estimada = 60 ;
        System.out.println ("Em" + calcularAno (populacaoEstimada) + "anos, a popula��o ser� maior que 60 milh�es");
        //C)
        populacaoEstimada = 50 * 2 ;
        System.out.println ("Em" + calcularAno (populacaoEstimada) + "anos, a popula��o ser� dobrada");
	}

}
