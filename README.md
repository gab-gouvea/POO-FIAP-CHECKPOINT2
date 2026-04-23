# Checkpoint 2 — CRUD de Pedidos

API REST para gerenciamento de pedidos, desenvolvida com Spring Boot aplicando conceitos de **Arquitetura em Camadas** e **Programação Orientada a Objetos (POO)**.

## Integrantes

- 554981 - Bruno Gabriel Silva Dominicheli
- 555528 - Gabriel Gouvea Marques de Oliveira
- 556198 - Miguel Kapicius Caires
- 555608 - Thiago Ferreira Oliveira

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Flyway
- MySQL
- Lombok

## Arquitetura

O projeto segue a arquitetura em camadas:

```
Controller  →  Service  →  Repository  →  Banco de dados
```

- **Controller** — recebe as requisições HTTP e retorna as respostas
- **Service** — contém as regras de negócio
- **Repository** — acesso ao banco de dados via Spring Data JPA
- **Model** — entidade `Pedido` mapeada com JPA
- **DTO** — objetos de transferência de dados para criação e atualização

## Endpoints

| Método | Endpoint       | Descrição              |
|--------|----------------|------------------------|
| POST   | /pedidos       | Criar um pedido        |
| GET    | /pedidos       | Listar todos os pedidos|
| GET    | /pedidos/{id}  | Buscar pedido por ID   |
| PUT    | /pedidos/{id}  | Atualizar pedido       |
| DELETE | /pedidos/{id}  | Deletar pedido         |

## Como rodar

1. Instale e inicie o MySQL
2. Crie o banco de dados:
```sql
CREATE DATABASE checkpoint2;
```
3. Configure `src/main/resources/application.properties` com seu usuário e senha do MySQL
4. Execute a aplicação — o Flyway cria as tabelas automaticamente

A API estará disponível em `http://localhost:8080`
