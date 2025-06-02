

package Aula4_Ex11;

/**
 *
 * @author Aluno
 */
public class JogoTabuleiro implements Jogo{

    @Override
    public void IniciarJogo() {
        System.out.println("Organizando as peças...");
    }

    @Override
    public void Jogar() {
        System.out.println("Começando a rodada...");
    }

    @Override
    public void finalizarJogo() {
        System.out.println("Encerrando a rodada...");
    }

}
