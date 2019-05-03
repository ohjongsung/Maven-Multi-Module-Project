package ohjongsung.password.md5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by ohjongsung on 2019-05-03
 */
public class PasswordServiceImplMd5Test {

	@Test
	public void algorithm() {
		PasswordServiceImplMd5 passwordService = new PasswordServiceImplMd5();
		String algorithm = passwordService.algorithm();
		assertEquals("md5", algorithm);
	}
}