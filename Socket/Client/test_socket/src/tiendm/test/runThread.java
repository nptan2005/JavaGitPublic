package tiendm.test;

import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

class runThread extends Thread{
	
	private int c;
	private String acct;
	
	public runThread(int c, String acct){
		
		this.c = c;
		this.acct = acct;
		
		
	}
	
	
	
	
	
	@Override
	public void run() {
		String seq = String.format("%06d", c);
		System.out.println(seq);

			try {
				SendToSocket("HDB0~BankTransfer~AppMobile~" + seq + "~dinhmanhtien~003704070001249~"+acct+"~000000000100~tiendm test from script"+seq);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}





	private static String SendToSocket(String input) throws Exception {

		Socket socket = new Socket("localhost", 7890);
		//Socket socket = new Socket("127.0.0.1", 25008);

		PrintWriter out = new PrintWriter(socket.getOutputStream());

		InputStream in = socket.getInputStream();

		String result = "";

		out.write(input);
		out.flush();
		System.out.println("Sent data "+ input);
		System.out.println();
		System.out.println("#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%");
		System.out.println("Recieving data . . .");
		byte[] readBuffer;
		readBuffer = new byte[2048];
		int mesageSize = in.read(readBuffer, 0, 2048);
		result = new String(readBuffer, 0, mesageSize);
		System.out.println("Recieved data : " + result);
		socket.close();
		return result;
	}
	
	
	
}
