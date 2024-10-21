# crud-spring-boot-mongodb
Esta é uma API RESTful desenvolvida com Spring Boot e integrada ao banco de dados MongoDB, que implementa operações de CRUD (Create, Read, Update, Delete).
A API foi projetada para ser simples, eficiente e escalável, aproveitando a flexibilidade de um banco de dados NoSQL como o MongoDB, ao mesmo tempo em que utiliza o poder do Spring Boot para gerenciamento de dependências e fácil configuração.

Tecnologias Utilizadas
Java 17: Linguagem de programação utilizada no desenvolvimento da API.
Spring Boot: Framework para construção de aplicativos Java, proporcionando uma estrutura simplificada para criar APIs e serviços robustos.
Spring Data MongoDB: Integração nativa com o MongoDB, permitindo operações no banco de dados de maneira rápida e eficiente.
Spring Web: Fornece suporte para criação de APIs RESTful, incluindo o suporte ao padrão HTTP.
MongoDB: Banco de dados NoSQL, utilizado para armazenamento flexível e eficiente dos dados.
Maven: Ferramenta de gerenciamento de dependências e automação de build.
Funcionalidades
A API oferece endpoints para as seguintes operações de CRUD:

Create (Criar): Permite a criação de novos registros no banco de dados MongoDB.

Método: POST
Endpoint: http://localhost:8080/api/expense


Read (Ler): Retorna uma lista de todos os registros ou um registro específico com base no seu ID.
Método: GET
Endpoints:
/api/expense (para retornar todos os registros)
/api/expense/{id} (para retornar um registro específico)

Update (Atualizar): Atualiza os dados de um registro existente, identificado pelo ID.
Método: PUT
Endpoint: /api/expense/
{
    "id": "", -----> Passe aqui o id que e atualize o registro
    "expenseName": "",
    "expenseCategory": "",
    "expenseAmount": 
}


Delete (Excluir): Remove um registro do banco de dados com base no ID.
Método: DELETE
Endpoint: /api/expense/{id}



Estrutura do Projeto
A estrutura do projeto segue a arquitetura MVC (Model-View-Controller) aplicada a APIs RESTful, com divisão clara entre as responsabilidades de cada camada:

Model: Representa os dados e as entidades do sistema, mapeadas para as coleções do MongoDB.
Repository: Interface que comunica com o MongoDB, utilizando o Spring Data MongoDB para gerenciar as operações no banco de dados.
Service: Contém a lógica de negócios da aplicação, validando e processando os dados antes de qualquer interação com o banco de dados.
Controller: Lida com as requisições HTTP e responde de acordo com as ações solicitadas (CRUD).
