import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class MainClass 
{
  public static void main(String argv[]) 
  {
	  
    try {
    	
			File file1 = new File("/Users/Sathya/eclipse-workspace-accolite-study/AdvancedJava/lisence.xml");
			DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder1 = dbFactory1.newDocumentBuilder();
			Document doc1 = dBuilder1.parse(file1);
			doc1.getDocumentElement().normalize();
		
			File file2 = new File("/Users/Sathya/eclipse-workspace-accolite-study/AdvancedJava/lisence2.xml");
			DocumentBuilderFactory dbFactory2 = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder2 = dbFactory2.newDocumentBuilder();
			Document doc2 = dBuilder2.parse(file2);
			doc2.getDocumentElement().normalize();
			
			WritableWorkbook workBook1= Workbook.createWorkbook(new File("/Users/Sathya/eclipse-workspace-accolite-study/AdvancedJava/Merged.csv"));	
			WritableSheet sheet1 = workBook1.createSheet("First Sheet", 0);
			
			WritableWorkbook workBook2= Workbook.createWorkbook(new File("/Users/Sathya/eclipse-workspace-accolite-study/AdvancedJava/InvalidLisences1.csv"));	
			WritableSheet sheet2 = workBook2.createSheet("First Sheet", 0);
			
			WritableWorkbook workBook3= Workbook.createWorkbook(new File("/Users/Sathya/eclipse-workspace-accolite-study/AdvancedJava/InvalidLisences2.csv"));	
			WritableSheet sheet3 = workBook3.createSheet("First Sheet", 0);
			
			Label label1=new Label(0,0,"niprNumber");
			Label label2=new Label(1,0,"entityId");
			Label label3=new Label(2,0,"secondaryId");
    			Label label4=new Label(3,0,"dateStatus");
			Label label5=new Label(4,0,"licenseClass");
			Label label6=new Label(5,0,"licenseClassCode");
			Label label7=new Label(6,0,"licenseExpirationDate");
			Label label8=new Label(7,0,"licenseIssusDate");
			Label label9=new Label(8,0,"licenseNumber");
			Label label10=new Label(9,0,"licenseStatus");
			Label label11=new Label(10,0,"stateCode");
			Label label12=new Label(11,0,"stateId");
			
			Label label13=new Label(0,0,"niprNumber");
			Label label14=new Label(1,0,"entityId");
			Label label15=new Label(2,0,"secondaryId");
			Label label16=new Label(3,0,"dateStatus");
			Label label17=new Label(4,0,"licenseClass");
			Label label18=new Label(5,0,"licenseClassCode");
			Label label19=new Label(6,0,"licenseExpirationDate");
			Label label20=new Label(7,0,"licenseIssusDate");
			Label label21=new Label(8,0,"licenseNumber");
			Label label22=new Label(9,0,"licenseStatus");
			Label label23=new Label(10,0,"stateCode");
			Label label24=new Label(11,0,"stateId");
			
			Label label25=new Label(0,0,"niprNumber");
			Label label26=new Label(1,0,"entityId");
			Label label27=new Label(2,0,"secondaryId");
			Label label28=new Label(3,0,"dateStatus");
			Label label29=new Label(4,0,"licenseClass");
			Label label30=new Label(5,0,"licenseClassCode");
			Label label31=new Label(6,0,"licenseExpirationDate");
			Label label32=new Label(7,0,"licenseIssusDate");
			Label label33=new Label(8,0,"licenseNumber");
			Label label34=new Label(9,0,"licenseStatus");
			Label label35=new Label(10,0,"stateCode");
			Label label36=new Label(11,0,"stateId");
		
			sheet1.addCell(label1);
			sheet1.addCell(label2);
			sheet1.addCell(label3);
			sheet1.addCell(label4);
			sheet1.addCell(label5);
			sheet1.addCell(label6);
			sheet1.addCell(label7);
			sheet1.addCell(label8);
			sheet1.addCell(label9);
			sheet1.addCell(label10);
			sheet1.addCell(label11);
			sheet1.addCell(label12);
			
			sheet2.addCell(label13);
			sheet2.addCell(label14);
			sheet2.addCell(label15);
			sheet2.addCell(label16);
			sheet2.addCell(label17);
			sheet2.addCell(label18);
			sheet2.addCell(label19);
			sheet2.addCell(label20);
			sheet2.addCell(label21);
			sheet2.addCell(label22);
			sheet2.addCell(label23);
			sheet2.addCell(label24);
			
			sheet3.addCell(label25);
			sheet3.addCell(label26);
			sheet3.addCell(label27);
			sheet3.addCell(label28);
			sheet3.addCell(label29);
			sheet3.addCell(label30);
			sheet3.addCell(label31);
			sheet3.addCell(label32);
			sheet3.addCell(label33);
			sheet3.addCell(label34);
			sheet3.addCell(label35);
			sheet3.addCell(label36);
//			
			NodeList nList1 = doc1.getElementsByTagName("CSR_Producer");
			NodeList nList2 = doc2.getElementsByTagName("CSR_Producer");
	
		
			String niprNumber1 = null,entityId1 = null,secondaryId1 = null,dateStatus1 = null,licenseClass1 = null,licenseClassCode1=null,licenseExpirationDate1=null,licenseIssusDate1=null,licenseNumber1 = null,licenseStatus1=null,stateCode1 = null,stateId1=null;
			String niprNumber2 = null,entityId2,secondaryId2,dateStatus2 = null,licenseClass2,licenseClassCode2,licenseExpirationDate2,licenseIssusDate2,licenseNumber2 = null,licenseStatus2,stateCode2 = null,stateId2;
	
			int k=1,n=1,m=1;
			
			for (int i = 0; i < nList1.getLength(); i++) 
			{
		
				Node nNode1 = nList1.item(i);
				if (nNode1.getNodeType() == Node.ELEMENT_NODE) 
				{
					Element eElement1 = (Element) nNode1;
					niprNumber1=(eElement1.getAttribute("NIPR_Number"));
					entityId1=(eElement1.getAttribute("Entity_Id"));
					secondaryId1=(eElement1.getAttribute("Secondary_ID"));
				
					dateStatus1=(eElement1.getElementsByTagName("Date_Status_Effective").item(0).getTextContent());
					licenseClass1=(eElement1.getElementsByTagName("License_Class").item(0).getTextContent());
					licenseClassCode1=(eElement1.getElementsByTagName("License_Class_Code").item(0).getTextContent());
					licenseExpirationDate1=( eElement1.getElementsByTagName("License_Expiration_Date").item(0).getTextContent());
					licenseIssusDate1=(eElement1.getElementsByTagName("License_Issue_Date").item(0).getTextContent());
					licenseNumber1=(eElement1.getElementsByTagName("License_Number").item(0).getTextContent());
					licenseStatus1=(eElement1.getElementsByTagName("License_Status").item(0).getTextContent());
					stateCode1=(eElement1.getElementsByTagName("State_Code").item(0).getTextContent());
					stateId1=(eElement1.getElementsByTagName("State_ID").item(0).getTextContent());
					
					System.out.println("hello");
				}
				for (int j = 0; j < nList2.getLength(); j++) 
				{
			
					Node nNode2 = nList2.item(j);
					if (nNode2.getNodeType() == Node.ELEMENT_NODE) 
					{
						Element eElement2 = (Element) nNode2;
						niprNumber2=(eElement2.getAttribute("NIPR_Number"));
						entityId1=(eElement2.getAttribute("Entity_Id"));
						secondaryId1=(eElement2.getAttribute("Secondary_ID"));
					
						dateStatus2=(eElement2.getElementsByTagName("Date_Status_Effective").item(0).getTextContent());
						licenseClass2=(eElement2.getElementsByTagName("License_Class").item(0).getTextContent());
						licenseClassCode2=(eElement2.getElementsByTagName("License_Class_Code").item(0).getTextContent());
						licenseExpirationDate2=(eElement2.getElementsByTagName("License_Expiration_Date").item(0).getTextContent());
						licenseIssusDate2=(eElement2.getElementsByTagName("License_Issue_Date").item(0).getTextContent());
						licenseNumber2=(eElement2.getElementsByTagName("License_Number").item(0).getTextContent());
						licenseStatus2=(eElement2.getElementsByTagName("License_Status").item(0).getTextContent());
						stateCode2=(eElement2.getElementsByTagName("State_Code").item(0).getTextContent());
						stateId2=(eElement2.getElementsByTagName("State_ID").item(0).getTextContent());
						
						System.out.println("hello");

					}
					
					if(niprNumber2.equals(niprNumber1)&&stateCode2.equals(stateCode1)&&licenseNumber2.equals(licenseNumber1)&&dateStatus2.equals(dateStatus1))
					{
						System.out.println("yes");
						Label label37=new Label(0,k,niprNumber1);
						Label label38=new Label(1,k,entityId1);
						Label label39=new Label(2,k,secondaryId1);
						Label label40=new Label(3,k,dateStatus1);
						Label label41=new Label(4,k,licenseClass1);
						Label label42=new Label(5,k,licenseClassCode1);
						Label label43=new Label(6,k,licenseExpirationDate1);
						Label label44=new Label(7,k,licenseIssusDate1);
						Label label45=new Label(8,k,licenseNumber1);
						Label label46=new Label(9,k,licenseStatus1);
						Label label47=new Label(10,k,stateCode1);
						Label label48=new Label(11,k,stateId1);
						sheet1.addCell(label37);
						sheet1.addCell(label38);
						sheet1.addCell(label39);
						sheet1.addCell(label40);
						sheet1.addCell(label41);
						sheet1.addCell(label42);
						sheet1.addCell(label43);
						sheet1.addCell(label44);
						sheet1.addCell(label45);
						sheet1.addCell(label46);
						sheet1.addCell(label47);
						sheet1.addCell(label48);
						
						k++;
					}
					else if(niprNumber2.equals("")||stateCode2.equals("")||licenseNumber2.equals("")||dateStatus2.equals(""))
					{
						Label label49=new Label(0,n,niprNumber1);
						Label label50=new Label(1,n,entityId1);
						Label label51=new Label(2,n,secondaryId1);
						Label label52=new Label(3,n,dateStatus1);
						Label label53=new Label(4,n,licenseClass1);
						Label label54=new Label(5,n,licenseClassCode1);
						Label label55=new Label(6,n,licenseExpirationDate1);
						Label label56=new Label(7,n,licenseIssusDate1);
						Label label57=new Label(8,n,licenseNumber1);
						Label label58=new Label(9,n,licenseStatus1);
						Label label59=new Label(10,n,stateCode1);
						Label label60=new Label(11,n,stateId1);
						sheet2.addCell(label49);
						sheet2.addCell(label50);
						sheet2.addCell(label51);
						sheet2.addCell(label52);
						sheet2.addCell(label53);
						sheet2.addCell(label54);
						sheet2.addCell(label55);
						sheet2.addCell(label56);
						sheet2.addCell(label57);
						sheet2.addCell(label58);
						sheet2.addCell(label59);
						sheet2.addCell(label60);
						
						n++;
					}
					else if(niprNumber1.equals("")||stateCode1.equals("")||licenseNumber1.equals("")||dateStatus1.equals(""))
					{
						Label label61=new Label(0,m,niprNumber1);
						Label label62=new Label(1,m,entityId1);
						Label label63=new Label(2,m,secondaryId1);
						Label label64=new Label(3,m,dateStatus1);
						Label label65=new Label(4,m,licenseClass1);
						Label label66=new Label(5,m,licenseClassCode1);
						Label label67=new Label(6,m,licenseExpirationDate1);
						Label label68=new Label(7,m,licenseIssusDate1);
						Label label69=new Label(8,m,licenseNumber1);
						Label label70=new Label(9,m,licenseStatus1);
						Label label71=new Label(10,m,stateCode1);
						Label label72=new Label(11,m,stateId1);
						sheet3.addCell(label61);
						sheet3.addCell(label62);
						sheet3.addCell(label63);
						sheet3.addCell(label64);
						sheet3.addCell(label65);
						sheet3.addCell(label66);
						sheet3.addCell(label67);
						sheet3.addCell(label68);
						sheet3.addCell(label69);
						sheet3.addCell(label70);
						sheet3.addCell(label71);
						sheet3.addCell(label72);
						m++;
					}
				}
		 }
			workBook1.write();
			workBook2.write();
			workBook3.write();
			
			workBook1.close();
			workBook2.close();
			workBook3.close();
			
    }
	catch (Exception e) 
	{
		e.printStackTrace();
	}
  }

}