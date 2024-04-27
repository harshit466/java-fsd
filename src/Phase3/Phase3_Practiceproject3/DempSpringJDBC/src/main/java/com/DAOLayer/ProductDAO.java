package com.DAOLayer;

import java.util.List;

import com.beans.ProductInfo;

public interface ProductDAO {
	public String AddProduct(ProductInfo prd);
	public List<ProductInfo> ShowAll();
	public ProductInfo SearchProduct(int pid);
	public String UpdateProduct(ProductInfo prd);
	public String DeleteProduct(int pid);
}