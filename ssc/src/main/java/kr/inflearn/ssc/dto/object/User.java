package kr.inflearn.ssc.dto.object;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String email;

    private String password;

    private String nickname;

    private String tell_number;

    private String profile_image;
}
