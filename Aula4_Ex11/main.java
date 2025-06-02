

package Aula4_Ex11;

/**
 *
 * @author Aluno
 */
public class main {
    public static void main(String[] args) {
        
        JogoCartas c = new JogoCartas();
        
        JogoTabuleiro t = new JogoTabuleiro();
        
        JogoVideoGame v = new JogoVideoGame();
        
        c.IniciarJogo();
        c.Jogar();
        c.finalizarJogo();
        System.out.println("\n");
        t.IniciarJogo();
        t.Jogar();
        t.finalizarJogo();
        System.out.println("\n");
        v.IniciarJogo();
        v.Jogar();
        v.finalizarJogo();
        
        
        
    }
}
