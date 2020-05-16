package tbfinal.infra;

/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */

import java.util.List;
import tbfinal.model.Tarefa;

public interface ITarefaDAO {
    public List<Tarefa> recuperarTodos();
}
