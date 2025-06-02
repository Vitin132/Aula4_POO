package Aula4_Ex7;

/**
 *
 * @author Aluno
 */
public class PagamentoCartao extends Pagamento {

    @Override
    public void processarPagamento(double valor) {

        System.out.println("Pagamento de " + valor + " efetuado no Cartao.");

    }

}
