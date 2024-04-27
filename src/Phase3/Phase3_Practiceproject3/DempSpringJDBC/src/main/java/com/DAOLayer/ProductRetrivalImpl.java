package com.DAOLayer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.Product;
import com.beans.ProductInfo;

public class ProductRetrivalImpl {

	private DataSource dataSource;
	private JdbcTemplate template;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		template = new JdbcTemplate(dataSource);
		//System.out.println("Connected...");
	}
	
	

	public List<Product> ShowProductsInfo() {		 
		 List<Product>  prd_list = template.query("select * from productinfo", new ProductRowMapper());
		return prd_list;
	}
	
	public Product SearchProduct(int pid) {
		Product prdinfo = null;
		try {
			String qry = "Select * from productinfo where prdid=?";
			prdinfo = template.queryForObject(qry, new Object[] {pid}, new ProductRowMapper());			
		} catch (Exception e) {
			//System.out.println(e);
			prdinfo = null;
		}
		return prdinfo;
	}
}