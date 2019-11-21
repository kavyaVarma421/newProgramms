package com.blbz.jsoninventory.ServiceImplementation;

import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blbz.jsoninventory.Service.InventoryManagement;
import com.blbz.jsoninventory.UtilRepositry.Util;
import com.blbz.jsoninventory.model.IneventoryDetails;

public class InventoryImplementation implements InventoryManagement
{
	static Util util = new Util();
	
	public void writeInventory()
	{
		JSONObject object1 = new JSONObject();
		object1.put("itemName", "Rice");
		object1.put("itemWeight", 60.0);
		object1.put("itemPricePerKg", 1000.50);
		

		JSONObject object2 = new JSONObject();
		object2.put("itemName", "pulses");
		object2.put("itemWeight", 40.0);
		object2.put("itemPricePerKg", 800.0);
		
		JSONObject object3 = new JSONObject();
		object3.put("itemName", "wheat");
		object3.put("itemWeight", 70.0);
		object3.put("itemPricePerKg", 500.0);
		
		JSONArray array1 = new JSONArray();
		array1.add(object1);
		
		JSONArray array2 = new JSONArray();
		array2.add(object2);
		
		JSONArray array3 = new JSONArray();
		array3.add(object3);
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Rice", array1);
		jsonobject.put("pulses", array2);
		jsonobject.put("wheat", array3);
		
		try {
			FileWriter fw = new FileWriter("inventory/inventory.json");
			fw.write(jsonobject.toJSONString());
			fw.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void readInventory()
	{
		JSONParser parser = new JSONParser();
		
	}
	
	

	public IneventoryDetails addInventory()
	{
		IneventoryDetails details = new IneventoryDetails();
		
		System.out.println("enter the type of item name ");
		details.setItemName(util.stringInput());
		details.getItemName();
		
		System.out.println("enter the weight of that item ");
		details.setItemWeight(util.doublInput());
		details.getItemWeight();
		
		System.out.println("enter the price per kg of that item ");
		details.setItemPricePerKg(util.doublInput());
		details.getItemPricePerKg();
		return details;
	}
	
}
