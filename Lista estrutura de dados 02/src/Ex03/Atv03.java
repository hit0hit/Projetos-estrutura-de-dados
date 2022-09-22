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
		        System.out.println ("População em janeiro de 1992: " + calcularPopulacao (anoFinal) + " milhões de habitantes");
		        anoFinal = 1994 ;
		        System.out.println ("População em janeiro de 1994: " + calcularPopulacao (anoFinal) + "milhões de habitantes");

		        //B)
		        populacaoEstimada = 60 ;
		        System.out.println ("Em" + calcularAno (populaçãoEstimada) + "anos, a população será maior que 60 milhões");

		        //C)
		        populacaoEstimada = 50 * 2 ;
		        System.out.println ("Em" + calcularAno (populaçãoEstimada) + "anos, a população será dobrada");
	}

}
