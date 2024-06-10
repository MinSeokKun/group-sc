package kr.inflearn.ssc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.inflearn.ssc.service.UserService;

@SpringBootTest
class SscApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void createUser() {
		String email = "minseok@infl.kr";
		String password = "1234";
		String nickname = "민석쿤";
		String tellNumber = "01012345678";
		userService.createUser(email, password, nickname, tellNumber);
	}

}
