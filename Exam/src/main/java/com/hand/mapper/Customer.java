package com.hand.mapper;

import java.util.List;

import com.hand.dto.AddressEntity;
import com.hand.dto.CustomerEntity;



public interface Customer {

	public CustomerEntity queryByFirst(int i); 
	
	public int queryById(int id);
    
	public void save(CustomerEntity c);  
      
    public void update(CustomerEntity c);  
      
    public void delete(int id);  
      
    public List<CustomerEntity> queryAll();  
   
    public AddressEntity querry(int id);
    
   
}
