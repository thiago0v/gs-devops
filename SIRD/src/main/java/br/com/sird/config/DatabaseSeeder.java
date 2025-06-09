package br.com.sird.config;

import br.com.sird.model.Evento;
import br.com.sird.model.Local;
import br.com.sird.repository.EventoRepository;
import br.com.sird.repository.LocalRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

@Configuration
public class DatabaseSeeder {

    @Bean
    CommandLineRunner initDatabase(LocalRepository localRepository, EventoRepository eventoRepository) {
        return args -> {
            if (localRepository.count() == 0) {
                IntStream.rangeClosed(1, 50).forEach(i -> {
                    Local local = new Local();
                    local.setNome("Local " + i);
                    local.setEndereco("Av. Central " + i);
                    local.setCidade("Cidade " + (i % 10 + 1));
                    localRepository.save(local);
                });
            }

            if (eventoRepository.count() == 0) {
                Random random = new Random();
                IntStream.rangeClosed(1, 100).forEach(i -> {
                    Evento evento = new Evento();
                    evento.setNome("Evento " + i);
                    evento.setDescricao("Descrição automática do evento número " + i);
                    evento.setData(LocalDate.now().plusDays(i));

                    Long idAleatorio = (long) (random.nextInt(50) + 1);
                    localRepository.findById(idAleatorio).ifPresent(evento::setLocal);

                    eventoRepository.save(evento);
                });
            }

            System.out.println("✅ Base de dados preenchida com 50 locais e 100 eventos.");
        };
    }
}
