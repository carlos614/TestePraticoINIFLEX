package br.teste.control;

import java.util.*;
import br.teste.*;

public class ControlarFuncionario  {

    private ArrayList <Pessoa> lista;

    public ControlarFuncionario(){

        lista  = new ArrayList<Pessoa>();
    }

    public void inserir (Pessoa p){
    	
    	if(p != null) {

        lista.add(p);
    	}
    }

    public void exibir (){

        if(lista != null && lista.size() > 0){

            for(Pessoa p : lista){
            	
            	System.out.println(p.toString());

            }

        }
             else

                System.out.println("Lista vazia");
        }

    public void excluir (String nome){
    	
    	if(lista != null && lista.size()> 0)

        for(Pessoa p : lista) {

           if(p.getNome().equals(nome)) {
        	   
        	   lista.remove(p);
           }
        }
    }
}
