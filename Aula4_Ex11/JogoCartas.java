

package Aula4_Ex11;

/**
 *
 * @author Aluno
 */
public class JogoCartas implements Jogo{

    @Override
    public void IniciarJogo() {
        System.out.println("Embaralhando cartas...");
    }

    @Override
    public void Jogar() {
        System.out.println("Distribuindo as cartas...");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Recolhendo as cartas...");
    }

}
