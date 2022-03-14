package teste;

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
                    System.out.println("Digite o NÚMERO da opção desejada");
                    System.out.println("1 - Inserir curso");
                    System.out.println("2 - Adicionar diciplinas");
                }
            }

        }
    }
}
