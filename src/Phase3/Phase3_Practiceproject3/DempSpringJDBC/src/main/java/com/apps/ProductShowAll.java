package com.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAOLayer.ProductRetrivalImpl;
import com.beans.Product;

public class ProductShowAll {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductRetrivalImpl pall = (ProductRetrivalImpl)fact.getBean("dbConObj2");
		List<Product>  plist = pall.ShowProductsInfo();
		
		for(Product p : plist)
		{
			System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getPrice() + "\t" + p.getStk());
		}
	}
}