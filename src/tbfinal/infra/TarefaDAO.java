package tbfinal.infra;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tbfinal.model.Pessoa;
import tbfinal.model.Tarefa;

/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */
public class TarefaDAO implements ITarefaDAO{

    @Override
    public List<Tarefa> recuperarTodos() {
        List<Tarefa> tarefas = new ArrayList<>();

        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            //solicita ao gerenciador todas as instâncias da classe Lembrete
            Query query = em.createQuery("from Tarefa");
            tarefas = query.getResultList();
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return tarefas;
    }
    
}
