package com.nf147.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf147.dao.ProductMapper;
import com.nf147.model.Product;
import com.nf147.model.ProductExample;

@Service
public class ProductServiceImpl implements IProductService {
	private ProductMapper dao;
	
	public ProductMapper getDao() {
		return dao;
	}
	@Autowired
	public void setDao(ProductMapper dao) {
		this.dao = dao;
	}

	@Override
	public List<Product> selectByExample(String catid) {//根据catid查询动物
		// TODO Auto-generated method stub
		ProductExample example = new ProductExample();
		example.createCriteria().andCatidEqualTo(catid);
		return dao.selectByExample(example);
	}

}
