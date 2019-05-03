package ohjongsung.password.sha;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by ohjongsung on 2019-05-03
 */
public class PasswordServiceImplShaTest {

	@Test
	public void algorithm() {
		PasswordServiceImplSha passwordService = new PasswordServiceImplSha();
		String algorithm = passwordService.algorithm();
		assertEquals("sha256", algorithm);
	}
}