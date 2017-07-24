package PAD.Listener;

import PAD.ISOBuilder.*;

import org.jpos.iso.ISOChannel;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.channel.ASCIIChannel;

public class SendISOToServer {

	public static void main(String[] args)throws Exception  {
		
		/*ISOSocketThread sender = new ISOSocketThread();
		int clientNumber = 0;
		ISOMsg msg = new ISOMsg();
		 msg.setMTI("0200");
		 msg.set(2,"4987696800623096");
		 msg.set(3,"000000");
		 msg.set(4,"000171707971");
		 msg.set(7,"0621112924");//
		 msg.set(11,"000745");////
		 msg.set(12,"112924");////
		 msg.set(13,"0621");////
		 msg.set(14,"1605");//
		 msg.set(15,"0621");//
		 msg.set(18,"5999");//
		 msg.set(25,"00");//
		 msg.set(32,"498769");//
		 msg.set(37,"217377000745");//
		 msg.set(38,"201432");//
		 msg.set(41,"00001008");//
		 msg.set(42,"000003104030832");//
		 msg.set(43,"ACQUIRER NAME            CITY NAME    US");//
		 msg.set(49,"704");//
		
		sender.setISOMsg(msg);
		sender.start();*/
		try{
			ISOPackager istIsoPacker = ISOPackageBuilder.getPackagerVISA();
	    	ISOChannel channel = new ASCIIChannel("localhost", 7890, istIsoPacker);
	    	channel.connect();
	    	ISOMsg msgIST = new ISOMsg();
			msgIST.setMTI("0200");
			msgIST.set(2,"4987696800623096");
			msgIST.set(3,"000000");
			msgIST.set(4,"000171707971");
			msgIST.set(7,"0621112924");//
			msgIST.set(11,"000745");////
			msgIST.set(12,"112924");////
			msgIST.set(13,"0621");////
			msgIST.set(14,"1605");//
			msgIST.set(15,"0621");//
			msgIST.set(18,"5999");//
			msgIST.set(25,"00");//
			msgIST.set(32,"498769");//
			msgIST.set(37,"217377000745");//
			msgIST.set(38,"201432");//
			msgIST.set(41,"00001008");//
			msgIST.set(42,"000003104030832");//
			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
			msgIST.set(49,"704");//
	         channel.send(msgIST);
	         msgIST.dump(System.out, "request msg");
	         ISOMsg r = channel.receive();
	         r.dump(System.out, "response msg");
	         System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
