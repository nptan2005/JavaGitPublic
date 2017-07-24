package tiendm.test;

import java.text.SimpleDateFormat;
import java.util.Date;



public final class Util {

	public static String getCurrentDateTime(String format) {
		// MM/dd/yyyy hh:mm:ss
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date date = new Date();
		return df.format(date);
	}
	
	public static String getBit37ATM(){
		return getCurrentDateTime("HHmmssMMdd")+"01";
	}
	
}

