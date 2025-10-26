# 🛍️ API REST - Gerenciamento de Produtos (Spring Boot)

Projeto desenvolvido como parte do Desafio Final de Arquitetura de Software.

## 🧩 Descrição
API REST em **Java 17 + Spring Boot 3**, seguindo **MVC**.  
Banco **H2 (em memória)** e documentação via **Swagger UI**.

### Endpoints
- `POST /api/products` → cria produto  
- `GET /api/products` → lista produtos  
- `GET /api/products/{id}` → busca por ID  
- `GET /api/products/search?name=foo` → busca por nome (contains, ignore case)  
- `PUT /api/products/{id}` → atualiza  
- `DELETE /api/products/{id}` → remove  
- `GET /api/products/count` → total de produtos

## 🧱 Arquitetura (MVC)
```
src/main/java/com/claudiaaquino/productapi
├── controller   # Endpoints REST
├── service      # Regras de negócio / orquestração
├── repository   # Acesso a dados (Spring Data JPA)
└── model        # Entidades JPA
```

## 🚀 Como rodar (IntelliJ ou terminal)
1. **Pré-requisitos**: Java 17 + Maven
2. Clonar e acessar a pasta
   ```bash
   git clone <seu-repo-url.git>
   cd product-api
   ```
3. Executar
   ```bash
   mvn spring-boot:run
   ```
4. Acessar:
   - Swagger: http://localhost:8080/swagger-ui.html  
   - H2 Console: http://localhost:8080/h2-console  (JDBC URL: `jdbc:h2:mem:productdb`)

## 🧠 Tecnologias
- Spring Boot Web, Data JPA, Validation
- H2 Database
- springdoc-openapi (Swagger UI)

## 👩‍💻 Autora
**Claudia Alessandra Vieira Aquino**
