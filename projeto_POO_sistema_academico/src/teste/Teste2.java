package teste;

import modelo.Aluno;
import modelo.Curso;
import modelo.Diciplina;
import modelo.Periodo;

import java.util.ArrayList;
import java.util.List;

public class Teste2 {
    public static void main(String[] args) {

        List<Curso> listaDeCursos = new ArrayList<>();

        Curso curso = new Curso("Curso Teste");
        Curso curso2 = new Curso("Curso Teste2");
        Diciplina diciplina = new Diciplina("Teste", curso);
        Aluno aluno = new Aluno("1232", "Testando", curso);
        curso.adicionarDiciplina(diciplina);
        aluno.setDiciplina(diciplina);

        System.out.println(aluno.getDiciplinas());

//        listaDeCursos.add(curso);
//        listaDeCursos.add(curso2);

        String valor = "Curso Teste2";
        String existe = "";

        for (Curso cursos : listaDeCursos) {
            System.out.println(cursos.getNome());
            if(cursos.getNome().equals(valor)){
                System.out.println("Esse curso já existe");
                existe = "existe";
            }
        }
        if(!existe.equals("existe")){
            Curso curso3 = new Curso(valor);
            listaDeCursos.add(curso3);
            System.out.println(listaDeCursos);
        }
    }
}
