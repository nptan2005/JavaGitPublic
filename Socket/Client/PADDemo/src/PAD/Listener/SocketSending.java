package PAD.Listener;
import java.io.*;
import java.net.*;
import java.util.Date;
public class SocketSending {

	public static void main(String[] args) throws IOException 
	{
		// Địa chỉ máy chủ.
	    final String serverHost = "localhost";
	    final int servPort = 7890;
	    for(int i = 0; i< 2; i++)
		{
			Thread a = new Thread(new Runnable() {
				
				@Override
				public void run() {
					try {
						SendToSocket(serverHost,servPort,"TEST");
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			});
			a.start();
		}
	    SendToSocket(serverHost,servPort,"QUIT");
	}
	private static void SendToSocket(String ip, int port, String msg) 
			throws IOException 
	{
		System.out.println("[MSG] " + new Date());
		System.out.println("[MSG] Sent to " + ip + " port " + port);
		System.out.println("[MSG Clear] " + msg);
		// Địa chỉ máy chủ.
	    Socket socketOfClient = null;
	    BufferedWriter os = null;
	    BufferedReader is = null;
	    boolean aliveThreads     = true;
		try {
	           // Gửi yêu cầu kết nối tới Server đang lắng nghe
	           // trên máy 'localhost' cổng 7777.
	           socketOfClient = new Socket(ip, port);
	 
	           // Tạo luồng đầu ra tại client (Gửi dữ liệu tới server)
	           os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));
	 
	           // Luồng đầu vào tại Client (Nhận dữ liệu từ server).
	           is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
	 
	       } catch (UnknownHostException e) {
	           System.err.println("[ERR] Don't know about host " + ip);
	           return;
	       } catch (IOException e) {
	           System.err.println("[ERR] Couldn't get I/O for the connection to " + ip);
	           return;
	       }
		try {
	           while(aliveThreads){
	        	   if(socketOfClient != null){
	        		// Ghi dữ liệu vào luồng đầu ra của Socket tại Client.
	    	           os.write(msg);
	    	           os.newLine(); // kết thúc dòng
	    	           os.flush();  // đẩy dữ liệu đi.
	    	           // Đọc dữ liệu trả lời từ phía server
	    	           // Bằng cách đọc luồng đầu vào của Socket tại Client.
	    	           String responseLine;
	    	           while ((responseLine = is.readLine()) != null) {
	    	               System.out.println("[Server] " + responseLine);
	    	               if (responseLine.indexOf("OK") != -1) {
	    	            	   os.close();
	    	    	           is.close();
	    	    	           socketOfClient.close();
	    	    	           aliveThreads = false;
	    	                   break;
	    	               }
	    	           }
	    	           os.close();
	    	           is.close();
	    	           socketOfClient.close();
	        	   }else{
	        		   aliveThreads = false;
	        		   System.out.println("[MSG] Socket is null");
	        	   }
	        	   
	           }
	 
	           
	       } catch (UnknownHostException e) {
	    	   aliveThreads = false;
	           System.err.println("[ERR] Trying to connect to unknown host: " + e);
	       } catch (IOException e) {
	    	   aliveThreads = false;
	           System.err.println("[IOException]  " + e);
	       }

	}
}
