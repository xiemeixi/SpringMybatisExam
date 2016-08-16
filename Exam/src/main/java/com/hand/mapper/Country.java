package com.hand.mapper;

import java.util.List;

import com.hand.dto.CountryEntity;

public interface Country {
    public CountryEntity queryById(int id);  
    
    public void save(CountryEntity  c);  
      
    public void update(CountryEntity c);  
      
    public void delete(int id);  
      
    public List<CountryEntity> queryAll();  
}
