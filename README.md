# Workshop Spring Boot 3 JPA
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação de gestão de pedidos, implementada com Spring Boot 3 e JPA. O sistema permite a criação, leitura, atualização e exclusão de pedidos, com associações entre as entidades de domínio (como cliente, pedido e produto), validação de dados, exceções personalizadas e autenticação básica.

## Modelo conceitual
![Modelo Conceitual](https://github.com/WelingtonFranzoso/workshop-springboot3-jpa/blob/main/assets/workshop-springboot3-jpa.png?raw=true)

# Funcionalidades
- Cadastro de pedidos: Adicionar novos pedidos com informações detalhadas.
- CRUD completo: Criar, ler, atualizar e excluir pedidos e clientes.
- Validações de dados: Verificação de campos obrigatórios, formatos e valores válidos.
- Associações entre entidades: Clientes podem ter múltiplos pedidos, e pedidos podem ter vários produtos.
- Exceções personalizadas: Tratamento de erros específicos, como pedidos ou produtos não encontrados.
- Autenticação: Implementação de autenticação básica (ex: usuário/admin) para acessar certas funcionalidades.

# Tecnologias utilizadas
- Java 17: Linguagem de programação.
- Spring Boot 3: Framework para desenvolvimento de aplicações Java.
- JPA / Hibernate: Implementação do mapeamento objeto-relacional (ORM) para interação com o banco de dados.
- Maven: Ferramenta de automação de build.
- PostgreSQL: Banco de dados relacional utilizado para persistência dos dados.

# Como executar o projeto

## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Maven (ou use o wrapper mvnw incluso no projeto)
- PostgreSQLPostgreSQL configurado e rodando
- PostgreSQL configurado e rodando

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/workshop-springboot3-jpa.git

# entrar na pasta do projeto back end
cd workshop-springboot3-jpa

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
