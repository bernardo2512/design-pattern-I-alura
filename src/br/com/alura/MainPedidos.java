package br.com.alura;

import br.com.alura.pedido.GeraPedido;
import br.com.alura.pedido.GeraPedidoHandler;
import br.com.alura.pedido.acao.EnviarEmailPedido;
import br.com.alura.pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

//Command / Command Handler
public class MainPedidos {
    public static void main(String[] args) {
        //Dados vindo de uma interface qualquer.
        String cliente = "Ana";
        BigDecimal valorOrcamento = new BigDecimal("300");
        Integer quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente,valorOrcamento,quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBanco(),new EnviarEmailPedido())
        );
        handler.execute(gerador);
    }
}
