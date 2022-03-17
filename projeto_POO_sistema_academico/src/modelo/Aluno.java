package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aluno {

    private String matricula;
    private String nome;
    private List<Nota> notas = new ArrayList<>();
    private Curso curso;
    private Periodo periodo;
    private List<Diciplina> diciplinas = new ArrayList<>();

    public Aluno(String matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(Nota notas) {
        this.notas.add(notas);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplina(Diciplina diciplina) {
        this.diciplinas.add(diciplina);
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
