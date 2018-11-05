package com.nf147.service;

import java.util.List;

import com.nf147.model.Product;

public interface IProductService {
	List<Product> selectByExample(String catid);
}
