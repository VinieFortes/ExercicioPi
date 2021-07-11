public class Curso {

    private String nomeCurso;
    private TipoEnsino tipoEnsino;
    private Professor coordenador;
    private Escola escola;

    public Escolaridade escolaridadeCoordenador(){
        return coordenador.getEscolaridade();
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public Curso setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
        return this;
    }

    public String getNome() {
        return nomeCurso;
    }

    public Curso setNome(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        return this;
    }

    public Escola getEscola() {
        return escola;
    }

    public Curso setEscola(Escola escola) {
        this.escola = escola;
        return this;
    }

    public Professor getCoordenador() {
        return coordenador;
    }

    public Curso setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
        return this;
    }
}