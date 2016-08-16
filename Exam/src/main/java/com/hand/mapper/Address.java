package com.hand.mapper;

import java.util.List;

import com.hand.dto.AddressEntity;

public interface Address {
    public AddressEntity queryById(int id);  
    
    public void save(AddressEntity a);  
      
    public void update(AddressEntity a);  
      
    public void delete(int id);  
      
    public List<AddressEntity> queryAll();  
   
    public AddressEntity querry(int id);
}
