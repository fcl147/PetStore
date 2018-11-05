package com.nf147.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf147.dao.ItemMapper;
import com.nf147.model.Item;
import com.nf147.model.ItemExample;

@Service
public class ItemServiceImpl implements IItemService {
	private ItemMapper dao;
	
	public ItemMapper getDao() {
		return dao;
	}
	@Autowired
	public void setDao(ItemMapper dao) {
		this.dao = dao;
	}

	@Override
	public List<Item> selectByExample(String productid) {
		// TODO Auto-generated method stub
		ItemExample example = new ItemExample();
		example.createCriteria().andProductidEqualTo(productid);
		return dao.selectByExample(example);
	}
	@Override
	public Item selectByPrimaryKey(String itemid) {
		// TODO Auto-generated method stub
		return dao.selectByPrimaryKey(itemid);
	}

}
