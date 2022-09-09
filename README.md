<p align="center">
  <img alt="Icon" src="https://design.jboss.org/quarkus/logo/final/PNG/quarkus_logo_horizontal_rgb_600px_default.png" width="400"/>
</p>

# CRUD - JAVA - QUARKUS 
- Usado para consultas, o crud, acrônimo para Create, Read, Update e Delete (apagar), é utilizado para realizar operações básicas para criar e gerenciar elementos de dados persistentes.

# Ferramentas utilizadas no CRUD
- Framework Quarkus
- Data H2
- API REST
- Postman para testes
------------------------------------------------------------------------------
# Utilizando API
- O que é API (API REST):
É um conjunto de rotinas e padrões que facilitam a comunicação e troca de informações entre sistemas, utilizada para facilitar a integração entre diferentes sites e aplicativos. A utilizada no projeto, a API REST, dentre os requisitos, o mais comum é ter as solicitações gerenciadas pelo protocolo HTTP.

# VERBOS HTTP UTLIZADOS:
- GET
- POST
- PUT
- DELETE

# Além dos verbos utilizados, no projeto foi utilizado dois códigos de status:
- 201 : Para requisições POST bem sucedidas, quando um novo registro é cadastrado;
- 204 : Para requisições PUT e DELETE bem sucedidas, quando a operação foi realizada com sucesso mas não precisamos retornar nenhum dado adicional para o cliente.

## O padrão de arquitetura de software MVC foi utilizado no projeto, modelo responsável pelo acesso e manipulação dos dados da aplicação. É nela que está as consultas do banco de dados (H2) e acesso a API. 
Do padrão MVC foi utilizado o Controller, Service e Entity.
- Classe do Controller : CustomerController
- Classe do Service : CustomerService
- Classe da Entity: Entity

---------------------------------------------------------------------------------------
<p align="center">
  <img alt="Icon" src="https://upload.wikimedia.org/wikipedia/commons/4/4e/Docker_%28container_engine%29_logo.svg" width="400"/>
</p>
#<h3>Houve alterações no projeto, passando a ser utilizando o PostgreSQL e foi gerada a imagem docker. </h3>
- As alterações do banco de dados foram feitas no arquivo application.properties e foram colocadas novas dependências do PostgreSQL no arquivo POM.
- Após serem colocadas as dependências do Docker no POM, também houveram configurações simples no arquivo application.properties. Apó isso, a imagem foi gerada pelo comando:
mvn package -DskipTests
---------------------------------------------------------------------------------------


# gabriele-crud-custumer Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/gabriele-crud-custumer-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- REST resources for Hibernate ORM with Panache ([guide](https://quarkus.io/guides/rest-data-panache)): Generate JAX-RS resources for your Hibernate Panache entities and repositories
- RESTEasy Reactive ([guide](https://quarkus.io/guides/resteasy-reactive)): A JAX-RS implementation utilizing build time processing and Vert.x. This extension is not compatible with the quarkus-resteasy extension, or any of the extensions that depend on it.

## Provided Code

### RESTEasy Reactive

Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
