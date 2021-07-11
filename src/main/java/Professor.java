public class Professor extends Pessoa{

    private Curso curso;

    public Curso getCurso() {
        return curso;
    }
    public Professor setCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public String getEscolaridadeProfessor(){
        return this.getEscolaridade().getEscolaridade();
    }

    public String getTipoDeEnsinoProfessor(){
        return this.getCurso().getTipoEnsino().getTipoEnsino();
    }

    public Professor setContratadoCurso(Curso curso) {
        this.curso = curso;
        return this;
    }

    public TipoEnsino getTipoEnsinoContratado() {
        return curso.getTipoEnsino();
    }

    public Professor getDiretor() {
        return curso.getEscola().getDiretor();
    }

    public Cidade cidadeNascimento() {
        return getNaturalidade();
    }
}