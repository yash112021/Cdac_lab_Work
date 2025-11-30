package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public class CustomerDaoImpl implements CustomerDao {
 static Map<Customer, List<Items>> hm;
 static {
	 
	 hm = new HashMap <>();
	 // making predefined data for our application
	 Customer c1=new Customer(01,"yash","9322050847");
	 // now creating the array list
	 List<Items> data=new ArrayList<>();
	 data.add(new Items(011,"Books",12,20.00));
	 data.add(new Items(012,"table",10,202.00));
	 
	 
	 hm.put(c1,data);
 }
 	// add customer
	@Override
	public boolean save(Customer c, List<Items> itemslist) {
     if(!hm.containsKey(c)) {
    	 hm.put(c,itemslist); 
    	 return true;
     }
		
	return false;

}	// display all
	@Override
	public Map<Customer, List<Items>> displayall() {
		return hm;
	}
	// for by id 
	@Override
	public Entry<Customer, List<Items>> displayById(int cid) {
		Set<Map.Entry<Customer,List<Items>>> cset=hm.entrySet();
		for(Map.Entry<Customer, List<Items>>  e:cset) {
			if(e.getKey().getCid()==cid) {
				return e;
			}
		}
		return null;
	}
	@Override
	public boolean removebyid(int cid) {
		List <Items> lst = hm.remove(new Customer(cid));
		return lst!=null;
	}
	@Override
	public boolean AddItembycid(int cid, Items it) {
		List <Items> abc= hm.get(new Customer(cid));
		if(abc!=null) {
			abc.add(it);
			return true;
		}
		return false;
	
	}
	@Override
	public boolean DeleteItemById(int cstid, int itmid) {
	
		List <Items> abc= hm.get(new Customer(cstid));
		if(abc!=null) {
			abc.remove(itmid);
			return true;
		}
		return false;
	
	}
}
