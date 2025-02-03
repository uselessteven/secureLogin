package com.secureLogin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class SecureLoginApplicationTests
{
	@Test
	void applicationStartsSuccessfully()
	{
		assertDoesNotThrow(() -> SecureLoginApplication.main(new String[]{}));
	}
}