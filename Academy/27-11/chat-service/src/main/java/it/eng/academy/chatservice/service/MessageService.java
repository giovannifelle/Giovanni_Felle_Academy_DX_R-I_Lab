package it.eng.academy.chatservice.service;

import it.eng.academy.chatservice.model.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {

    Flux<Message> findByRoomId(Integer roomId );

    Mono<Message> save (Message message);
}
