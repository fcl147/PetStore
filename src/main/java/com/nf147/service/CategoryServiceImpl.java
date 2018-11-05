package com.nf147.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf147.dao.CategoryMapper;
import com.nf147.model.Category;
import com.nf147.model.CategoryExample;

@Service
public class CategoryServiceImpl implements ICategoryService {
	private CategoryMapper dao;
	
	public CategoryMapper getDao() {
		return dao;
	}
	@Autowired
	public void setDao(CategoryMapper dao) {
		this.dao = dao;
	}

	@Override
	public List<Category> selectByExample() {
		// TODO Auto-generated method stub
		CategoryExample c = new CategoryExample();
		c.createCriteria().andCatidIsNotNull();
		return dao.selectByExample(c);
	}
}
