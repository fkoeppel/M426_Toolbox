package Toolbox;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/*
 * author:		Federico Köppel
 * element:		041
 * date:		25.03.19
 * 
 */

public class HashGenerator {

	public String hash(String password, int salt) {
		if(password == null || password.length() == 0 || password == " ") {
			System.err.println("END: Value not allowed.");
			return null;
		}
		else {
			if (salt == 0) {
				salt = salt();
			}
			password = password.trim();
			try {
				password = password + salt;
				MessageDigest md;
				md = MessageDigest.getInstance("SHA-256");
				byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

				StringBuilder hash = new StringBuilder();
				for (byte b : hashInBytes) {
					hash.append(String.format("%02x", b));
				}
				return hash.toString();
			} 
			catch (NoSuchAlgorithmException e) {
				System.err.println("Not a valid algorithm: " + e);
			}
		}
		return null;
	}


	public int salt() {
		Random rand = new Random();
		int salt = rand.nextInt(213346473);
		return salt;
	}

}
