package webflux.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface BookRepository extends ReactiveCrudRepository<Book, Long> {

    Mono<Book> findByTitle(String title);
}
