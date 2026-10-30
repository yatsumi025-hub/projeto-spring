package br.edu.uniessa.biblioteca;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {

    private LivroService livroService;

    private Livro livro = new Livro(
        "O Hobbit",
        "J. R. R. Tolkien",
        true
    );

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/livro")
    public Livro obterLivro() {
        return livro;
    }

    @GetMapping("/livro/emprestar")
    public Livro emprestarLivro() {
        livro.emprestar();
        return livro;
    }

    @GetMapping("/livro/devolver")
    public Livro devolverLivro() {
        livro.devolver();
        return livro;
    }

    @GetMapping("/livros")
    public List<Livro> listarLivros() {
        return livroService.listar();
    }

    @PostMapping("/livros")
    @ResponseStatus(HttpStatus.CREATED)
    public Livro cadastrarLivro(@RequestBody Livro novoLivro) {
        return livroService.cadastrar(novoLivro);
    }
}
