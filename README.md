# Exercício 05: Gerenciamento de Clientes

## Enunciado
Crie um serviço RESTful em Spring Boot para gerenciar clientes. O objetivo é praticar mapeamento JPA e operações CRUD com múltiplos campos de texto.

## Entidade: Cliente
| Atributo | Tipo   | Descrição                                         |
| :---     | :---   | :---                                              |
| id       | Long   | Identificador único (chave primária, auto-gerado) |
| nome     | String | Nome da cliente                                   |
| email    | String | Email do cliente                                  |
| telefone | String | Telefone do cliente                               |

## Requisitos
1. Crie uma entidade JPA chamada Cliente com os atributos especificados
2. Configure o nome da entidade JPA como Cliente
3. Configure o nome da tabela no banco como tb_cliente
4. Pelo menos dois atributos devem ter o nome do campo diferente do nome da coluna no banco, utilizando @Column(name="...")
5. Implemente um repositório Spring Data JPA para a entidade
6. Implemente um serviço para realizar as operações de CRUD
7. Crie um controlador REST que exponha os seguintes endpoints

## Endpoints RESTful
* POST /clientes — criar novo cliente
* GET /clientes — listar todos os clientes
* GET /clientes/{id} — buscar cliente por ID
* DELETE /clientes/{id} — deletar cliente por ID


## Observações
* Não é necessário implementar validação de dados
* Utilize as convenções Java para nomes de métodos, atributos e classes
* Seu código deve estar organizado em pacotes seguindo boas práticas
