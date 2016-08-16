package com.hand.mapper;

import java.util.List;

import com.hand.dto.StoreEntity;


public interface Store {
public StoreEntity queryById(int id);  
    
    public void save(StoreEntity s);  
      
    public void update(StoreEntity s);  
      
    public void delete(int id);  
      
    public List<StoreEntity> queryAll();  
}
