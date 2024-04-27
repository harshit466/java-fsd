package com.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.DAOLayer.ProductDAO;
import com.beans.ProductInfo;

public class ProductMain {

	public static void main(String[] args) {
		ApplicationContext  fact = new ClassPathXmlApplicationContext("dbconfig.xml");	
		ProductDAO  p_dao = (ProductDAO)fact.getBean("dbConObj");
		ProductInfo pinfo = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Product\n2. View Products\n3. Search Products\n4. Update Product\n5. Delete Product\n6. Exit");
			System.out.println("Pick ur Choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				pinfo = new ProductInfo();
				
				System.out.println("Product Name : ");
				pinfo.setPrdname(sc.next());
				System.out.println("Product Price : ");
				pinfo.setPrice(sc.nextFloat());
				System.out.println("Product Stock : ");
				pinfo.setStock(sc.nextInt());
				if(p_dao.AddProduct(pinfo).equals("Success"))
					System.out.println("Product is Added...");
				else
					System.out.println("Error");
				break;
			case 2:
				List<ProductInfo>  prdlist = p_dao.ShowAll();
				if(prdlist.isEmpty())
					System.out.println("No Products exist");
				else
				{
					for(ProductInfo p : prdlist)
					{
						System.out.println(p.getPrdid() + "\t" + p.getPrdname() + "\t" + p.getPrice() + "\t" + p.getStock());
					}
				}
				break;
			case 3:
				System.out.println("Product ID : ");
				int pid = sc.nextInt();
				pinfo = p_dao.SearchProduct(pid);
				if(pinfo!=null)
					System.out.println(pinfo.getPrdid() + "\t" + pinfo.getPrdname() + "\t" + pinfo.getPrice() + "\t" + pinfo.getStock());
				else
					System.out.println("Product Not Found...");
				break;
			case 4:
				System.out.println("Product ID : ");
				pid = sc.nextInt();
				pinfo = p_dao.SearchProduct(pid);
				if(pinfo!=null)
				{
					System.out.println("Present Name of Product : " + pinfo.getPrdname());
					System.out.println("New Name of Product : ");
					pinfo.setPrdname(sc.next());
					if(p_dao.UpdateProduct(pinfo).equals("Success"))
						System.out.println("Product Name is Modified....");
				}
				else
					System.out.println("Product Not Found...");
				break;
			case 5:
				System.out.println("Product ID : ");
				pid = sc.nextInt();
				pinfo = p_dao.SearchProduct(pid);
				if(pinfo!=null)
				{
					if(p_dao.DeleteProduct(pid).equals("Success"))
						System.out.println("Product Deleted....");
				}
				else
					System.out.println("Product Not Found...");
				break;				
			case 6:
				System.out.println("Thanks for using app");
				System.exit(0);
			}
		}
	}
}