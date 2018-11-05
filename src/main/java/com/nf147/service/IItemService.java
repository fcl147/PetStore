package com.nf147.service;

import java.util.List;

import com.nf147.model.Item;

public interface IItemService {
	List<Item> selectByExample(String productid);
	Item selectByPrimaryKey(String itemid);
}
