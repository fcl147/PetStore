package com.nf147.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nf147.model.Item;
import com.nf147.service.IItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	private IItemService service;
	
	public IItemService getService() {
		return service;
	}
	@Autowired
	public void setService(IItemService service) {
		this.service = service;
	}
	
	@RequestMapping("/queryItems/productid/{productid}")
	public String queryItems(@PathVariable String productid,Map map){
		List<Item> itemList = service.selectByExample(productid);
		map.put("itemList",itemList);
		return "shop/queryItems.ftl";
	}
	
	@RequestMapping("/queryItem/itemid/{itemid}")
	public String selectByPrimaryKey(@PathVariable String itemid,Map map){
		Item item = (Item) service.selectByPrimaryKey(itemid);
		map.put("item",item);
		return "shop/queryItem.ftl";
	}
}
