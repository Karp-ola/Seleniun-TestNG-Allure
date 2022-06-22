package utils;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class StringModifier {

	public static String createUniqueString(String string){
		return string + " " + new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
	}

	public static Integer createRandomLength(){
		return (int)((Math.random()*10)+4);
	}

	public static String createRandomEmail(){
		String email;
		String str ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		int length = createRandomLength();
		for(int i=0;i<length;i++){
			int number=random.nextInt(62);
			sb.append(str.charAt(number));
		}
		email  = sb.toString() + "@mail.ru";
		return email;

	}

	public static String createPasswordString(){
		String password;
		String str ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		SecureRandom random = new SecureRandom();
		StringBuffer sb = new StringBuffer();
		int length = createRandomLength();
		for(int i = 0;i < length; i++){
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		password = sb.toString();
		return password;
	}
}
