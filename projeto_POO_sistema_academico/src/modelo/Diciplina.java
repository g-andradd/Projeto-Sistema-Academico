package modelo;

public class Diciplina {

    private String nome;
    private static Curso curso;
    private Periodo periodo;

    public Diciplina(String nome, Curso curso, Periodo periodo){
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static Curso getCurso() {
        return curso;
    }

    public static void setCurso(Curso curso) {
        Diciplina.curso = curso;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return String.format("%s - %s\n", this.nome, this.periodo.getDescricao());
    }
}
