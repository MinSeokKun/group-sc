package kr.inflearn.ssc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import kr.inflearn.ssc.dto.object.User;
import kr.inflearn.ssc.exception.UserNotFoundException;
import kr.inflearn.ssc.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // 유저 생성
    public User createUser(String email, String password, String nickname, String tellNumber) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUserName(nickname);
        user.setTellNumber(tellNumber);
        userRepository.save(user);
        return user;
    }

    // 유저 프로필 업데이트
    public User updateUserProfile(String email, String profileImage) throws UserNotFoundException {
        Optional<User> optional = userRepository.findByEmail(email);
        if (!optional.isPresent()) {
            throw new UserNotFoundException("User not found");
        }
        User user = optional.get();
        user.setProfileImage(profileImage);
        userRepository.save(user);
        return user;
    }
}
