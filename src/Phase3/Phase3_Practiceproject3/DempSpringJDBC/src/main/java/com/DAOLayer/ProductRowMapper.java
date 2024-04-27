package com.DAOLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product prd = new Product();
		
		prd.setPid(rs.getInt("prdid"));
		prd.setPname(rs.getString("prdname"));
		prd.setPrice(rs.getFloat("price"));
		prd.setStk(rs.getInt("stock"));
		
		return prd;
	}
	
	

}