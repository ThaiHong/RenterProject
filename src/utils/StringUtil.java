package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.Normalizer;
import java.util.regex.Pattern;

public final class StringUtil {
	private static StringUtil sStringUtil;

	public static StringUtil getInstance() {
		if (sStringUtil == null) {
			sStringUtil = new StringUtil();
		}
		return sStringUtil;
	}

	public String md5(String str) {
		String result = "";
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		md.update(str.getBytes());
		result = new BigInteger(1, md.digest()).toString(16);
		return result;
	}

	public String createSlug(String title) {
		String slug = Normalizer.normalize(title, Normalizer.Form.NFD);
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		slug = pattern.matcher(slug).replaceAll("");
		slug = slug.toLowerCase();
		slug = slug.replaceAll("đ", "d");
		slug = slug.replaceAll("([^0-9a-z-\\s])", "");
		slug = slug.replaceAll("[\\s]", "-");
		slug = slug.replaceAll("(-+)", "-");
		slug = slug.replaceAll("^-+", "");
		slug = slug.replaceAll("-+$", "");
		return slug;
	}
}
