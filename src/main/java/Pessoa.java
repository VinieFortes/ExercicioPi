public class Pessoa {

    private String nome;
    private String localNascimento;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getLocalDeNascimento() {
        return localNascimento;
    }

    public Pessoa setLocalDeNascimento(String localDeNascimento) {
        this.localNascimento = localDeNascimento;
        return this;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public Pessoa setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
        return this;
    }

    public Cidade getNaturalidade() {
        return naturalidade;
    }

    public Pessoa setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
        return this;
    }
}