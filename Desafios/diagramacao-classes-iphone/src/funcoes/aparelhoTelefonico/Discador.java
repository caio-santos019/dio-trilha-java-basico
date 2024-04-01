package funcoes.aparelhoTelefonico;

public class Discador implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Realizando ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
