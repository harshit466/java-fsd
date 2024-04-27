package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAOLayer.ProductRetrivalImpl;
import com.beans.Product;

public class SearchProduct {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductRetrivalImpl pall = (ProductRetrivalImpl)fact.getBean("dbConObj2");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product ID ");
		int pid = sc.nextInt();
		
		Product p = pall.SearchProduct(pid);
		
		if(p!=null)
		{
			System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getPrice() + "\t" + p.getStk());
		}
		else
			System.out.println("Product Not Found....");
	}
}