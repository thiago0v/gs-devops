# Projeto DevOps - SIRD Java API com Oracle

## 🚀 Visão Geral
Este projeto realiza a conteinerização da API Java SIRD com banco Oracle, seguindo os requisitos da disciplina de DevOps Tools & Cloud Computing.

## 📦 Estrutura dos Containers
- `java-api-554914`: Container da aplicação Java com Spring Boot.
- `oracle-db-554914`: Container do banco Oracle XE (porta 1521).

## 📄 Requisitos Atendidos
- CRUD completo
- Banco Oracle com volume
- Variável de ambiente para senha Oracle
- Porta exposta para acesso (1521 e 8080)
- Execução em segundo plano
- Logs no terminal
- Imagens confiáveis do Docker Hub

## ⚙️ Executar Projeto

```bash
docker-compose up --build -d
docker logs -f java-api-554914
docker logs -f oracle-db-554914
```

## 🧪 Testes e Acesso
- Acesse a API: `http://localhost:8080`
- Teste os endpoints conforme documentado nos controladores da aplicação.
- Use ferramentas como Postman para testar os endpoints CRUD.

## 🛠️ Manutenção
- Para resetar os containers:
```bash
docker-compose down -v
docker-compose up --build -d
```

## 🧑‍🤝‍🧑 Equipe
- Thiago Alves dos Santos de Vicente (RM556805)
- Vinicius Beda de Oliveira (RM554914)