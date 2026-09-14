package suaempresa.com.tarefas.Model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Tarefas")
@Data
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)

    private String descricao;

    private String titulo;



    private boolean concluida = false;









}
