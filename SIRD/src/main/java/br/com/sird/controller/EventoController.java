package br.com.sird.controller;

import br.com.sird.model.Evento;
import br.com.sird.repository.EventoRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    private final EventoRepository repository;

    public EventoController(EventoRepository repository) {
        this.repository = repository;
    }

    // Paginação, ordenação e filtro por nome
    @GetMapping
    public Page<Evento> listar(@RequestParam(required = false) String nome, Pageable pageable) {
        if (nome != null && !nome.isBlank()) {
            return repository.findByNomeContainingIgnoreCase(nome, pageable);
        }
        return repository.findAll(pageable);
    }

    @PostMapping
    public Evento salvar(@RequestBody @Valid Evento evento) {
        return repository.save(evento);
    }
}
