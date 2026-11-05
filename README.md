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

1. Aplicação inicia sem erros? **Sim.** Iniciada com `./mvnw spring-boot:run` e acessada na porta 8080.
2. GET /livro continua funcionando? **Sim.** Retorna o JSON do livro O Hobbit.
3. Formulário envia título e autor? **Sim.** Ao cadastrar “Dom Casmurro”, apareceu “Livro cadastrado com sucesso!”.
4. POST /livros retorna resposta adequada? **Sim.** O livro foi cadastrado e aparece na lista. O código de resposta é 201 (Created), definido por `@ResponseStatus`.
5. GET /livros mostra os livros cadastrados? **Sim.** Retorna `[{"titulo":"Dom Casmurro","autor":"Machado de Assis","disponivel":true}]`.
6. O que acontece ao reiniciar a aplicação? **Sim.** Após reiniciar com `./mvnw spring-boot:run`, GET /livros retornou `[]`, pois os dados ficam só em memória.

## Resultado dos testes

- GET /livro: retorna o JSON do livro (testado no navegador).
- GET /livro/emprestar e /livro/devolver: alteram a disponibilidade (testado).
- POST /livros pelo formulário: cadastra e mostra a mensagem de sucesso (testado).
- GET /livros: lista os livros cadastrados (testado).

## Integrantes

- Gean Carlos de Almeida Reis
- Isabella Luiza Fernandes Borges
