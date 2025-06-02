

package Aula4_Ex5;

/**
 *
 * @author Aluno
 */
public class main {
    
    public static void main(String[] args) {
        
        ImpressoraJatoDeTinta J = new ImpressoraJatoDeTinta();
        
        System.out.println("Impressora com jato de tinta: \n");
        
        J.imprimir("boleto \n");
        
        ImpressoraLaser L = new ImpressoraLaser();
        System.out.println("Impressora laser: \n");
        
        L.imprimir("nota fiscal");
        
        
    }
    
    
}
