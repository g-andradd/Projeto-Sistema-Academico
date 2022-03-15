package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Diciplina> diciplinas = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarDiciplina(Diciplina diciplina){
        this.diciplinas.add(diciplina);
    }

    public void removeDiciplina(String nomeDiciplina){
        for(Diciplina diciplina : diciplinas){
            if (diciplinas.equals(diciplina)){
                diciplinas.remove(nomeDiciplina);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
