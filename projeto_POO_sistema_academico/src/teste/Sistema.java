package teste;

import modelo.Curso;
import modelo.Diciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Curso> listaDeCursos = new ArrayList<>();
        List<Diciplina> listaDeDiciplinas = new ArrayList<>();

        String opcao = "";
        String opcao2 = "";
        String nome = "";
        String nomeMinusculo = "";
        String existeCurso = "";
        String existeDiciplina = "";

        System.out.println("========================");
        System.out.println("Bem vindo ao sistema!");
        System.out.println("========================");
        while (!opcao.equals("4")) {
            System.out.println("Digite o NÚMERO da opção desejada:");
            System.out.println("1 - Curso");
            System.out.println("2 - Diciplina");
            System.out.println("3 - Aluno");
            System.out.println("4 - Sair");
            opcao = input.next();

            if (opcao.equals("1")) {
                do {
                    System.out.println("Digite o NÚMERO da opção desejada:");
                    System.out.println("1 - Inserir curso");
                    System.out.println("2 - Listar cursos");
                    System.out.println("3 - Deletar curso");
                    System.out.println("4 - Adicionar diciplinas no curso");
                    System.out.println("5 - Remover diciplina do curso");
                    System.out.println("6 - Listar diciplinas do curso");
                    System.out.println("7 - Voltar ao menu inicial");
                    opcao2 = input.next();

                    switch (opcao2) {
                        case "1":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for (Curso curso : listaDeCursos) {
                                if (curso.getNome().equals(nomeMinusculo)) {
                                    existeCurso = "existeCurso";
                                    System.out.println("Esse curso já existe, tente outro nome!");
                                    break;
                                }
                            }
                            if (!existeCurso.equals("existeCurso")) {
                                Curso curso = new Curso(nomeMinusculo);
                                listaDeCursos.add(curso);

                                System.out.printf("Curso %s cadastrado com sucesso!\n", nome);
                            }
                            existeCurso = "";
                            break;
                        case "2":
                            if (listaDeCursos.size() > 0) {
                                System.out.println("Lista de cursos:");
                                System.out.println(listaDeCursos);
                            } else {
                                System.out.println("Sem cursos na lista! Por favor, digite 1 para criar.");
                            }
                            break;
                        case "3":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for (Curso cursos : listaDeCursos) {
                                if (cursos.getNome().equals(nomeMinusculo)) {
                                    listaDeCursos.remove(cursos);
                                    System.out.println("Curso removido com sucesso!");
                                    existeCurso = "existeCurso";
                                    break;
                                }
                            }
                            if (!existeCurso.equals("existeCurso")) {
                                System.out.println("Esse curso não existeCurso!");
                            }
                            existeCurso = "";
                            break;
                        case "4":
                            System.out.println("Nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for (Curso cursoRecebeDiciplina : listaDeCursos) {
                                if (cursoRecebeDiciplina.getNome().equals(nomeMinusculo)) {
                                    System.out.println("Digite o nome da diciplina: ");
                                    nome = input.next();
                                    nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                                    existeCurso = "existeCurso";
                                    for (Diciplina diciplina : cursoRecebeDiciplina.getDiciplinas()) {
                                        if (diciplina.getNome().equals(nomeMinusculo)) {
                                            existeDiciplina = "existeDiciplina";
                                            System.out.println("Essa diciplina já existe nesse curso!");
                                            break;
                                        }
                                    }
                                    if (!existeDiciplina.equals("existeDiciplina")) {
                                        Diciplina diciplina = new Diciplina(nomeMinusculo, cursoRecebeDiciplina);
                                        cursoRecebeDiciplina.adicionarDiciplina(diciplina);
                                        listaDeDiciplinas.add(diciplina);
                                        System.out.printf("Diciplina %s adicionada ao curso %s com sucesso!\n", diciplina.getNome(), cursoRecebeDiciplina.getNome());
                                        break;
                                    }
                                }
                            }
                            if (!existeCurso.equals("existeCurso")) {
                                System.out.println("Esse curso não existe! Por favor, digite 1 para criar o curso.");
                            }
                            existeCurso = "";
                            existeDiciplina = "";
                            break;
                        case "5":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for (Curso cursoRetiraDiciplina : listaDeCursos) {
                                if (cursoRetiraDiciplina.getNome().equals(nomeMinusculo)) {
                                    existeCurso = "existeCurso";
                                    System.out.println("Digite o nome da diciplina que deseja remover: ");
                                    nome = input.next();
                                    nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                                    for (Diciplina diciplina : cursoRetiraDiciplina.getDiciplinas()) {
                                        if (diciplina.getNome().equals(nomeMinusculo)) {
                                            cursoRetiraDiciplina.removeDiciplina(diciplina.getNome());
                                            listaDeDiciplinas.remove(cursoRetiraDiciplina.getDiciplinas());
                                            existeDiciplina = "existeDiciplina";
                                            System.out.println(diciplina);
                                            break;
                                        }
                                    }
                                    if (!existeDiciplina.equals("existeDiciplina")) {
                                        System.out.println("Essa diciplina não existe nesse curso!");
                                        break;
                                    }
                                }
                            }
                            if (!existeCurso.equals("existeCurso")) {
                                System.out.println("Curso não encontrado!");
                            }
                            existeDiciplina = "";
                            existeCurso = "";
                            break;
                        case "6":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for (Curso cursos : listaDeCursos) {
                                if (cursos.getNome().equals(nomeMinusculo)) {
                                    existeCurso = "existeCurso";
                                    if (cursos.getDiciplinas().size() > 0) {
                                            System.out.printf("Curso: %s\nLista de diciplinas:\n", cursos.getNome());
                                            System.out.println(cursos.getDiciplinas());
                                    }else{
                                        System.out.println("Não existem diciplpinas nesse curso!");
                                    }
                                }
                            }
                            if (!existeCurso.equals("existeCurso")){
                                System.out.println("Curso não encontrado");
                            }
                            existeCurso = "";
                            break;
                        case "7":
                            System.out.println("Voltando..");
                            break;
                        default:
                            System.out.println("Opção inválida! Digite o número.");
                    }

                }
                while (!opcao2.equals("7"));
            } else {
                System.out.println("Opção inválida! Digite o número");
            }

        }
    }
}
