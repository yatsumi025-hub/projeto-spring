package br.edu.uniessa.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LivroService {

    // Armazenamento temporário: os dados ficam apenas em memória
    private List<Livro> livros = new ArrayList<>();

    public List<Livro> listar() {
        return livros;
    }

    public Livro cadastrar(Livro livro) {
        livros.add(livro);
        return livro;
    }
}
