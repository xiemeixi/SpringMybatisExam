package com.hand.service;

import com.hand.dto.CustomerEntity;
import com.hand.mapper.Customer;


public interface Customer_Ser {
	 public void testQueryByFirst();
	 public void testQueryById(Customer ce);
	 public CustomerEntity testInsert();
	 public void testUpdate();
	 public void testDelete();
	 public void testQueryAll();
}
