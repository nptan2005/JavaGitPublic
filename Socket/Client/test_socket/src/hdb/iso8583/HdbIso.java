package hdb.iso8583;


import org.apache.log4j.Logger;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;

public class HdbIso {
	private static final Logger logger = Logger.getLogger(HdbIso.class);

	static char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public ISOMsg unpackMsgATM(String msg) throws ISOException {
		MessageHandler msgh = new MessageHandler(1);
		try {
			logger.info("unpackMsg_ATM : Input msg :" + msg);
			ISOMsg isoMsg = msgh.unpackRequest(msg);
			logger.info("unpackMsg_ATM : Msg unpacked:");
			for (int i = 0; i < 128; i++) {
				if (isoMsg.hasField(i)) {
					String temp = "unpackMsg_ATM : b" + i + "=" + isoMsg.getValue(i);
					logger.info(temp);
				}
			}
			return isoMsg;
		} catch (Exception e) {
			logger.error("unpackMsg : Error occur when unpack msg, wrong input msg");
			logger.error("unpackMsg : " + e.toString());
		}
		throw new ISOException();
	}

	public ISOMsg unpackMsgVISA(String msg) throws ISOException {
		MessageHandler msgh = new MessageHandler(2);
		try {
			//logger.info("unpackMsg_VISA : Input msg :" + msg);
			ISOMsg isoMsg = msgh.unpackRequest(msg);
			logger.info("unpackMsg_VISA : Msg unpacked:");
			for (int i = 0; i < 128; i++) {
				if (isoMsg.hasField(i)) {
					String fieldData = ""+isoMsg.getValue(i);
					logger.info("unpackMsg_VISA : b" + i + "=" + fieldData);
				}
			}
			return isoMsg;
		} catch (Exception e) {
			logger.error("unpackMsg_VISA : Error occur when unpack msg, wrong input msg");
			logger.error("unpackMsg_VISA : " + e.toString());
		}
		throw new ISOException();
	}

	public String packMsgATM(ISOMsg isoMsg) {
		MessageHandler msgh = new MessageHandler(1);

		String result = "";
		try {
			logger.info("packMsg_ATM : Input items :");
			for (int i = 0; i < 128; i++) {
				if (isoMsg.hasField(i)) {
					String temp = "packMsg_ATM : b" + i + "=" + isoMsg.getValue(i);
					logger.info(temp);
				}
			}
			result = msgh.packResponse(isoMsg);
			if (isoMsg.getMaxField() < 65) {
				String mti = result.substring(0, 4);
				String bitmap = result.substring(4, 20);
				String data = result.substring(20);
				bitmap = hexaToBinary(bitmap);
				bitmap = "1" + bitmap.substring(1);
				bitmap = addRightBits(bitmap, 128);
				bitmap = binaryToHexa(bitmap);
				result = mti + bitmap + data;
			}
			logger.info("packMsg : FullMsg : " + result);
			return result;
		} catch (Exception e) {
			logger.error("Error occur when pack msg, wrong input msg");
			logger.error("packMsg : " + e.toString());
		}
		return null;
	}

	public String packMsgVISA(ISOMsg isoMsg) {
		MessageHandler msgh = new MessageHandler(2);

		String result = "";
		try {
			logger.info("packMsg_VISA : Input items :");
			for (int i = 0; i < 128; i++) {
				if (isoMsg.hasField(i)) {
					String fieldData = ""+isoMsg.getValue(i);
					logger.info("packMsg_VISA : b" + i + "=" + fieldData);
				}
			}
			result = msgh.packResponse(isoMsg);
			if (isoMsg.getMaxField() < 65) {
				String mti = result.substring(0, 4);
				String bitmap = result.substring(4, 20);
				String data = result.substring(20);
				bitmap = hexaToBinary(bitmap);
				bitmap = "1" + bitmap.substring(1);
				bitmap = addRightBits(bitmap, 128);
				bitmap = binaryToHexa(bitmap);
				result = mti + bitmap + data;
			}
			//logger.info("packMsg_VISA : FullMsg : " + result);
			return result;
		} catch (Exception e) {
			logger.error("Error occur when pack msg, wrong input msg");
			logger.error("packMsg_VISA : " + e.toString());
		}
		return null;
	}

	public static String toHexString(String text) {
		byte[] b = text.getBytes();
		StringBuffer sb = new StringBuffer(b.length * 2);
		for (int i = 0; i < b.length; i++) {
			sb.append(hexChar[((b[i] & 0xF0) >>> 4)]);

			sb.append(hexChar[(b[i] & 0xF)]);
		}
		return sb.toString();
	}

	public static String encodeHexString(String sourceText) {
		byte[] rawData = sourceText.getBytes();
		StringBuffer hexText = new StringBuffer();
		String initialHex = null;
		int initHexLength = 0;

		for (int i = 0; i < rawData.length; i++) {
			int positiveValue = rawData[i] & 0xFF;
			initialHex = Integer.toHexString(positiveValue);
			initHexLength = initialHex.length();
			while (initHexLength++ < 2) {
				hexText.append("0");
			}
			hexText.append(initialHex);
		}
		return hexText.toString();
	}

	public static String decodeHexString(String hexText) {
		String decodedText = null;
		String chunk = null;

		if ((hexText != null) && (hexText.length() > 0)) {
			int numBytes = hexText.length() / 2;

			byte[] rawToByte = new byte[numBytes];
			int offset = 0;

			for (int i = 0; i < numBytes; i++) {
				chunk = hexText.substring(offset, offset + 2);
				offset += 2;
				rawToByte[i] = (byte) (Integer.parseInt(chunk, 16) & 0xFF);
			}
			decodedText = new String(rawToByte);
		}
		return decodedText;
	}

	public ISOMsg cloneIsoMsg(ISOMsg inMsg) {
		return (ISOMsg) inMsg.clone();
	}

	public String addRightBits(String s, int n) {
		String temp = String.format("%1$-" + n + "s", new Object[] { s });
		return temp.replaceAll("[\\s]", "0");
	}

	public String hexaToBinary(String isoBitmap) {
		String binString = "";
		try {
			int i = 0;
			for (int j = isoBitmap.length(); i < j; i++) {
				String number = Integer.toBinaryString(Character.digit(isoBitmap.charAt(i), 16));
				String fillNum = number;
				if (number.length() < 4) {
					for (int k = 0; k < 4 - number.length(); k++) {
						fillNum = "0" + fillNum;
					}
				}
				binString = binString + fillNum;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		return binString;
	}

	public String binaryToHexa(String iso) {
		String hexString = "";
		try {
			for (int i = 0; i < iso.length(); i += 4) {
				String temp = iso.substring(i, i + 4);
				long num = Long.parseLong(temp);

				while (num > 0L) {
					long rem = num % 10L;
					num /= 10L;
					if ((rem != 0L) && (rem != 1L)) {
						return "";
					}
				}
				int number = Integer.parseInt(temp, 2);
				hexString = hexString + Integer.toHexString(number).toUpperCase();
			}
		} catch (NumberFormatException e) {
			return "";
		}
		return hexString;
	}
}
