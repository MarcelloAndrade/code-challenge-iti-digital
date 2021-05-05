## Descrição
API Web que tem como objetivo validar senha, com as segintes definições:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

> **_Nota:_**  Espaços em branco não devem ser considerados como caracteres válidos.

## Sobre a solução e estrutura do projeto
A aplicação foi construída com linguagem java e baseada no conceito de clean code onde as diferentes partes do sistema, 
possuem um baixo grau de dependência, resultando em uma fácil manutenibilidade e testabilidade.

O projeto está estruturado de seguinte forma:
- Camada Entities (iti-domain): contem objetos de domínio, contratos de serviços.
- Camada Use cases (iti-application): contem objetos que representam regras de negócio.
- Camada Interface Adapters (iti-api): contem objetos responsáveis por realizar a comunicação com componentes externos.

## Instruções de execução do projeto

Requisitos jdk 11 + maven

Após clone executar os seguintes comandos:

 > cd code-challenge-iti-digital/iti-parent/
 
 > mvn clean install
 
 > java -jar iti-api/target/iti-api-0.0.1-SNAPSHOT.jar

 > curl -X POST "http://localhost:8080/credential" -H "Content-Type: application/json" -d "{ \"password\": \"AbTp9#fok\"}"

 Uma documentação da API estará disponível em:

 > http://localhost:8080/swagger-ui.html
