package tiendm.test;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Hex;

/**
 * Test that our encryption is working as per the 3rd party spec we're working
 * to.
 * 
 * @author jabley
 * 
 */
public class TripleDESEncryptionTest {

	/*
	 * Hopefully the documentation that you're using can give you some suitable
	 * test data to fill in these constants.
	 */
	private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();

	public static void main(String[] args) throws Exception {

		String userID = "DUSER2A ";
		String password = "Demo1111";

//		// step1
//		String step1 = encrypt(userID, password);
//		System.out.println("Step1: " + step1);
//
//		// step2
//		String step2 = encrypt(password, step1);
//		System.out.println("Step2: " + step2);
//		
//		//step3
//		String step3 = stringToHex(step2);
//		System.out.println("Step3: " + step3);
		
		
		byte[] passInByte = password.getBytes();
		byte[] userIdInByte = userID.getBytes();
		
		byte[] step1B = encrypt(userIdInByte, passInByte);
		
		byte[] step2B = encrypt(passInByte, step1B);
		
		String result = new String(Hex.encodeHex(step2B)).toUpperCase();
		
		System.out.println(result);
	}

	public static String encrypt(String str, String keyStr) throws Exception {
		String algorithm = "DES";
		String transformation = "DES/CBC/NoPadding";

		DESKeySpec keySpec = new DESKeySpec(keyStr.getBytes("UTF-8"));

		/* Initialization Vector of 8 bytes set to zero. */
		IvParameterSpec iv = new IvParameterSpec(new byte[8]);

		SecretKey key = SecretKeyFactory.getInstance(algorithm).generateSecret(keySpec);
		Cipher encrypter = Cipher.getInstance(transformation);
		encrypter.init(Cipher.ENCRYPT_MODE, key, iv);

		byte[] input = str.getBytes("UTF-8");

		byte[] encrypted = encrypter.doFinal(input);

		String encryptedStr = new String(Hex.encodeHex(encrypted));
		return (encryptedStr);
	}
	
	
	public static byte[] encrypt(byte[] input, byte[] keyStr) throws Exception {
		String algorithm = "DES";
		String transformation = "DES/CBC/NoPadding";

		DESKeySpec keySpec = new DESKeySpec(keyStr);

		/* Initialization Vector of 8 bytes set to zero. */
		IvParameterSpec iv = new IvParameterSpec(new byte[8]);

		SecretKey key = SecretKeyFactory.getInstance(algorithm).generateSecret(keySpec);
		Cipher encrypter = Cipher.getInstance(transformation);
		encrypter.init(Cipher.ENCRYPT_MODE, key, iv);

//		byte[] input = str.getBytes("UTF-8");

		byte[] encrypted = encrypter.doFinal(input);

//		String encryptedStr = new String(Hex.encodeHex(encrypted));
		return (encrypted);
	}

	public static String stringToHex(String input) throws UnsupportedEncodingException {
		if (input == null)
			throw new NullPointerException();
		return asHex(input.getBytes());
	}

	private static String asHex(byte[] buf) {
		char[] chars = new char[2 * buf.length];
		for (int i = 0; i < buf.length; ++i) {
			chars[2 * i] = HEX_CHARS[(buf[i] & 0xF0) >>> 4];
			chars[2 * i + 1] = HEX_CHARS[buf[i] & 0x0F];
		}
		return new String(chars);
	}

	/**
	 * Test that we are correctly encrypting the content as per their spec.
	 * 
	 * @throws Exception
	 *             if there was a problem
	 */
	// @Test
	// public void encryptionWorksOkUsingJCE() throws Exception {
	//
	// String algorithm = "DESede";
	// String transformation = "DESede/CBC/PKCS5Padding";
	//
	// byte[] keyValue = Hex.decodeHex(SHARED_KEY.toCharArray());
	//
	// DESedeKeySpec keySpec = new DESedeKeySpec(keyValue);
	//
	// /* Initialization Vector of 8 bytes set to zero. */
	// IvParameterSpec iv = new IvParameterSpec(new byte[8]);
	//
	// SecretKey key =
	// SecretKeyFactory.getInstance(algorithm).generateSecret(keySpec);
	// Cipher encrypter = Cipher.getInstance(transformation);
	// encrypter.init(Cipher.ENCRYPT_MODE, key, iv);
	//
	// byte[] input = PLAIN_TEXT.getBytes("UTF-8");
	//
	// byte[] encrypted = encrypter.doFinal(input);
	//
	// assertEquals("Ensure that we have encrypted the token correctly",
	// CIPHER_TEXT, new String(Hex
	// .encodeHex(encrypted)).toUpperCase());
	//
	// Cipher decrypter = Cipher.getInstance(transformation);
	// decrypter.init(Cipher.DECRYPT_MODE, key, iv);
	//
	// byte[] decrypted =
	// decrypter.doFinal(Hex.decodeHex(CIPHER_TEXT.toCharArray()));
	//
	// assertEquals(PLAIN_TEXT, new String(decrypted, "UTF-8"));
	// }
}