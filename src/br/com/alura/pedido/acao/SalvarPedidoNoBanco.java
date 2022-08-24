package br.com.alura.pedido.acao;

import br.com.alura.pedido.AcaoAposGerarPedido;
import br.com.alura.pedido.Pedido;

public class SalvarPedidoNoBanco implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando dados do pedido no banco!");

    }
}
