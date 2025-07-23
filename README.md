# 🌐 API Rest com MongoDB e Spring Boot

Este projeto foi desenvolvido como parte do curso *Programação Orientada a Objetos com Java* (Nelio Alves) e tem como objetivo demonstrar o uso de **MongoDB** com **Spring Boot** para construir uma API RESTful.

 **O que faz:**  
Um sistema de cadastro de usuários que também gerencia posts e comentários.
Permite criar usuários, associar posts a esses usuários e listar comentários de forma organizada, utilizando um banco de dados orientado a documentos (MongoDB).

## Funcionalidades
✅ CRUD completo de usuários e posts  
✅ Associações entre documentos (objetos aninhados e referências)  
✅ Consultas com Spring Data e MongoRepository  
✅ DTOs para otimizar respostas da API  
✅ Tratamento de exceções

## Tecnologias e Ferramentas
- Java 17
- Spring Boot
- MongoDB
- Spring Data MongoDB
- Maven
- Postman para testes de endpoints

## Endpoints Principais
- `GET /users` – listar usuários
- `POST /users` – inserir usuário
- `PUT /users/{id}` – atualizar usuário
- `DELETE /users/{id}` – deletar usuário
- `GET /users/{id}/posts` – listar posts do usuário

## Destaque
- **Modelagem orientada a documentos**
- **Boas práticas de API REST**
- **Uso de DTOs e camadas service/repository**
