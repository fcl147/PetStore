package com.nf147.service;

import java.util.List;
import java.util.Map;

import com.nf147.model.Cart;
import com.nf147.model.Orders;

public interface ICartService {
	List<Cart> queryCart(Map map);
	List<Cart> addCart(Map map);
	List<Cart> delCart(Map map);
	List<Cart> updateCart(Map map);
	int updateByPrimaryKey(Orders record);
}
