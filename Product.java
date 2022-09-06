package com.Question9;

public class Product implements Cloneable{
	int pid;
	String pname;
	int price;
	String unitOfMeasurement;
	
	Product(int pid, String pname, int price, String unitOfMeasurement) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	public static void main(String args[]){  
		try{  
		Product p1=new Product(101, "mobile", 12000, "rs");  
		  
		Product p2=(Product)p1.clone();  
		  
		System.out.println(p1.pname+" "+p1.pname);  
		System.out.println(p1.price+" "+p1.price);
		String pname="tv";
		boolean result1 = pname instanceof String;
	    System.out.println("name is an instance of String: " + result1);

	    boolean result2 = p1 instanceof Product;
	    System.out.println("p1 is an instance of Product: " + result2); 
		}catch(CloneNotSupportedException c){}  
		  
		}  
}
