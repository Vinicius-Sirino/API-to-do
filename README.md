# API-to-do
📝 API To-Do (Gerenciamento de Tarefas)
Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de tarefas (CRUD completo).

🚀 Tecnologias Utilizadas
Java
Spring Boot (Web, Dados JPA)
Banco de Dados H2 (Em memória)
Lombok (Redução de código padrão)
Maven (Gerenciamento de dependências)
Postman (Testes de API)
⚙️ Como Executar
Clone este repositório em sua máquina local.
Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, etc).
Execute o arquivo principal TarefasApplication.java.
A API estará disponível no endereço: http://localhost:8080/tarefas.
🗄️ Acesso ao Banco de Dados (Console H2)
O projeto utiliza um banco de dados em memória para testes rápidos. Para visualizar tabelas e dados:

URL: http://localhost:8080/h2-console
URL JDBC: jdbc:h2:mem:testdb
Usuário: sa
Senha: (deixar em branco)
🔗 Pontos de extremidade da API
Método	Rota	Descrição
POST	/tarefas	Cria uma nova tarefa
GET	/tarefas	Lista todas as tarefas cadastradas
PUT	/tarefas/{id}	Atualizar os dados de uma tarefa existente
DELETE	/tarefas/{id}	Exclui uma tarefa do banco de dados
Exemplo de Corpo da Requisição (JSON) para POST/PUT:
{ "titulo": "Estudar Spring Boot", "descricao": "Revisar anotações do Controller", "concluida": false }
