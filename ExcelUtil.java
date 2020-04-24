package com.hibernate.Hibernate_Example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExcelUtil {

public static void main(String[] args) {
		
		String path = "C:\\java\\thaicreate.csv";
		
		try {
		
				ArrayList<String> header = new ArrayList<String>();
				ArrayList<String> row = new ArrayList<String>();
				LinkedHashMap<String, String> map;
				
				/*** Rows 1 ***/
				map = new LinkedHashMap<String, String>();
				map.put("CustomerID","C001");
				map.put("Name", "Win Weerachai");
				map.put("Email", "win.weerachai@thaicreate.com");
				map.put("CountryCode", "TH");
				map.put("Budget", "1000000");
				map.put("Used", "600000");
				
				 for (Map.Entry<String,String> entry : map.entrySet())   {
			            header.add(entry.getKey()); 
			            row.add(entry.getValue()); 
			    } 
				

				/*** Rows 2 ***//*
				map = new HashMap<String, String>();
				map.put("CustomerID","C002");
				map.put("Name", "John  Smith");
				map.put("Email", "john.smith@thaicreate.com");
				map.put("CountryCode", "UK");
				map.put("Budget", "2000000");
				map.put("Used", "800000");
				myArrList.add(map);
				
				*//*** Rows 3 ***//*
				map = new HashMap<String, String>();
				map.put("CustomerID","C003");
				map.put("Name", "Jame Born");
				map.put("Email", "jame.born@thaicreate.com");
				map.put("CountryCode", "US");
				map.put("Budget", "3000000");
				map.put("Used", "600000");
				myArrList.add(map);
				
				*//*** Rows 4 ***//*
				map = new HashMap<String, String>();
				map.put("CustomerID","C004");
				map.put("Name", "Chalee Angel");
				map.put("Email", "chalee.angel@thaicreate.com");
				map.put("CountryCode", "US");
				map.put("Budget", "4000000");
				map.put("Used", "100000");
				myArrList.add(map);*/
				
				File f= new File(path);
				if(!f.exists()) {
					f.createNewFile();
				}
				FileWriter writer;
				writer = new FileWriter(f, false);  //True = Append to file, false = Overwrite
				
				// Write CSV
				//header
				for (int i = 0; i < header.size(); i++) {	 
					writer.write(header.get(i));
					writer.write(",");
				}
				//values
				writer.write("\r\n");
				for (int i = 0; i < row.size(); i++) {	 
					writer.write(row.get(i));
					writer.write(",");
				}
				
				System.out.println("Write success!");
				writer.close();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
}
