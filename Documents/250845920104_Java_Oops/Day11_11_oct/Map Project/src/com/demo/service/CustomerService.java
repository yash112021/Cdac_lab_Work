package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface CustomerService {

	boolean addNewService();

	Map<Customer, List<Items>> displayyData();

	Entry<Customer, List<Items>> displayById(int cid);

	boolean removeById(int cid);



	boolean AddItemByCid(int cid);

	boolean DeleteItemById(int cstid, int itmid);

	

}
