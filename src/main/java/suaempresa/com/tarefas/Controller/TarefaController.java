package suaempresa.com.tarefas.Controller;

import suaempresa.com.tarefas.Model.Tarefa;
import suaempresa.com.tarefas.repository.TarefaRepository; // Corrigido: 'repository' com 'r' minúsculo
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repository.save(tarefa);
    }

    @GetMapping
    public List listar() { // Corrigido: Adicionado
        return repository.findAll();
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        return repository.findById(id).map(tarefa -> {
            tarefa.setTitulo(tarefaAtualizada.getTitulo());
            tarefa.setDescricao(tarefaAtualizada.getDescricao());
            tarefa.setConcluida(tarefaAtualizada.isConcluida());
            return repository.save(tarefa);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada com o ID: " + id));
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}