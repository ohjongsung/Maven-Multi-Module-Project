package ohjongsung.password.sha;

import org.apache.commons.codec.digest.DigestUtils;

import ohjongsung.password.PasswordService;

/**
 * Created by ohjongsung on 2019-05-03
 */
public class PasswordServiceImplSha implements PasswordService {
	@Override
	public String hash(String input) {
		return DigestUtils.sha256Hex(input);
	}

	@Override
	public String algorithm() {
		return "sha256";
	}
}
