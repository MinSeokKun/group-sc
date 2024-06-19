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
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long questId;

    private String questTitle;

    private String questContent;
    
    private int questResult;
    
    private LocalDateTime createDate;
    
    private LocalDateTime modifyDate;
    
    private int questLikeCount;
    
    @ManyToOne
    User user;

    @ManyToOne
    Video video;
}
