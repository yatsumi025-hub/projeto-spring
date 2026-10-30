# Biblioteca Web — Spring Boot

Programação para Internet • 2º bimestre • Aula de 22/10/2026

Evolução da Biblioteca: formulário + POST + armazenamento temporário.

## Arquivos

- `Livro.java` → atributos e representação do livro.
- `LivroController.java` → recebe GET e POST; devolve respostas HTTP.
- `LivroService.java` → mantém `List<Livro>` e realiza cadastro/listagem.
- `index.html` e `style.css` → interface Web.

## Fluxo do cadastro (POST)

```
FORMULÁRIO HTML (título, autor, disponível)
  ↓
JavaScript fetch()
  ↓
POST /livros + JSON
  ↓
LivroController
  ↓
LivroService
  ↓
List<Livro>
```

## Endpoints

- `GET /livro` → livro de exemplo (Emprestar e Devolver preservados).
- `GET /livros` → consultar a lista de livros.
- `POST /livros` → enviar dados de um novo livro (`Content-Type: application/json`).

Os dados ficam apenas em memória (sem banco de dados e sem autenticação).

## Como executar

```
cd biblioteca
./mvnw spring-boot:run
```

Acessar `http://localhost:8080`.

## Checklist de testes

1. Aplicação inicia sem erros?
2. GET /livro continua funcionando?
3. Formulário envia título e autor?
4. POST /livros retorna resposta adequada?
5. GET /livros mostra os livros cadastrados?
6. O que acontece ao reiniciar a aplicação?

## Integrantes

- Gean Carlos de Almeida Reis
- Isabella Luiza Fernandes Borges
