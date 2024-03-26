public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // a ideia para criar um construtor é de analisar
    // quais os atributos relevantes para a existencia de um objeto
    // não é necessário criar construtor para todos os atributos
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
