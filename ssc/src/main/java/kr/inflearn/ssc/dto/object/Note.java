package kr.inflearn.ssc.dto.object;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noteId;
    
    private String noteContent;

    @ManyToOne
    Lecture lecture;

    @ManyToOne
    User user;

    @ManyToOne
    Video video;

    private LocalDateTime createDate;
}
