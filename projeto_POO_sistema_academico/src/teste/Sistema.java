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

        System.out.println("========================");
        System.out.println("Bem vindo ao sistema!");
        System.out.println("========================");
        while (!opcao.equals("4")) {
            System.out.println("Digite o NÚMERO da opção desejada:");
            System.out.println("1 - Curso");
            System.out.println("2 - Diciplina");
            System.out.println("3 - Aluno");
            System.out.println("4 - Curso");
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
                            Curso curso = new Curso(nomeMinusculo);
                            listaDeCursos.add(curso);
                            System.out.printf("Curso %s criado com sucesso!\n", curso.getNome());
                            break;
                        case "2":
                            System.out.println("Lista de cursos:");
                            System.out.println(listaDeCursos);
                            break;
                        case "3":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            nomeMinusculo = nome.toLowerCase(Locale.ROOT);
                            for(Curso cursos : listaDeCursos){
                                if (cursos.getNome().equals(nomeMinusculo)){
                                    listaDeCursos.remove(nomeMinusculo);
                                    System.out.printf("Curso %s removido com sucesso!!\n", nome);
                                    continue;
                                }
                            }
                            break;
                        case "4":
                            System.out.println("Nome do curso: ");
                            nome = input.next();
                            for (Curso cursoRecebeDiciplina : listaDeCursos) {
                                if (cursoRecebeDiciplina.getNome().equals(nome.toLowerCase(Locale.ROOT))) {
                                    System.out.println("Digite o nome da diciplina: ");
                                    nome = input.next();
                                    Diciplina diciplina = new Diciplina(nome.toLowerCase(Locale.ROOT), cursoRecebeDiciplina);
                                    cursoRecebeDiciplina.adicionarDiciplina(diciplina);
                                    listaDeDiciplinas.add(diciplina);
                                    System.out.printf("Diciplina %s adicionada ao curso %s com sucesso!\n", diciplina.getNome(), cursoRecebeDiciplina.getNome());
                                    continue;
                                } else {
                                    System.out.println("Esse curso não existe, primeiro crie o curso digitando 1");
                                }
                            }
                            break;
                        case "5":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            for (Curso cursoRetiraDiciplina : listaDeCursos) {
                                if (cursoRetiraDiciplina.getNome().equals(nome.toLowerCase(Locale.ROOT))) {
                                    System.out.println("Digite o nome da diciplina que deseja remover: ");
                                    nome = input.next();
                                    cursoRetiraDiciplina.removeDiciplina(nome.toLowerCase(Locale.ROOT));
                                    System.out.printf("Curso %s removido com sucesso!\n", nome);
                                    continue;
                                }else{
                                    System.out.println("Curso não encontrado!");
                                }
                            }
                            break;
                        case "6":
                            System.out.println("Digite o nome do curso: ");
                            nome = input.next();
                            for(Curso cursos : listaDeCursos){
                                if(cursos.equals(listaDeCursos)){
                                    System.out.println(listaDeCursos);
                                    continue;
                                }
                            }
                            break;
                    }
                } while (!opcao2.equals("7"));
            } else {
                System.out.println("Opção inválida!!");
            }

        }
    }
}