# Spring Boot - Testes Unitários Junit 5

O projeto de uma aplicação Spring Boot, CRUD (CREATE, READ, UPDATE e DELETE) de um sistema simples com:

* Testes Unitários
* Testes Integração 
* Cobertura de Teste 100% di projeto

## Tecnologias & Ferramentas
<hr>

* Java v.17
* Spring Boot 2.x.x
* Junit 5
* Mockito
* Banco de Dados H2
* Model Mapper
* Lombok


## Excutar projeto pelo terminal 

Para executar o projeto no terminal na pasta do projeto, digite o seguinte comando:

```sh
mvn spring-boot:run
```

Comandos para executar os testes:

```sh
mvn clean test
```

## 🔌 Endpoints para testar API via Postman ou Insomnia:

URL: ```http://localhost:8080```

| Tipo   | Descrição                          | Caminho    |
|--------|------------------------------------|------------|
| GET    | Listar usuarios Cadastrados        | /user      |
| GET    | Listar usuario Cadastrados POR ID  | /user/{id} |
| POST   | Cadastrar novo usuario             | /user      |
| DELETE | Deletar usuario Cadastrados POR ID | /user/{id} |
| PUT    | Alterar usuario por ID             | /user/{id} |

### CRIAR USUARIO - POST :  ```http://localhost:8080/user```


```JSON
{
  "name": "Jubileu",
  "email": "jubielu@mail.com",
  "password": "12345"
}
```

### ATUALIZAR USUARIO - PUT :  ```http://localhost:8080/user/{id}```

```JSON
{
  "name": "Jubileu",
  "email": "jubileu@mail.com",
  "password": "1234"
}
```

### Plataforma

[**Udemy Autor:** Valdir Cezar](https://www.udemy.com/course/testes-com-junit-5-mockito-e-spring-boot-rest-apis/)

