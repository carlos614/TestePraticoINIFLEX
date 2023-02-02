package br.teste.app;

import java.util.*;

import br.teste.view.*;

public class FuncionarioApp {

    public static void main (String[] args) {

        FuncionarioView view = new FuncionarioView();

            Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 4 ){

            System.out.println("Seleciona uma opcao:");
            System.out.println("1 - Inserir Funcionario:");
            System.out.println("2 - Excluir");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");

                opcao = scanner.nextInt();

                    switch(opcao) {

                        case 1:
                            view.carregarPessoa();
                            break;

                        case 2:
                             view.excluirFuncionario();
                             break;
                        case 3:
                            view.exibirFuncionario();
                            break;
                        case 4:
           				 System.out.println("saindo...");
           				 scanner.close();
           				 
           }
        }
    }

}
