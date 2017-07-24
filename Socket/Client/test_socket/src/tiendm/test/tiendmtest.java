package tiendm.test;

public class tiendmtest {
//	public static byte[] sharedkey = null;
//	public static byte[] sharedvector = null;
	
	public static final byte[] sharedkey = { 0x01, 0x02, 0x03, 0x05, 0x07, 0x0B,
		   0x0D, 0x11, 0x12, 0x11, 0x0D, 0x0B, 
		   0x07, 0x02, 0x04, 0x08, 0x01, 0x02, 
		   0x03, 0x05, 0x07, 0x0B, 0x0D, 0x11 };

public static final byte[] sharedvector = { 0x01, 0x02, 0x03, 0x05, 
			  0x07, 0x0B, 0x0D, 0x11 };

	public static void main(String[] args) {
//		try {
//			initEncryptionInfo("1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4", "8,7,6,5,4,3,2,1");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		for(int i = 0;i<sharedvector.length;i++){
			System.out.println(sharedvector[i]);
		}

	}

//	public static void initEncryptionInfo(String key, String vector) throws Exception {
//		String[] temp = key.split(",");
//		if (temp.length < 24) {
//			throw new Exception("[ERROR]Invalid key format, must be 24 hex chars");
//		}
//		byte[] keyTemp = new byte[24];
//		for (int i = 0; i < 24; i++) {
//			int intTemp;
//			try {
//				intTemp = Integer.parseInt(temp[i]);
//			} catch (Exception e) {
//				throw new Exception("[ERROR]Invalid key format, key member must be a number");
//			}
//			keyTemp[i] = (byte) intTemp;
//		}
//		sharedkey = keyTemp.clone();
//		String[] temp2 = vector.split(",");
//		if (temp2.length < 8) {
//			throw new Exception("[ERROR]Invalid vector format, must be 8 hex chars");
//		}
//		byte[] vectorTemp = new byte[8];
//		for (int i = 0; i < 8; i++) {
//			int intTemp2;
//			try {
//				intTemp2 = Integer.parseInt(temp2[i]);
//			} catch (Exception e) {
//				throw new Exception("[ERROR]Invalid vector format, vector member must be a number");
//			}
//			vectorTemp[i] = (byte) intTemp2;
//		}
//		sharedvector = vectorTemp.clone();
//	}

}
