 package hdb.iso8583;
 
 import java.io.InputStream;
 import org.jpos.iso.ISOException;
 import org.jpos.iso.ISOPackager;
 import org.jpos.iso.packager.GenericPackager;
 
 public class PackagerFactory
 {
   public static ISOPackager getPackagerATM()
   {
     ISOPackager packager = null;
     try {
       String filename = "iso87ascii_ATM.xml";
       InputStream is = PackagerFactory.class.getResourceAsStream(filename);
       packager = new GenericPackager(is);
     }
     catch (ISOException e) {
       e.printStackTrace();
     }
     return packager;
   }
   public static ISOPackager getPackagerVISA() {
     ISOPackager packager = null;
     try {
       String filename = "iso87ascii_ATM.xml";
       InputStream is = PackagerFactory.class.getResourceAsStream(filename);
       packager = new GenericPackager(is);
     }
     catch (ISOException e) {
       e.printStackTrace();
     }
     return packager;
   }
   public static ISOPackager getPackager() {
     ISOPackager packager = null;
     try {
       String filename = "iso87ascii.xml";
       InputStream is = PackagerFactory.class.getResourceAsStream(filename);
       packager = new GenericPackager(is);
     }
     catch (ISOException e) {
       e.printStackTrace();
     }
     return packager;
   }
 }