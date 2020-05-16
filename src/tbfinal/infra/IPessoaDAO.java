package tbfinal.infra;

/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */

import java.util.List;
import tbfinal.model.Pessoa;

public interface IPessoaDAO {
    public List<Pessoa> recuperarTodos();
    public List<Pessoa> recuperaByTarefa(String tarefa) ;
}
