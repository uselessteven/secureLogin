package com.secureLogin;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

@SpringBootTest
class SecureLoginApplicationTests
{
	@Test
	void applicationStartsSuccessfully()
	{
		assertDoesNotThrow(() -> SecureLoginApplication.main(new String[]{}));
	}
}