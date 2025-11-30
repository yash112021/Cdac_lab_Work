package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface CustomerDao {

	boolean save(Customer c, List<Items> itemslist);

	Map<Customer, List<Items>> displayall();

	Entry<Customer, List<Items>> displayById(int cid);

	boolean removebyid(int cid);

	boolean AddItembycid(int cid, Items it);

	boolean DeleteItemById(int cstid, int itmid);


}
