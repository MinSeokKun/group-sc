package kr.inflearn.ssc.dto.object;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    
    @Id
    private String email;

    private String password;

    private String nickname;

    private String tellNumber;

    private String profileImage;
}
