package suaempresa.com.tarefas.repository;

import suaempresa.com.tarefas.Model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}