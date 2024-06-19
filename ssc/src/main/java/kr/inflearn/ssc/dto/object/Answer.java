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
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long answerId;

    private String answerContent;

    private int answerLikeCount;

    private LocalDateTime answerCreateDate;

    private LocalDateTime answerModifyDate;

    @ManyToOne
    Question question;

    @ManyToOne
    User user;
}
