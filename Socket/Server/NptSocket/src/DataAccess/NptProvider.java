package DataAccess;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class NptProvider 
{
	 public static void SendToSocket(String ip, int port, String msg) throws IOException 
	 {
		Socket socket = new Socket(ip, port);
		
		
		PrintWriter out = new PrintWriter(socket.getOutputStream());

		InputStream in = socket.getInputStream();

		String result = "";

		out.write(msg);
		out.flush();
		System.out.println("Sent data");
		System.out.println();
		System.out.println("#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%#$%");
		System.out.println("Recieving data . . .");
		byte[] readBuffer;
		readBuffer = new byte[2048];
		int mesageSize = in.read(readBuffer, 0, 2048);
		System.out.println(mesageSize);
		result = new String(readBuffer, 0, mesageSize);
		System.out.println("Recieved data : \n" + result);
		socket.close();
		
	}
}
