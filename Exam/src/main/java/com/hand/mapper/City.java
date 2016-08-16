package com.hand.mapper;

import java.util.List;

import com.hand.dto.CityEntity;


public interface City {
public CityEntity queryById(int id);  
    
    public void save(CityEntity c);  
      
    public void update(CityEntity c);  
      
    public void delete(int id);  
      
    public List<CityEntity> queryAll();  
}
