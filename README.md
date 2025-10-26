
# 🛍️ API REST - CRUD Produtos (Spring Boot)

Projeto desenvolvido como parte do **Desafio Final de Arquitetura de Software**.

---

## 🧩 Descrição

API REST em **Java 17 + Spring Boot 3**, seguindo o padrão **MVC (Model–View–Controller)**.
Banco de dados **H2 (em memória)** e documentação via **Swagger UI**.

A aplicação foi projetada para demonstrar boas práticas de arquitetura e organização em camadas, com ênfase em desacoplamento, manutenção e clareza de responsabilidades.

---

## ⚙️ Endpoints Implementados

| **Endpoint**                       | **Método** | **Descrição**                                                             |
| ---------------------------------- | ---------- | ------------------------------------------------------------------------- |
| `/api/products`                    | `GET`      | Retorna todos os produtos cadastrados.                                    |
| `/api/products/{id}`               | `GET`      | Retorna um produto específico pelo ID.                                    |
| `/api/products/search?name={nome}` | `GET`      | Retorna produtos cujo nome contenha o termo informado (case-insensitive). |
| `/api/products/count`              | `GET`      | Retorna o número total de produtos cadastrados.                           |
| `/api/products`                    | `POST`     | Cria um novo produto.                                                     |
| `/api/products/{id}`               | `PUT`      | Atualiza um produto existente.                                            |
| `/api/products/{id}`               | `DELETE`   | Exclui um produto existente.                                              |

---

## 🧱 Arquitetura (MVC)

```plaintext
src/main/java/com/claudiaaquino/productapi
├── controller   # Endpoints REST
├── service      # Regras de negócio / orquestração
├── repository   # Acesso a dados (Spring Data JPA)
└── model        # Entidades JPA
```

---

## 🧭 Arquitetura de Software (C4 Model)

O projeto segue o **C4 Model**, focado no **nível de containers**.

### 📊 Diagrama — Container Level

<img width="1536" height="1024" alt="diagrama c4 tp1" src="https://github.com/user-attachments/assets/1f0fead8-d244-4387-8a26-1709aacd005c" />



### 🧩 Descrição dos Containers

* **Usuário**: interage com a API via Swagger UI.
* **Swagger UI**: fornece interface web para testar endpoints.
* **Product API (Spring Boot)**: núcleo da aplicação, responsável por processar requisições, aplicar regras de negócio e acessar o banco.
* **H2 Database**: banco de dados em memória usado para persistência local.

**Fluxo de comunicação:**
`Usuário → Swagger UI → Product API ↔ H2 Database`

---

## 🗂️ Estrutura de Pastas do Projeto

```plaintext
product-api/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/claudiaaquino/productapi/
 │   │   │   ├── controller/       → endpoints REST
 │   │   │   ├── model/            → entidades JPA
 │   │   │   ├── repository/       → interfaces de persistência (Spring Data JPA)
 │   │   │   ├── service/          → camada de negócio
 │   │   │   └── ProductApiApplication.java → classe principal
 │   │   └── resources/
 │   │       └── application.properties → configurações da aplicação
 │   └── test/ → testes automatizados (JUnit)
 ├── pom.xml → dependências Maven
 └── README.md → documentação do projeto
```

---

## 🧠 Explicação da Estrutura

| **Camada**      | **Responsabilidade**                                                                    |
| --------------- | --------------------------------------------------------------------------------------- |
| **Model**       | Define a estrutura da entidade `Product` com atributos, validações e mapeamento JPA.    |
| **Repository**  | Gerencia o acesso a dados, herdando métodos do `JpaRepository`.                         |
| **Service**     | Contém a lógica de negócio e orquestra as operações entre o controller e o repositório. |
| **Controller**  | Exposição dos endpoints REST, recebe e responde requisições HTTP.                       |
| **H2 Database** | Banco de dados em memória usado para persistência temporária.                           |
| **Swagger UI**  | Interface automática para documentação e testes de endpoints.                           |

---

## 🚀 Como Rodar (IntelliJ ou Terminal)

1. **Pré-requisitos**:

   * Java 17
   * Maven 3+

2. **Clonar e acessar a pasta**

   ```bash
   git clone <seu-repo-url.git>
   cd product-api
   ```

3. **Executar**

   ```bash
   mvn spring-boot:run
   ```

4. **Acessar**

   * Swagger: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   * H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

     * JDBC URL: `jdbc:h2:mem:productdb`
     * Usuário: `sa`
     * Senha: *(em branco)*

---

## 🧰 Tecnologias Utilizadas

* **Spring Boot 3**
* **Spring Data JPA**
* **Spring Validation**
* **H2 Database**
* **Springdoc OpenAPI (Swagger UI)**
* **Java 17**
* **Maven**

---

## 👩‍💻 Autora

**Claudia Alessandra Vieira Aquino**
Bootcamp Arquiteto(a) de Software — Pós-Graduação em Arquitetura de Software

---

