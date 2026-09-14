# 📝 API To-Do (Gerenciamento de Tarefas)

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de tarefas (CRUD completo). Este projeto foi construído como parte da estruturação inicial para o TCC I do curso de Análise e Desenvolvimento de Sistemas da Fatec Americana.

## 🚀 Tecnologias Utilizadas
* **Java**
* **Spring Boot** (Web, Data JPA)
* **Banco de Dados H2** (Em memória)
* **Lombok** (Redução de código boilerplate)
* **Maven** (Gerenciamento de dependências)
* **Postman** (Testes de API)

## ⚙️ Como Executar
1. Clone este repositório em sua máquina local.
2. Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, etc).
3. Execute o arquivo principal `TarefasApplication.java`.
4. A API estará disponível no endereço: `http://localhost:8080/tarefas`.

## 🗄️ Acesso ao Banco de Dados (H2 Console)
O projeto utiliza um banco de dados em memória para testes rápidos. Para visualizar as tabelas e dados:
* **URL:** `http://localhost:8080/h2-console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
* **User:** `sa`
* **Password:** *(deixar em branco)*

## 🔗 Endpoints da API

| Método | Rota | Descrição |
|---|---|---|
| `POST` | `/tarefas` | Cria uma nova tarefa |
| `GET` | `/tarefas` | Lista todas as tarefas cadastradas |
| `PUT` | `/tarefas/{id}` | Atualiza os dados de uma tarefa existente |
| `DELETE` | `/tarefas/{id}` | Exclui uma tarefa do banco de dados |

### Exemplo de Corpo da Requisição (JSON) para POST/PUT:
{
    "titulo": "Estudar Spring Boot",
    "descricao": "Revisar anotações do Controller",
    "concluida": false
}
