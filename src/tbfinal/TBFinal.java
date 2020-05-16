package tbfinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tbfinal.infra.IPessoaDAO;
import tbfinal.infra.ITarefaDAO;
import tbfinal.infra.PessoaDAO;
import tbfinal.infra.TarefaDAO;
import tbfinal.model.Pessoa;
import tbfinal.model.Tarefa;

/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */
public class TBFinal {

    public static void main(String[] args) {
        listaRegistrosPessoas();
        listaRegistrosTarefas();
        listaPessoasRecuperarByTarefa("backend");
    }
    
    private static void listaRegistrosPessoas() {
        IPessoaDAO pdao = new PessoaDAO();
        List<Pessoa> p = pdao.recuperarTodos();
        
        for(Pessoa k : p){
            System.out.println(k);
        }
    }
    
    private static void listaRegistrosTarefas() {
        ITarefaDAO tdao = new TarefaDAO();
        List<Tarefa> t = tdao.recuperarTodos();
        
        for(Tarefa k : t){
            System.out.println(k);
        }
    }
    
    private static void listaPessoasRecuperarByTarefa(String tarefa) {
        IPessoaDAO pdao = new PessoaDAO();
        List<Pessoa> p = pdao.recuperaByTarefa(tarefa);
        
        for(Pessoa k : p){
            System.out.println(k);
        }
    }
    
}
