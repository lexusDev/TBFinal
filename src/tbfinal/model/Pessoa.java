package tbfinal.model;
/**
Alex de Araujo Monteiro HT3000206
Caio Vinicius Halcsik Felix HT3000877
 */

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String nome;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tarefa> tarefas = new ArrayList<>();
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Tarefa> getTarefa() {
        return tarefas;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefas = tarefa;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + ID + ", tarefa=" + tarefas + ", nome=" + nome + '}';
    }
}
