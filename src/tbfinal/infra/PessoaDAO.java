package tbfinal.infra;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import tbfinal.model.Pessoa;

/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */

public class PessoaDAO implements IPessoaDAO{

    @Override
    public List<Pessoa> recuperarTodos() {
        List<Pessoa> pessoas = new ArrayList<>();

        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            //solicita ao gerenciador todas as instâncias da classe Lembrete
            Query query = em.createQuery("from Pessoa");
            pessoas = query.getResultList();
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return pessoas;
    }

    @Override
    public List<Pessoa> recuperaByTarefa(String tarefa) {
        List<Pessoa> pessoas = new ArrayList<>();
        try {
            //cria um gerenciador de entidades
            EntityManager em = ConnectionFactoryHibernate.getEntityManager();
            Query query = em.createQuery("from Pessoa c where c.tarefa Like :tarefa").setParameter("tarefa", "%" + tarefa + "%");
            pessoas = query.getResultList();
            //encerra o gerenciador de entidades
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pessoas;
    }
    
}
