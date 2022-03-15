package teste;

import modelo.Aluno;
import modelo.Curso;
import modelo.Diciplina;
import modelo.Periodo;

public class Teste2 {
    public static void main(String[] args) {

        Curso curso = new Curso("Curso Teste");
        Diciplina diciplina = new Diciplina("Teste", curso);
        Aluno aluno = new Aluno("1232", "Testando", curso, Periodo.PRIMEIRO_PERIODO);
        curso.adicionarDiciplina(diciplina);
        aluno.setDiciplina(diciplina);

        System.out.println(aluno.getDiciplinas());

    }
}
