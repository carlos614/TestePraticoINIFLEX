package br.teste.view;

import java.math.BigDecimal;
import java.util.*;

import br.teste.Funcionario;
import br.teste.Pessoa;
import br.teste.control.ControlarFuncionario;


public class FuncionarioView {


    private ControlarFuncionario  control;

    public FuncionarioView(){

            control = new ControlarFuncionario();
    }

    public void excluirFuncionario() {

            Scanner scanner = new Scanner (System.in);
            
				System.out.println("Excluir Funcionario: ");
                System.out.println("Nome: ");
                String nome = scanner.nextLine();
                System.out.println("Você digitou: " + nome);

                control.excluir(nome);
			    scanner.close();

        }

        public void carregarPessoa(){

            Scanner scanner = new Scanner(System.in);
            
                System.out.println("Digite o nome do Funcionario: ");
                String nome = scanner.nextLine();

                System.out.println("Digite a Data nascimento: ");
                String dataNascimento = scanner.nextLine();

                System.out.println("Qual é o salario: ");
                BigDecimal salario = scanner.nextBigDecimal();

                System.out.println("Qual é a função desse funcionario: ");
                String funcao = scanner.nextLine();
                
                System.out.println("Dados inseridos com sucesso");

                Pessoa p = new Funcionario(nome, dataNascimento, salario, funcao);

                control.inserir(p);
               

        }

        public void exibirFuncionario(){

            control.exibir();
        }
 }
