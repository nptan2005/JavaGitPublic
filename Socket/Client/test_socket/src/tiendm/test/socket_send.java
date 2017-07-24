package tiendm.test;

import hdb.iso8583.HdbIso;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.channel.ASCIIChannel;

public class socket_send {

	public static void main(String[] args) {
		
		
			
			try {
//			
//				
//			int start = 0;
//			ArrayList<String> dataArrList = new ArrayList<String>();	
//			
//			while(true){
//				start++;
//				String res = SendToSocket("HDB0~DBQuery~Ebanking~000003~ty2376~HDBO_CARD_SERVICES.get_test~"+start+"~abc~def~ghk");
//				
//				String[] dataArr = null;
//				String[] temp = res.split("~");
//				
//				
//				try{
//					String data = temp[7];
//					dataArr = data.split("#");
//				}catch(Exception e){
//					break;
//				}
//				for(int i = 0;i<dataArr.length;i++){
//					dataArrList.add(dataArr[i]);
//					System.out.println(dataArr[i]);
//					String[] datarow = dataArr[i].split("\\|");
//					String idx = datarow[0];
//					start = Integer.parseInt(idx);
//					
//				}
//			}
//			
//			
//			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
//			for(int i = 0;i<dataArrList.size();i++){
//				System.out.println(dataArrList.get(i));
//			}
			
			
			
			
			//SendToSocket("HDB0~PruInquiry~ATM~000001~ATM_MACHINE~068704070000865~10017600");
			//SendToSocket("HDB0~PruPayment~ATM~000010~ATM_MACHINE~068704070002616~123456~10000~tiendmtest");
			//SendToSocket("HDB0~CardHistory~Ebanking~000003~ty2376~800000097714~0~10");
			//SendToSocket("HDB0~CardInfo~Ebanking~000003~ty2376~800000097714~2");
			//SendToSocket("HDB0~CardList~Ebanking~000003~ty2376~0");
			//SendToSocket("HDB0~EVNTInqBill~Ebanking~000002~dinhmanhtien~068704070002616~PD0100T49465~002");
			//SendToSocket("HDB0~EVNTPayBill~Ebanking~000003~dinhmanhtien~068704070002616~PD0100T49465~923319485~4/2012~3342801~068");
			//SendToSocket("BINQ~000001~068704070012832~PD0100T06687~CT~002");
			//SendToSocket("BPAY~000001~012704070000057~PD0100T06687~923323100~2264185~4/2012~AM~068~0");
			//SendToSocket("REVS~000001~068704070012832~PD0100T06687~923323100~2264185~000065~120829~AM~068");
			//SendToSocket("HDB0~CitadFT~WEBMOBILE~600001~dinhmanhtien~002704070000187~06101000|130071001833297|14DINH MANH TIEN|17234 Phan Dang Luu|11Ho Chi Minh|0570000|11Vietcombank|00|06Ha Noi|0510000|03BEN|24test chuyen tien noi dia|18tiendm chuyen tien");
			//SendToSocket("HDB0~CitadFT~APPMOBILE~007247~dinhmanhtien~012704070000057~071000000|1108788670988|15NGUYEN NGOC TAN|05tphcm|00|00|21NHCT KCN Tan Tao HCMC|11HO CHI MINH|00|00|03OUR|04DV02|000");
			
//				for(int i = 200;i<999999;i++){
//				
//					String seq = String.format("%06d", i);
//					SendToSocket("HDB0~BankTransfer~AppMobile~" + seq + "~dinhmanhtien~020704070006138~077704070000856~000000000100~tiendm test from script");
//					
//				
//				}
				
			//SendToSocket("HDB0~BankTransferTestReversal~AppMobile~100001~dinhmanhtien~068704070012832~063704070000469~000000000200~tiendm rut tien");

//			SendToSocket("HDB0~BankTransfer~WebMobile~000008~dinhmanhtien~002704070000189~063704070000469~000040000000~test");
//			SendToSocket("HDB0~BankTransfer~AppMobile~100002~dinhmanhtien~051704070000009~022704070000647~000000000100~test3");
				
				
			//SendToSocket("HDB0~BankTransferT5~000005~1");
			
			//SendToSocket("HDB0~BankTransfer~AppMobile~000003~dinhmanhtien~068704070000176~068704070012832~000000500000~test");
			//SendToSocket("HDB0~Ministatement~WebMobile~2363~thuyind01~003704070000426~10");
			//SendToSocket("HDB0~BalanceInquiry~WebMobile~236801~dinhmanhtien~007704070000143");
			//SendToSocket("HDB0~ATM_Topup~ATM~904385~ATM_MACHINE~068704070012832~VNPAY~0934037551~50000~test from tiendm");
			//SendToSocket("HDB0~Topup~AppMobile~904387~dinhmanhtien~068704070012832~VNPAY~0934037551~50000~test from tiendm");
			//SendToSocket("HDB0~BillInquiry~AppMobile~004364~dinhmanhtien~068704070002616~09500001~0950080902");
			//SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE01000001529");
				
//			for(int i = 29300;i<39300;i=i+6){
//				
//				runThread run = new runThread(i, "068704070012832");
//				run.start();
//				runThread run2 = new runThread(i+1, "002704070000005");
//				run2.start();
//				runThread run3 = new runThread(i+2, "063704070000469");
//				run3.start();
//				runThread run4 = new runThread(i+3, "057704070000074");
//				run4.start();
//				runThread run5 = new runThread(i+4, "052704070000730");
//				run5.start();
//				runThread run6 = new runThread(i+5, "002704070000212");
//				run6.start();
//			}

			
//			SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE01000050199");
			//SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE01000022147");
			//SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE01000022507");
//			SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE05000014475");
//			SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE14000130725");
//			SendToSocket("HDB0~BillPayment~AppMobile~100294~dinhmanhtien~002704070000863~DIENHCM~PE15000243415~000000128423");
			//SendToSocket("HDB0~BillPayment~APPMOBILE~006746~dieppham~007704070000143~DIENHCM~PE15000243415~000000128423");
			//SendToSocket("HDB0~BillInquiry~AppMobile~004362~dinhmanhtien~068704070002616~109000@000001~0900080903");
			//SendToSocket("HDB0~BillPayment~AppMobile~345682~068704070002616~09500001~0950080902~000000045600");
			//SendToSocket("HDB0~EVNPayBill~WebMobile~004364~dinhmanhtien~068704070002616~DIENHCM~PE05000154150~120310~ ~000000783307");
			//SendATM("0420B22040010880800000000000060000004000000000500000000403163839004376601006770434163839040301MOBILETR7041501270407000005715002704070000005");
			//SendToSocket("HDB0~BillPayment~APPMOBILE~456789~thuyind01~012704070000057~09800002~sacadsl2~000000840000");
			//SendToSocket("HDB0~ServPayment~WEBOLP~000002~dinhmanhtien~012704070000057~06001001|06001001|100521174810|06150000|03200|05VNPAY|38TTTT TU TK 012704070000057 MAGD:001001|06804909|06345678|06804909|22cong ty Dinh Manh Tien|015|38TTTT TU TK 012704070000057 MAGD:001001");			
			//SendToSocket("HDB0~ServReversal~WEBOLP~000041~toquyen~003704070000427~06010000|06010000|100522135813|0585200|05VNPAY|39HUY TTTT MAGD:010000 TK:003704070000427|06804909|09billid123|06804909|14cong ty xi xon|39HUY TTTT MAGD:010000 TK:003704070000427");
			//SendToSocket("CTRB99999999998888888888888777777777777777");
			//ATMBilling();
			//testAtmMsg();
			//SendATM("0200B220400108A080000000000006000000400000000001000000052609100000055060110677043709100005260100001008TTHD 1245678999.CTY TNHH VT XD VI PHONG 7041500370407000027215002704070000005");
			//SendCard2Card("HDB0AccountInquiry~" + "068704070012832" +"~"+ 100000  + "~" + "000007" + "~" + "7399" + "~704~" + "9704160102479104" +"~");
			//SendCard2Card("HDB0AccountInquiry~" + "068704070012832" +"~"+ 100000  + "~" + "000006" + "~" + "7399" + "~704~" + "9704370000100005" +"~tiendmtest");
			//SendCard2Card("HDB0AccountInquiry~" + "068704070012832" +"~"+ 100000  + "~" + "000001" + "~" + "7399" + "~704~" + "9704169999999999" +"~tiendmtest");
			//SendToSocket("HDB0~C2CInquiry~AppMobile~000001~dinhmanhtien~HDB0AccountInquiry~" + "068704070012832" +"~"+ 100000  + "~" + "######" + "~" + "6011" + "~704~" + "9704370000001542" +"~");
			//SendToSocket("HDB0~C2CInquiry~AppMobile~000002~dinhmanhtien~HDB0AccountInquiry~" + "068704070012832" +"~"+ 100000  + "~" + "######" + "~" + "7399" + "~704~" + "9704169999999999" +"~");
			//SendToSocket("HDB0~C2CFT~AppMobile~100011~dinhmanhtien~HDB0FundTranfer~" + "068704070012832" +"~"+ 100000  + "~" + "######" + "~" + "6011" + "~704~" + "9704370000100005" +"~tiendm test~98765");
			//VisaMsg();

			
//			for(int i = 0; i<400; i++){
//				Thread a = new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						VisaMsg();
//						
//					}
//				});
//				a.start();
//				Thread.sleep(100);
//			}

			
			
			
			
			//SendToSocket("02360200F23E448128E0800000000000000000001649876968006230960000000000000060000618222201000630222201061816050618601290100006970437324987696800623096=16050000000000021707700063000001008000003104030832John Smith               Visa TransferUS704");
			//testUnpackVisa();
			//SendToSocket("HDB0~ServPayment~WEBOLP~000139~toquyen~003704070000427~06922605|06922605|100627145111|041000|010|06MOBIVI|38TTTT TU TK 003704070000427 MAGD:922605|06804920|06123456|06804920|27test services from tiendm 2|010|38TTTT TU TK 003704070000427 MAGD:922605");
			//SendToSocket("HDB0~OpenOFDAcct~AppMobile~100008~dinhmanhtien~002704070000187~5000000~002704070000187~068~VND~1~D~C~04/07/2012~50.5");
			//SendToSocket("HDB0~CloseOFDAcct~AppMobile~100010~dinhmanhtien~002704110000009~DINH MANH TIEN~002704070000187~DINH MANH TIEN~04/07/2012~VND~1~D~10.2~50000~30000");
			//SendToSocket("HDB0~CloseOFDAcct~APPMOBILE~108909~dieppham~007704110000001~PHAM THI DIEP~007704070000143~PHAM THI DIEP~27/06/2012~VND~36~M~12~10000000~3287");
			//SendToSocket("HDB0~Withdrawal~MOBIVI~000004~000007~804920~002704070000187~100~704~070712103128~5");
			//SendToSocket("HDB0~Ping");
			//SendToSocket("HDB0~MobiViTopup~COUNTER~004919~123654789~AAAAAAAA~012704070000057~150000~0~704~EOCE~tiendm test");
			//SendToSocket("HDB0~MobiViTopup~COUNTER~000031~hdbank_user1~MobiVi MobiVi~012704070000057~700000~0~704~quynhmai~");
			//SendToSocket("HDB0~MobiViTopup~COUNTER~000012~hdbank_user1~TEST ISER~003704070000272~100000~0~704~EOCE~");
	//SendToSocket("HDB0~ServPayment~WEBOLP~000150~toquyen~003704070000427~06987643|06987643|100114112107|041000|010|06MOBIVI|29Nap tien MOBIVI. MAGD: 987643|06804920|06123456|06804920|27test services from tiendm 2|010|29Nap tien MOBIVI. MAGD: 987643");
			//SendToSocket("HDB0~VimaruInquiry~ATM~000149~ATM_MACHINE~012704070000057~34833~000");
			//SendToSocket("HDB0~VimaruPayment~ATM~000152~ATM_MACHINE~003704070000272~39677~TRAN MINH HOANG~001~~475000~2-10-1-1*18301*285000*22101*190000");
			//SendToSocket("HDB0~VimaruAllPayment~ATM~000151~ATM_MACHINE~068704070012832~39245");
			//SendToSocket("HDB0~PartnerMonitor");
			//SendToSocket("AccountDeposit~123457~37380836~30000~001");
			//SendToSocket("HDB0~VjaAgentTopup~COUNTER~000151~dinhmanhtien~004704070000064~37380195~CONG TY TRACH NHIEM HUU HAN CAI BE XANH~72000~068~12345~NGUYỄN THỊ QUỲNH MAI~ĐINH MẠNH TIẾN TEST TIẾNG VIỆT");

				
//				for(int i = 0; i<100; i++){
//				Thread a = new Thread(new Runnable() {
//					
//					@Override
//					public void run() {
//						try {
//							SendToSocket("BankRequest~fsdf~fdg");
//						} catch (Exception e) {
//							e.printStackTrace();
//						}
//						
//					}
//				});
//				a.start();
//			}
			
//				SendToSocket("10.0.114.142",6868,"HDB0~VjaAgentQuery~EBANKING~dinhmanhtien~68686868");
				//SendToSocket("10.0.114.235",2222,"GetCompanyDetails~37391781");
			//SendToSocket("BankRequest~PE01000001529~068~17");
			
			//SendToSocket("BankRequestMaDL");
			//SendToSocket("BankRequestAddress~CONG CONG~~A");
			//SendToSocket("BankRequest~PE08000153175~068~17");
				//SendToSocket("BankRequest~PE01000001529~068~17");
			//SendToSocket("BankConfirm~PE01000001529~HDDT~117150~03122012140007~1710000001~068~068~17~1");
			//SendToSocket("BankCancel~PE01000001529~HDDT~117150~1710000001~17");
				
			//SendToSocket("BankConfirm~PE01000023169~HDDT~36806~23112012144308~1710000021~068~068~17~1");
			//SendToSocket("BankCancel~PE01000023169~HDDT~36806~1710000021~17");

				//SendToSocket("BankCancel~PE01000022280~090710~813384~1710000002~17");
				//SendToSocket("BankCancel~PE01000022280~HDDT~795663~1710000001~17");
			//SendToSocket("BankRequestHoaDon~A~18664730~17");

			//SendToSocket("HDB0~BillInquiry~AppMobile~004363~dinhmanhtien~012704070000057~DIENHCM~PE01000022507");
			//SendToSocket("HDB0~BillPayment~APPMOBILE~006746~dinhmanhtien~012704070000057~DIENHCM~PE01000022507~000000288525");
				
				
			//SendToSocket("BankRequest~PE01000102443~068~17");
			
			
			
			
//			SendToSocket("BankConfirm~PE01000102443~HDDT~265650~03122012181411~00000000000001NP~068~068~17~0");
//			SendToSocket("BankConfirm~PE01000102443~HDDT~199238~03122012181412~00000000000002NP~068~068~17~0");
//			SendToSocket("BankConfirm~PE01000102443~HDDT~39000~03122012181413~00000000000003NP~068~068~17~0");
//			SendToSocket("BankCancel~PE01000102443~HDDT~265650~00000000000001NP~17");
//			SendToSocket("BankCancel~PE01000102443~HDDT~199238~00000000000002NP~17");
//			SendToSocket("BankCancel~PE01000102443~HDDT~39000~00000000000003NP~17");
//			SendToSocket("BankCancel~PE01000102443~HDDT~265650~10000010002/2012~17");
//			SendToSocket("BankCancel~PE01000102443~HDDT~199238~10000020002/2012~17");
//			SendToSocket("BankCancel~PE01000102443~HDDT~39000~10000030002/2012~17");
//			SendToSocketHDB("HDB0~VisaCCPayment~EBANKING~000046~dinhmanhtien~068704070012832~800000098139~10000~tiendm test payment 2 credit");
//			SendToSocketHDB("HDB0~CardBlocking~EBANKING~000057~dinhmanhtien~800000098139~940973~TB~20130519");
			
			
			
//			SendToSocket("10.0.114.142",3456,
//				"TaxInq|~|COUNTER|~|0|~|0100100008|~|T01E|~|XKD01|~|2012|~|2222|~|dinhmanhtien|~|TTCNTTT-TIENDM|~|003");
//			SendToSocket("10.0.114.142",3456,
//					"TaxInq|~|COUNTER|~|1000021|~|0102629206|~|A01B04|~|NKD01|~|2011|~|4537|~|dinhmanhtien|~|TTCNTTT-TIENDM|~|003");
				
//			SendToSocket("10.0.114.235",3456,"TaxInq|~|COUNTER|~|1000021|~|3600224423060|~|01M1|~|A12|~|2014|~|10000732723|~|dinhmanhtien|~|TTCNTTT-TIENDM|~|003");
//			SendToSocket("10.0.114.142",3456,
//					"TaxConfirm|~|COUNTER|~|2000029|~|dinhmanhtien|~|MAY142|~|068|~|Dinh Manh Tien|~|456 duong ABC, P.12, Q.BT, Ho Chi Minh|~|0934.037.551|~|005704070000307|~|f106e853-70fe-4322-80a6-cde5c27874bc|~|0|~|56203001|~|Vietcombank Nha Trang|~|tru so chinh|~|dien giai thanh toan|~|theo to khai hai quan so ABC ...");
//			SendToSocket("10.0.114.235",3456,
//					"TaxCancel|~|COUNTER|~|3000019|~|dinhmanhtien|~|MAY142|~|068|~|2255d001-b294-438c-8676-dc4115a323f0|~|0");
//			
//				SendToSocket("10.0.114.142",3456,
//					"TaxGuarantee|~|COUNTER|~|4000015|~|dinhmanhtien|~|MAY142|~|068|~|Dinh Manh Tien|~|456 duong ABC, P.12, Q.BT, Ho Chi Minh|~|0934.037.551|~|7aa8d675-1ba6-41e5-ba11-4c6e741df56c|~|0|~|2013-06-26|~|2013-06-30|~|tiendm bao lanh bang tien mat");
				
//			SendToSocket("10.0.114.142",3456,
//					"TaxGuaranteeCancel|~|COUNTER|~|5000009|~|dinhmanhtien|~|MAY142|~|068|~|7aa8d675-1ba6-41e5-ba11-4c6e741df56c|~|0");
			


//			SendToSocket("10.0.114.142",3456,
//					"TaxConfirm_notFT|~|COUNTER|~|2000021|~|dinhmanhtien|~|MAY142|~|068|~|Dinh Manh Tien|~|456 duong ABC, P.12, Q.BT, Ho Chi Minh|~|0934.037.551|~|003704070000272|~|15fb5245-a03e-4162-9e32-503da5eb8475|~|0|~|56203001|~|Vietcombank Nha Trang|~|tru so chinh|~|dien giai thanh toan|~|theo to khai hai quan so ABC ...");

				
//				SendToSocket("10.0.114.142",3456,
//						"TaxCancel|~|COUNTER|~|3000025|~|dinhmanhtien|~|MAY142|~|068|~|331b2ae5-e089-460d-b30a-dfa5027e4158|~|0");

			
					//ATMTEST();
							
//				SendToSocket("10.0.114.142",3456, "TaxInq|~|COUNTER|~|100009|~|3600241066|~|X47E|~|NKD05|~|2013|~|1616|~|dinhmanhtien|~|TTCNTTT-TIENDM|~|003");
//				SendToSocket("10.0.114.142",3456,
//						"TaxConfirm|~|COUNTER|~|2000010|~|EOCT5|~|EOCA2|~|MAY142|~|068|~|Dinh Manh Tien|~|456 duong ABC, P.12, Q.BT, Ho Chi Minh|~|0934.037.551|~|009704070001025|~|c7720281-927f-44ea-a9bb-6fea30718cc7|~|0|~|79203001|~|NHNT CN TP Ho Chi Minh|~|tru so chinh|~|dien giai thanh toan");
//				SendToSocket("10.0.114.142",3456,
//						"TaxCancel|~|COUNTER|~|3000024|~|dinhmanhtien|~|MAY142|~|068|~|187134e2-e4af-4e7f-9f58-ea403a4394fa|~|0|~|0");
//				SendToSocket("10.0.114.142",3456,
//						"TaxGuarantee|~|COUNTER|~|4000024|~|dinhmanhtien|~|MAY142|~|068|~|Dinh Manh Tien|~|456 duong ABC, P.12, Q.BT, Ho Chi Minh|~|0934.037.551|~|931d2e22-13ae-4ae6-a7ce-0428e3bad897|~|0|~|2013-08-05|~|2013-08-09|~|tiendm bao lanh bang tien mat");
//				SendToSocket("10.0.114.142",3456,
//						"TaxGuaranteeCancel|~|COUNTER|~|5000012|~|dinhmanhtien|~|MAY142|~|068|~|187134e2-e4af-4e7f-9f58-ea403a4394fa|~|0|~|0");

				
			/*********************************Doi soat*****************************************************/
//			SendToSocket("10.0.114.142",3456, "Rec_TaxConfirm|~|2013-08-15");
//			Thread.sleep(1000);
//			SendToSocket("10.0.114.142",3456, "Rec_TaxConfirmCancel|~|2013-08-15");
//			Thread.sleep(1000);
//			SendToSocket("10.0.114.142",3456, "Rec_TaxGuarantee|~|2013-08-15");
//			Thread.sleep(1000);
//			SendToSocket("10.0.114.142",3456, "Rec_TaxGuaranteeCancel|~|2013-08-15");
			/***************************************************************************************/
				
				
				
			/******************************Test overload********************************************/
			
//			SendToSocket("10.0.114.235",3463, "Rec_TaxConfirm|~|2013-06-30");//test overload
			
			/***************************************************************************************/
//			SendToSocket("10.0.65.3",25008,"HDB0~DBQuery~Ebanking~000006~ty2376~HDBO_CARD_SERVICES.m_get_visa_card_list_online~"+0+"~abc");
				
//				String str = "12901800";
//				String str2 = String.format("%12s", str).replace(' ', '0');
//				System.out.println(str2);

			
			
//			SendToSocket("10.0.114.142",6887, "TaxInq|~|COUNTER|~|1058|~|TIENDM|~|DELLVOSTRO|~|068|~|0303581603");
//			SendToSocket("10.0.114.235",6887, "TaxConfirm|~|counter|~|141|~|tiendm_nhap|~|tiendm_duyet|~|DellOptiplex|~|068|~|b820b458-2ddf-4615-a2c5-f3756d7ce514|~|068704070012832|~|75000");
//			SendToSocket("10.0.114.142",6887, "TaxConfirm|~|COUNTER|~|1290|~|EOCT5|~|TIENDM|~|HDBHCM-PC|~|068|~|5a682582-cb9c-48e6-abe9-b05e6558ea07|~|052704070000666|~|1014716");
//			SendToSocket("10.0.114.142",6887, "TaxIdSearch|~|COUNTER|~|2054|~|TIENDM|~|DELLVOSTRO|~|068|~|023141876");
			
			
//			SendToSocket("10.0.114.235",3456, "TaxConfirm|~|EBANKING|~|23562|~|EBANKING|~|dc_nguoiduyetA|~| |~|016|~| |~| |~| |~|016704070000068|~|936b8e51-65e4-48f0-ac70-6e1ed222eb85|~|0|~|75202001|~|BIDV |~|BIDV CN Dong Nai|~|");

//			SendToSocket("10.0.114.142",55777, "SEARCHBYGBID|~|COUNTER|~|tiendm|~|128|~|068|~|270538879");
//			SendToSocket("10.0.114.142",55777, "IMPORTBYHAND|~|HAND|~|TIENDM");
//			SendToSocket("10.0.114.142",55777, "BINQ|~|EBANKING|~|tiendm|~|126|~|068|~|2800229484|~|2");
//			SendToSocket("10.0.65.3",55777, "BPAY|~|MANUAL|~|tiendm|~|147|~|068|~|016704070000068|~|2800008359P20140111|~|860000|~|test from tiendm");
//			SendToSocket("10.0.114.142",55777, "AUTOPAYBYHAND|~|HAND|~|TIENDM");
				
				
//			SendToSocket("10.0.114.235",6868, "GetCompanyDetails~37381061");
//			SendToSocket("10.0.114.235",6868, "AccountDeposit~123457~37381061~30000~001");
//			System.out.println("starting");
//			SendToSocket("10.0.31.97",1669, "VjaReservInq|~|EBANKING|~|999999|~|dinhmanhtien|~|EBANKING|~|001|~|14502083");
			//SendToSocket("10.0.114.235",1669, "VjaReservPmt|~|EBANKING|~|10017|~|dinhmanhtien|~|dinhmanhtien|~|EBANKING|~|001|~|13166977|~|cbe35eba-bc90-4eb5-811d-4c6015d762cb|~|068704070012832|~|10548000");
			//SendToSocket("10.0.114.235",1669, "VjaReservPmt|~|APPMOBILE|~|032757|~|phuongcm|~||~||~|001|~|13166195|~|159931c9-a87a-454c-905a-00a31a202469|~|001704070000617|~|2848000");
			//SendToSocket("10.0.114.235",1669, "VjaReservPmt|~|EBANKING|~|49163|~|quocnp|~|quocnp|~||~|001|~|13166366|~|df382502-d0ed-41f5-9c74-2a9ff5ef8354|~|003704070000550|~|1127000.0");
			//SendToSocket("10.0.114.142",1669, "VjaReservPmt|~|EBANKING|~|59165|~|dinhmanhtien|~|dinhmanhtien|~||~|001|~|13167285|~|8fedbb3d-b6a4-4038-84d1-9e2985492514|~|068704070013529|~|1160000");
			//HDB0~HDFInq~Channel~branch~trace_id~user_id~contract_id
				SendToSocket("10.0.112.132",25008, "HDB0~HDFInq~ATM~068~900002~GD_TANNP~CL001322470");
				//SendToSocket("10.0.112.132",25008, "HDB0~HDFGidInq~ATM~068~000001~GD_TANNP~024791420");
				//SendToSocket("10.0.65.3",30133, "03960100CMSCIRQ00000000000000000000000000000120140708          100191130        00                                                                                                                                                                                                                                                                                                                      00000000");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	   public static String compressISO(String isoBitmap){//==compressIso
			String hexString="";
			if(isoBitmap.length()%4!=0){
				System.out.println("Input is invalid, try again one more time");
				return "";
			}
			try {
				for(int i=0; i<isoBitmap.length(); i=i+4){
					String temp = isoBitmap.substring(i,i+4);
					long num = Long.parseLong(temp);
				    long rem;
				    while(num > 0){
				      rem = num % 10;
				      num = num / 10;
				      if(rem != 0 && rem != 1){
				       return "";
				      }
				    }
				    int number= Integer.parseInt(temp,2);
				    hexString += Integer.toHexString(number);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				return "";
			}
			return hexString;	    
		  }
	
	
	private static void SendToSocket(String ip, int port, String msg) throws IOException {
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
	

	private static void testUnpackVisa(){
		try {
			HdbIso iso = new HdbIso();
			try {
				iso.unpackMsgVISA("0200F23E448128E0800000000000000000001649876968006230960000000000000060000618222201000630222201061816050618601290100006970437324987696800623096=16050000000000021707700063000001008000003104030832John Smith               Visa TransferUS704");
			} catch (ISOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void testAtmMsg(){

		try {
			HdbIso iso = new HdbIso();
			try {
				iso.unpackMsgATM("0200B220400108A0800000000000060000004000000000000001000604134513000289601006770434134513060401WEBMOBI test from tiendm                        7041506870407001283215068704070013529");
			} catch (ISOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void VisaMsg(){
		
		try {

			ISOMsg msgIST = new ISOMsg();
			HdbIso iso = new HdbIso();
//			msgIST.setMTI("0420");
//			msgIST.set(3,"002000");
//			msgIST.set(4,"000012345600");
//			msgIST.set(7,"0809192311");//
//			msgIST.set(11,"000134");//
//			msgIST.set(18,"6010");//
//			msgIST.set(32,"970437");//
//			msgIST.set(37,"222277000134");//
//			msgIST.set(41,"06001002");//
//			msgIST.set(42,"000003000001291");//
//			msgIST.set(43,"CT TNHH MOT THANH VIEN DA NANG       704");//
//			msgIST.set(49,"704");//
//			msgIST.set(102,"004704070000064");//
			
			
			

			//block amount
			msgIST.setMTI("0200");
			msgIST.set(2,"4987686807868232");
			msgIST.set(3,"012000");
			msgIST.set(4,"000000010000");
			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
			msgIST.set(11,"010036");//
//			msgIST.set(18,"6011");//
//			msgIST.set(18,"5999");//
			msgIST.set(18,"4829");//
			msgIST.set(32,"970437");//
			msgIST.set(35,"4987686810660055=160520100000233");//
			msgIST.set(37,Util.getBit37ATM());//
			msgIST.set(41,"DMSVSTID");//
			msgIST.set(42,"DMSVSMERCHANTID");//
//			msgIST.set(41,"OFFVSTID");//
//			msgIST.set(42,"OFFVSMERCHANTID");//
			msgIST.set(43,"CT TNHH MOT THANH VIEN DA NANG       704");//
			msgIST.set(49,"704");//
			msgIST.set(102,"068704070012832");//
			//msgIST.set(90,"000090005507261022508000004987680000000000");//
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			msgIST.setMTI("0200");
//			msgIST.set(2,"9704371064199669");
//			msgIST.set(3,"150000");
//			msgIST.set(4,"000100000000");
//			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
//			msgIST.set(11,"010015");////
////			msgIST.set(18,"6011");//
//			msgIST.set(18,"6010");//
////			msgIST.set(18,"4829");//
//			msgIST.set(32,"970437");//
//			msgIST.set(37,Util.getBit37ATM());//
//			msgIST.set(41,"06001002");//
//			msgIST.set(42,"000003000001291");//
//			msgIST.set(43,"CT TNHH MOT THANH VIEN DA NANG       704");//
//			msgIST.set(49,"704");//
//			msgIST.set(102,"052704070000254");
			//msgIST.set(90,"000090005507261022508000004987680000000000");//
			
			
			//sale
//			msgIST.setMTI("0200");
//			msgIST.set(2,"4987686810660055");
//			msgIST.set(3,"000000");
//			msgIST.set(4,"000263370643");
//			msgIST.set(7,"0726132121");//
//			msgIST.set(11,"400287");////
//			msgIST.set(12,"232121");///
//			msgIST.set(13,"0722");///
//			msgIST.set(14,"1605");///
//			msgIST.set(15,"0722");///
//			//msgIST.set(18,"6010");//
//			msgIST.set(18,"5999");//
//			msgIST.set(22,"9010");//
//			msgIST.set(25,"00");//
//			msgIST.set(32,"498769");//
//			msgIST.set(35,"4987686810660055=160520100000233");//
//			msgIST.set(37,"218777000286");//
//			msgIST.set(41,"00001008");//
//			msgIST.set(42,"000003104030832");//
//			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
//			msgIST.set(49,"704");//
//			
			
			
			//balance inquiry
//			msgIST.setMTI("0200");
//			msgIST.set(2,"4987686810660055");
//			msgIST.set(3,"010000");
//			msgIST.set(4,"000000100000");
//			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
//			msgIST.set(11,"210027");//
//			msgIST.set(18,"6010");//
//			msgIST.set(32,"498768");//
//			msgIST.set(37,Util.getBit37ATM());//
//			msgIST.set(41,"DMSVS704");//
//			msgIST.set(42,"DMSVSMERCHANTID");//
////			msgIST.set(41,"00001008");//
////			msgIST.set(42,"000003104030832");//
//			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
//			msgIST.set(49,"704");//
			
//			//ministatement
//			msgIST.setMTI("0200");
//			msgIST.set(2,"4987686810660055");
//			msgIST.set(3,"380000");
//			msgIST.set(4,"000000000000");
//			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
//			msgIST.set(11,"100001");////
//			msgIST.set(18,"6011");//
//			msgIST.set(32,"970437");//
//			msgIST.set(37,Util.getBit37ATM());//
//			msgIST.set(41,"OFFVSTID");//
//			msgIST.set(42,"000003104030832");//
//			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
//			msgIST.set(49,"704");//
//			msgIST.set(102,"004704070000064");//
			
			
			//fund transfer inquiry
//			msgIST.setMTI("0200");
//			msgIST.set(2,"4987686810660055");
//			msgIST.set(3,"390000");
//			msgIST.set(4,"000000000000");
//			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
//			msgIST.set(11,"300043");////
//			msgIST.set(18,"6011");//
//			msgIST.set(32,"970437");//
//			msgIST.set(37,Util.getBit37ATM());//
//			msgIST.set(41,"OFFVSTID");//
//			msgIST.set(42,"000003104030832");//
//			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
//			msgIST.set(49,"704");//
//			msgIST.set(102,"004704070000064");//
//			msgIST.set(103,"068704070012832");//
			
			
			
////			//Acct 2 Acct
//			msgIST.setMTI("0200");
//			msgIST.set(2,"4987686810660055");
//			msgIST.set(3,"400000");
//			msgIST.set(4,"000000001000");
//			msgIST.set(7,Util.getCurrentDateTime("MMddHHmmss"));//
//			msgIST.set(11,"100013");////
//			msgIST.set(18,"6011");//
//			msgIST.set(32,"970437");//
//			msgIST.set(37,Util.getBit37ATM());//
//			msgIST.set(41,"00001008");//
//			msgIST.set(42,"000003104030832");//
//			msgIST.set(43,"ACQUIRER NAME            CITY NAME    US");//
//			msgIST.set(49,"704");//
//			msgIST.set(102,"004704070000064");//
//			msgIST.set(103,"068704070012832");//
//			
			
//			//db check msg
//			msgIST.setMTI("0200");
//			msgIST.set(3,"880000");
			
			
			
			String msg = iso.packMsgVISA(msgIST);
			
			System.out.println(msg);
//			SendATM(msg);
			String resp = SendToSocketATMLis(AddLengthPrefix(msg,4));
			iso.unpackMsgVISA(resp.substring(4));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void ATMBilling(){
		
		try {
			ISOMsg atmMsg = new ISOMsg();
			HdbIso iso = new HdbIso();
			atmMsg.setMTI("0200");
			atmMsg.set(Constant.B2_ATM_CARDNUMBER,"9704371108443552");
			atmMsg.set(Constant.B3_ATM_PROCESSCODE,"390700");
			atmMsg.set(Constant.B4_ATM_TRANSACTIONAMOUNT,"000005000000");
			atmMsg.set(Constant.B7_ATM_TRANSMISSIONDATE_TIME,"1030161756");
			atmMsg.set(Constant.B11_ATM_SYSTEMTRACEAUDITNUMBER,"005028");
			atmMsg.set(Constant.B18_ATM_MERCHANT_TYPE,"6011");
			atmMsg.set(Constant.B32_ATM_ACQUIRER_INSTITUTION_ID_CODE,"970437");
			atmMsg.set(Constant.B37_ATM_REFERENCENUMBER,"230477002806");
			atmMsg.set(Constant.B41_CARD_ACCEPTOR,"00200001");
			atmMsg.set(42,"174 Phan Dang L");
			atmMsg.set(Constant.B43_ATM_ATMLOCATION,"Second ATM                           704");
			atmMsg.set(Constant.B49_ATM_CURRENCYCODE,"704");
			atmMsg.set(Constant.B102_ATM_ACCOUNTNUMBER,"068704070012832");
			atmMsg.set(Constant.B103_ATM_CREDITACCOUNTNUMBER,"9704370000001542");
			String msg = iso.packMsgATM(atmMsg);
			msg = "CTRB"+msg;
			System.out.println(msg);
			//SendATM(msg);
			String resp = SendToSocketATMLis(msg);
			iso.unpackMsgATM(resp.substring(4));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void ATMTEST(){
		
		try {
			ISOMsg atmMsg = new ISOMsg();
			HdbIso iso = new HdbIso();
			atmMsg.setMTI("0200");
			//atmMsg.set(Constant.B2_ATM_CARDNUMBER,"9704376409737263");
			atmMsg.set(Constant.B3_ATM_PROCESSCODE,"010000");
			atmMsg.set(Constant.B4_ATM_TRANSACTIONAMOUNT,"000000000100");
			atmMsg.set(Constant.B7_ATM_TRANSMISSIONDATE_TIME,Util.getCurrentDateTime("MMddHHmmss"));
			//atmMsg.set(Constant.B7_ATM_TRANSMISSIONDATE_TIME, "0807101724");
			atmMsg.set(Constant.B11_ATM_SYSTEMTRACEAUDITNUMBER,"700021");
			atmMsg.set(Constant.B18_ATM_MERCHANT_TYPE,"6010");
			atmMsg.set(Constant.B32_ATM_ACQUIRER_INSTITUTION_ID_CODE,"970437");
			atmMsg.set(Constant.B37_ATM_REFERENCENUMBER,Util.getBit37ATM());
			//atmMsg.set(Constant.B37_ATM_REFERENCENUMBER, "101724072401");
			atmMsg.set(Constant.B41_CARD_ACCEPTOR,"HDB03601");
			atmMsg.set(Constant.B49_ATM_CURRENCYCODE,"704");
			atmMsg.set(Constant.B102_ATM_ACCOUNTNUMBER,"068704070013531");
			
			String msg = iso.packMsgATM(atmMsg);
			msg = "CTRB"+msg;
			System.out.println(msg);
			//SendATM(msg);
			long lDateTimeB4 = new Date().getTime();
			String resp = SendToSocketATMLis(msg);
			long lDateTimeAfter = new Date().getTime();
			System.out.println("Reply time in miliseconds: "+(lDateTimeAfter - lDateTimeB4));
			
			ISOMsg atmOutMsg = iso.unpackMsgATM(resp.substring(4));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void TestUnpack(String msg){
		
		try {
			HdbIso iso = new HdbIso();

			 ISOMsg atmOutMsg = iso.unpackMsgATM(msg.substring(4));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static String SendCard2Card(String input) throws Exception {

		Socket socket = new Socket("10.0.65.3", 25003);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream());

		InputStream in = socket.getInputStream();

		String result = "";

		out.write(input);
		out.flush();
		System.out.println("Sent C2C data");
		System.out.println("Recieving C2C data . . .");
		byte[] readBuffer;
		readBuffer = new byte[1024];
		int mesageSize = in.read(readBuffer, 0, 1024);
		result = new String(readBuffer, 0, mesageSize);
		System.out.println("Recieved data : " + result);
		socket.close();
		return result;
	}
	
	private static String SendToSocketATMLis(String input) throws Exception {

		//Socket socket = new Socket("127.0.0.1", 26004);
		//Socket socket = new Socket("127.0.0.1", 23456);
		Socket socket = new Socket("10.0.114.147", 23456);
		//Socket socket = new Socket("10.0.65.3", 26104);
		PrintWriter out = new PrintWriter(socket.getOutputStream());

		InputStream in = socket.getInputStream();

		String result = "";

		out.write(input);
		out.flush();
		System.out.println("Sent data");
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
	
	private static String SendToSocketHDB(String input) throws Exception {

		//Socket socket = new Socket("127.0.0.1", 26004);
//		Socket socket = new Socket("10.0.65.3", 26004);
		//Socket socket = new Socket("10.0.114.138", 26004);
		//Socket socket = new Socket("10.0.65.3", 30033);
		//Socket socket = new Socket("127.0.0.1", 30033);
		
		//Socket socket = new Socket("127.0.0.1", 25008);
		Socket socket = new Socket("10.0.65.3", 25008);
		
		//Socket socket = new Socket("127.0.0.1", 40044);
		//Socket socket = new Socket("10.0.65.3", 40044);
		//Socket socket = new Socket("10.0.114.142", 55577);
		//Socket socket = new Socket("10.0.65.3", 55577);
		//Socket socket = new Socket("127.0.0.1", 6868);
		//Socket socket = new Socket("10.0.114.235", 6868);
		
		//Socket socket = new Socket("127.0.0.1", 6969);
		//Socket socket = new Socket("10.0.114.142", 6969);
		//Socket socket = new Socket("10.0.114.235", 6969);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream());

		InputStream in = socket.getInputStream();

		String result = "";

		out.write(input);
		out.flush();
		System.out.println("Sent data");
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
	
	private static String SendATM(String msg) throws Exception {

		//Socket socket = new Socket("10.0.65.3", 26004);
		
		String ip = "10.0.114.142";
		int port = 12345;
        ASCIIChannel clientChannel = new ASCIIChannel(ip, port, new hdb.iso8583.ASCIIPackager());
        clientChannel.connect();
        clientChannel.setTimeout(90000);
        Socket The_Client = null;
        The_Client = clientChannel.getSocket();
        
        OutputStream os=The_Client.getOutputStream();
        PrintStream sendObject = new PrintStream(os);
        
        msg ="CTRB"+ msg;
        System.out.println("Start send to ATM: "+msg);
        sendObject.print(msg);
        os.flush();
        
        InputStream dataSockIn    = null;          // socket input stream
        dataSockIn = The_Client.getInputStream();
        byte[ ]     readBuffer; 
        readBuffer  = new byte[ 1024 ];
        System.out.println("Waiting msg from ATM ...");
        int mesageSize = dataSockIn.read(readBuffer, 0, 1024);
        String resultMsg = new String(readBuffer,0, mesageSize);
        System.out.println("Recieved msg from ATM: "+resultMsg);
        resultMsg = resultMsg.substring(4);
        sendObject.close();
        os.close();
        The_Client.close();
        System.out.println(resultMsg);
        HdbIso iso = new HdbIso();
        iso.unpackMsgATM(resultMsg);
        
        
        return resultMsg; 
	}
	
	private static String AddLengthPrefix(String msg, int length) {
		int msgLen = msg.length();
		String lengthStr = String.format("%0" + length + "d", msgLen);
		return lengthStr + msg;
	}

}
