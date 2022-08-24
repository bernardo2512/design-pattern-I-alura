package br.com.alura;

import br.com.alura.desconto.CalculadoraDeDescontos;
import br.com.alura.imposto.CalculadoraDeImpostos;
import br.com.alura.imposto.ISS;
import br.com.alura.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainDescontos {


    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"),1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
