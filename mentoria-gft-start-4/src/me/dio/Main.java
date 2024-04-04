package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua funcionário", "Complemento endereço funcionário", "bairro funcionário");
        System.out.println(endereco);
        System.out.println("------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Caio vendedor");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        System.out.println("------");
        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Caio Op Caixa", "789.456.123-00", 2000d, endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("------");
        Gerente gerente = new Gerente();
        gerente.setNome("Caio gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);
    }
}