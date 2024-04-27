package com.DAOLayer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.beans.ProductInfo;

public class ProductDAOImpl implements ProductDAO {

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

	@Override
	public String AddProduct(ProductInfo prd) {
		String res = "Err";
		String qry = "Insert into ProductInfo(prdname, price, stock) values(?,?,?)";
		int rinfo = template.update(qry, new Object[] {prd.getPrdname(), prd.getPrice(), prd.getStock()});
		if(rinfo>=1)
			res="Success";
		return res;
	}

	@Override
	public List<ProductInfo> ShowAll() {		 
		 List<ProductInfo>  prd_list = template.query("select * from productinfo", new BeanPropertyRowMapper(ProductInfo.class));
		return prd_list;
	}

	@Override
	public ProductInfo SearchProduct(int pid) {
		ProductInfo prdinfo = null;
		try {
			String qry = "Select * from productinfo where prdid=?";
			prdinfo = (ProductInfo) template.queryForObject(qry, new Object[] {pid}, new BeanPropertyRowMapper(ProductInfo.class));			
		} catch (Exception e) {
			//System.out.println(e);
			prdinfo = null;
		}
		return prdinfo;
	}

	@Override
	public String UpdateProduct(ProductInfo prd) {
		String res = "Err";
		String qry = "Update ProductInfo set prdname=? where prdid=?";
		int rinfo = template.update(qry, new Object[] {prd.getPrdname(), prd.getPrdid()});
		if(rinfo>=1)
			res = "Success";
		return res;
	}

	@Override
	public String DeleteProduct(int pid) {
		String res = "Err";
		String qry = "Delete from ProductInfo where prdid=?";
		int rinfo = template.update(qry, new Object[] {pid});
		if(rinfo>=1)
			res = "Success";
		return res;
	}
}