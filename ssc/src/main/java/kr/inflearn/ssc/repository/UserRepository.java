package kr.inflearn.ssc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.inflearn.ssc.dto.object.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
