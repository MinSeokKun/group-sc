package kr.inflearn.ssc.dto.object;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Lecture {
    @Id
    int lecId;

    String teacherName;

    String lecName;

    int studentCount;

    int reviewCount;
}
