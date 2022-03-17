package teste;

import modelo.*;

import java.math.BigDecimal;
import java.util.List;

public class TestaAluno {
    public static void main(String[] args) {

        Curso curso = new Curso("Engenharia de Software");
        Aluno aluno = new Aluno("9032","Gabriel Almeida", curso);

        Diciplina diciplina = new Diciplina("Programação Orientada a Objetos", curso);
        curso.adicionarDiciplina(diciplina);

        Diciplina diciplina2 = new Diciplina("Estrutura de Dados Avançados", curso);
        curso.adicionarDiciplina(diciplina2);

        System.out.println(diciplina.getCurso());
        System.out.println(diciplina2.getCurso());

        System.out.println(Periodo.values());

        aluno.setCurso(curso);
        System.out.println(curso.getDiciplinas());
        System.out.println(aluno.getCurso());
        aluno.setDiciplina(diciplina);
        aluno.setDiciplina(diciplina2);
        System.out.println(aluno.getDiciplinas());

        Nota notaDiciplina = new Nota(diciplina);
        notaDiciplina.setNotaPrimeiroBimestre(new BigDecimal("6.45"));
        notaDiciplina.setNotaPrimeiroBimestre(new BigDecimal("8.50"));

        Nota notaDiciciplina2 = new Nota(diciplina2);
        notaDiciciplina2.setNotaPrimeiroBimestre(new BigDecimal("5.90"));
        notaDiciciplina2.setNotaPrimeiroBimestre(new BigDecimal("7.35"));

        aluno.setNotas(notaDiciplina);
        aluno.setNotas(notaDiciciplina2);

        System.out.println(aluno.getNotas());
    }
}
