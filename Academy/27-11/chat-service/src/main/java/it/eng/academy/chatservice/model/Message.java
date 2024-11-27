package it.eng.academy.chatservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter // Possono essere sostiuiti con @Data, ma è pericoloso
@Document(collection = "chat")
public class Message {

    @Id
    private String id;

    private Integer roomId;
    private String sender;
    private String message;

    private LocalDateTime createdAt;
}
