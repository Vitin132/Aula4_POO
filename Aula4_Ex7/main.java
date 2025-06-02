

package Aula4_Ex7;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {
        
        Pagamento C = new PagamentoCartao();
        Pagamento B = new PagamentoBoleto();
        Pagamento P = new PagamentoPix();
        
        C.processarPagamento(500);
        
        
        B.processarPagamento(250);
        
        
        P.processarPagamento(1000);
        
        
        
    }
 
    
   
    
}
