package br.com.sird.controller;

import br.com.sird.model.Local;
import br.com.sird.repository.LocalRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locais")
public class LocalController {

    private final LocalRepository repository;

    public LocalController(LocalRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Local> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Local salvar(@RequestBody @Valid Local local) {
        return repository.save(local);
    }
}