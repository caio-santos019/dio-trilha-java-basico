package Iphone;

import funcoes.multifuncional.Celular;

public class Iphone {
    public static void main(String[] args) {
        Celular celular = new Celular();

        System.out.println("Spotify");
        celular.selecionarMusica();
        celular.tocar();
        celular.pausar();

        System.out.println("Google Chrome");
        celular.exibirPagina();
        celular.atualizarpagina();
        celular.adicionarNovaAba();

        System.out.println("Discador");
        celular.atender();
        celular.iniciarCorreioVoz();
        celular.ligar();
    }
}
