

package Aula4_Ex11;

/**
 *
 * @author Aluno
 */
public class JogoVideoGame implements Jogo{

    @Override
    public void IniciarJogo() {
        System.out.println("Insert a coin...");
    }

    @Override
    public void Jogar() {
        System.out.println("Game starting....");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Game Over. Exiting game...");
    }

}
