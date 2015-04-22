package controllers;

import com.debortoliwines.openerp.api.FilterCollection;
import com.debortoliwines.openerp.api.ObjectAdapter;
import com.debortoliwines.openerp.api.Row;
import com.debortoliwines.openerp.api.RowCollection;
import com.debortoliwines.openerp.api.Session;

public class Erpcon {
	
	
	private static Row newPartner;
	private static Row changeCode;
	private static FilterCollection filter;
	//private static  partners;
	public static void main(String[] args){
		
		try{
			Session openERPSession= Session("192.168.1.29",8069,"odoo","admin","odoo");
			openERPSession.startSession();
		    System.out.println("connection success");
			
			ObjectAdapter partnerAd=openERPSession.getObjectAdapter("res.partner");
			
			/*FilterCollection filters=new FilterCollection();
			
			
			filters.add("name","=",true);
			filters.add("email","=",true);
			
			RowCollection partners=partnerAd.searchAndReadObject(filters,new String[] {"name","email"});
			
			Row Row = partners.get(0);
			Row.put("name", "kiwi");
			
			boolean success=partnerAd.writeObject(Row, true);*/
			/*Row Row = partners.get(0);
			Object partners;
			
		}
			/*if(success){
				System.out.println("update");
		}
	}*/
			//filters.add("name","=","aaa");
			
			
			//filters.add("mobile","=",true);*/
			Row newPartner=partnerAd.getNewRow(new String[] {"name","street","mobile","email","function"});
			newPartner.put("name", "deepal");
			newPartner.put("street", "527 main/n chennai");
			newPartner.put("mobile", "098765432");
			newPartner.put("email","ary@gamil.com");
			newPartner.put("function","technical Assisstant");
			
			//newPartner.put(fieldName, value);
			partnerAd.createObject(newPartner);
			
			
			//boolean success=partnerAd.writeObject( changedCode, true);
			//for(Row row:partners){
				System.out.println("New Row ID:" +newPartner.getID());
				//System.out.println("Price List:" +row.get("list_price"));
				
			
			
		}
		
		catch(Exception e){
			System.out.println("error:\n"+e.getMessage());
		}
	}
	private static Session Session(String string, int i, String string2,
			String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main2(String[] args){
		System.out.println("update");
		update("deepal","deepal@gamil.com");
		
	}
	private static void update(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
		

}

	
	


