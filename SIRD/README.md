# 🌪️ SIRD - Sistema Integrado de Registro de Desastres

O **SIRD** é uma API REST desenvolvida com **Java 17** e **Spring Boot**, projetada para registrar e consultar **eventos climáticos extremos** e seus respectivos **locais de ocorrência**. A solução atende aos critérios acadêmicos exigidos na disciplina _Java Advanced_ da FIAP.

---

##  Funcionalidades

-  CRUD completo para eventos e locais
-  Relacionamento entre entidades (`Evento` → `Local`)
-  Autenticação via JWT
-  Validação de dados com Bean Validation
-  Busca com paginação, ordenação e filtros
-  Swagger UI para documentação interativa
-  Tratamento global de erros
-  Banco em memória com H2 Console ativado

---

##  Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- H2 Database (in-memory)
- Swagger/OpenAPI (SpringDoc)
- JWT (JSON Web Token)

---

##  Instalação

### Pré-requisitos

- Java 17+
- Maven 3.8+
