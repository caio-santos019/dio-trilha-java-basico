package funcoes.navegadorInternet;

public class Chrome implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarpagina() {
        System.out.println("Atualizando página");
    }
}
