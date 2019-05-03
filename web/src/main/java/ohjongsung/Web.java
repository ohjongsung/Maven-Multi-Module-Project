package ohjongsung;

import org.json.JSONObject;

import ohjongsung.config.Config;
import ohjongsung.password.PasswordService;
import ohjongsung.password.md5.PasswordServiceImplMd5;
import ohjongsung.password.sha.PasswordServiceImplSha;

/**
 * Created by ohjongsung on 2019-05-03
 */
public class Web {

	public static void main(String[] args) {
		Config config = new Config();
		JSONObject jsonObject = config.getConfig();
		System.out.println(jsonObject.getString("test"));
		JSONObject jsonObject2 = config.getConfig2();
		System.out.println(jsonObject2.getString("md5"));
		PasswordService passwordService = new PasswordServiceImplSha();
		System.out.println(passwordService.algorithm());
		PasswordService passwordService1 = new PasswordServiceImplMd5();
		System.out.println(passwordService1.algorithm());
	}
}
