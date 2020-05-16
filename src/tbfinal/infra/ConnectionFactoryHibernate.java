package tbfinal.infra;
/*
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
*/
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ConnectionFactoryHibernate {

    private static EntityManagerFactory emf;

    public static EntityManager getEntityManager() {
        try {
            if (emf == null) {
                emf = Persistence.createEntityManagerFactory("CaloriasPU");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emf.createEntityManager();
    }
}
