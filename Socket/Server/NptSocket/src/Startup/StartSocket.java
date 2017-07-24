package Startup;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import DataAccess.NptProvider;;
public class StartSocket {

	public static void main(String[] args) 
	{
		try
		{
			NptProvider.SendToSocket("192.168.1.228",25008, "HDB0~HDFInq~ATM~068~900002~GD_TANNP~CL001322470");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
