package com.nf147.service;

import java.util.List;

import com.nf147.model.Category;


public interface ICategoryService {
	List<Category> selectByExample();
}
