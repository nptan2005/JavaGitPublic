 package hdb.iso8583;
 
 import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
 
 public class MessageHandler
 {
   private ISOPackager packager;
 
   public MessageHandler(int i)
   {
     if (i == 1) {
       this.packager = PackagerFactory.getPackagerATM();
     }
     if (i == 2)
       this.packager = PackagerFactory.getPackagerVISA();
   }
 
   public ISOMsg unpackRequest(String message)
     throws ISOException, Exception
   {
     ISOMsg isoMsg = new ISOMsg();
     isoMsg.setPackager(this.packager);
 
     isoMsg.unpack(message.getBytes());
 
     return isoMsg;
   }
 
   public String packResponse(ISOMsg message) throws ISOException, Exception
   {
     if (message.getPackager() == null) {
       message.setPackager(this.packager);
     }
 
     return new String(message.pack());
   }
 }