public class Escola {

    private String nomeEscola;
    private Cidade cidade;
    private Professor diretor;

    public String getNome() {
        return nomeEscola;
    }

    public Escola setNome(String nome) {
        this.nomeEscola = nome;
        return this;
    }

    public Escolaridade escolaridadeDiretor(){
        return diretor.getEscolaridade();
    }

    public Cidade getCidade() {
        return cidade;
    }

    public Escola setCidade(Cidade cidade) {
        this.cidade = cidade;
        return this;
    }

    public Professor getDiretor() {
        return diretor;
    }

    public Escola setDiretor(Professor diretor) {
        this.diretor = diretor;
        return this;
    }

    public String estadoDoAluno() {
        return this.getCidade().getEstado().getEstado();
    }
}