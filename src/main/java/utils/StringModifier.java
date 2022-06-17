package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringModifier {

	public static String createUniqueString(String string){
		return string + " " + new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
	}
}
