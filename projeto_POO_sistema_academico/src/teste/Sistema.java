package teste;

import modelo.Curso;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String opcao = "";
        String opcao2 = "";

        System.out.println("========================");
        System.out.println("Bem vindo ao sistema!");
        System.out.println("========================");
        while(!opcao.equals("4")){
            System.out.println("Digite o NÚMERO da opção desejada:");
            System.out.println("1 - Curso");
            System.out.println("2 - Diciplina");
            System.out.println("3 - Aluno");
            System.out.println("4 - Curso");
            opcao = input.next();

            if(opcao.equals("1")){
                while(opcao2.equals("5")){
                    System.out.println("Digite o NÚMERO da opção desejada:");
                    System.out.println("1 - Inserir curso");
                    System.out.println("2 - Adicionar diciplinas no curso");
                    System.out.println("3 - Remover diciplina do curso");
                    System.out.println("4 - Listar diciplinas do curso");
                    System.out.println("5 - Voltar ao menu inicial");
                    opcao2 = input.next();

                    switch (opcao2){
                        case "1":
                            System.out.println("Digite o nome do curso: ");
                            String nome = input.next();
                            Curso curso = new Curso(nome);
                            System.out.printf("Curso %s criado com sucesso!", curso.getNome());
                            break;
                        case"2":
                            
                    }
                }
            }

        }
    }
}
