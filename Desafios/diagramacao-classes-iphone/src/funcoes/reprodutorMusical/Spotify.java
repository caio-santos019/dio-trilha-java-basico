package funcoes.reprodutorMusical;

public class Spotify implements ReprodutorMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada, pronta pra tocar!");
    }
}
