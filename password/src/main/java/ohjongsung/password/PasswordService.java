package ohjongsung.password;

/**
 * Created by ohjongsung on 2019-05-03
 */
public interface PasswordService {
	String hash(String input);

	String algorithm();
}
