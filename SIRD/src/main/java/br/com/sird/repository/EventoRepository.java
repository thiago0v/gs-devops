package br.com.sird.repository;

import br.com.sird.model.Evento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    Page<Evento> findByNomeContainingIgnoreCase(String nome, Pageable pageable);
}
