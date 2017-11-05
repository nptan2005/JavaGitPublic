package PAD.Listener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class ServListener 
{
	public static void main(String args[]) throws IOException 
	{
		 
	       ServerSocket listener = null;
	       
	       System.out.println("[MSG] Server is waiting to accept user...");
	       int clientNumber = 0;
	 
	 
	       // Mở một ServerSocket tại cổng 7777.
	       // Chú ý bạn không thể chọn cổng nhỏ hơn 1023 nếu không là người dùng
	       // đặc quyền (privileged users (root)).
	       try 
	       {
	    	   int servPort = 7890;
	           listener = new ServerSocket(servPort);
	       } catch (IOException e) {
	           System.out.println(e);
	           System.exit(1);
	       }
	 
	       try {
	           while (true) {
	 
	 
	               // Chấp nhận một yêu cầu kết nối từ phía Client.
	               // Đồng thời nhận được một đối tượng Socket tại server.
	 
	               Socket socketOfServer = listener.accept();
	               new ServiceThread(socketOfServer, clientNumber++).start();
	           }
	       } finally {
	           listener.close();
	       }
	}
	private static void log(String message) 
	{
		System.out.println(message);
	}
	private static class ServiceThread extends Thread 
	{
		private int clientNumber;
		private Socket socketOfServer;
		
		public ServiceThread(Socket socketOfServer, int clientNumber) 
		{
			this.clientNumber = clientNumber;
			this.socketOfServer = socketOfServer;
			
			// Log
			log("[MSG] New Connection");
			log("[Client Number] " + this.clientNumber);
			log("[Socket Info] " + socketOfServer);
			log("################################################");
	      
		}
		@Override
		public void run() 
		{
			boolean aliveThreads     = true;
			try 
			{
				// Mở luồng vào ra trên Socket tại Server.
		        BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
		        BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
		         
		        while (aliveThreads) 
				{
		        	if(socketOfServer != null){
		        		// Đọc dữ liệu tới server (Do client gửi tới).
			              String line = is.readLine();
			              log("[Client MSG] " + line);
			              // Ghi vào luồng đầu ra của Socket tại Server.
			              // (Nghĩa là gửi tới Client).
			              if(line != null && line != ""){
			            	  os.write("[Receiced message] " + line);
				              // Kết thúc dòng
				              os.newLine();
				              // Đẩy dữ liệu đi
				              os.flush();
			              }

			              // Nếu người dùng gửi tới QUIT (Muốn kết thúc trò chuyện).
			            if (line.equals("QUIT")) 
						{
			                  os.write(">> OK");
			                  os.newLine();
			                  os.flush();
			                  break;
			             }
		        	}else{
		        		aliveThreads = false;
		        		log("[MSG] " + socketOfServer + " IS NULL");
		        	}
		              
		          }
		 
		    } 
			catch (IOException e) 
			{
				aliveThreads = false;
		        System.out.println(e);
		        e.printStackTrace();
		    }
		}
	
	}
		
}
