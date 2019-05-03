package ohjongsung.config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.json.JSONObject;

/**
 * Created by ohjongsung on 2019-05-03
 */
public class Config {
	public JSONObject getConfig() {
		InputStream in = getClass().getResourceAsStream("/settings.json");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		JSONObject obj = null;
		try {
			obj = new JSONObject(readAll(reader));
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return obj;
	}

	public JSONObject getConfig2() {
		InputStream in = getClass().getResourceAsStream("/md5.json");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		JSONObject obj = null;
		try {
			obj = new JSONObject(readAll(reader));
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return obj;
	}

	private static String readAll(Reader rd) throws IOException {
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}
}
