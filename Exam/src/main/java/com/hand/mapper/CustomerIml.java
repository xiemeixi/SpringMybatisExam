package com.hand.mapper;
import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.dto.AddressEntity;
import com.hand.dto.CustomerEntity;
public class CustomerIml extends SqlSessionDaoSupport implements Customer {

	public CustomerEntity queryByFirst(int i) {
		return this.getSqlSession().selectOne("queryByFirst",i);
	}

	public void save(CustomerEntity c) {
		this.getSqlSession().insert("insert-user", c);
	}

	public void update(CustomerEntity c) {
		this.getSqlSession().update("update-user", c);
	}

	public void delete(int id) {
		this.getSqlSession().delete("delete-user",id);
	}

	public List<CustomerEntity> queryAll() {
		 List<CustomerEntity> cus = this.getSqlSession().selectList("queryAll");  
	        return cus;  
	}

	public int queryById(int id) {
		return this.getSqlSession().selectOne("queryById", id);
	}

	public AddressEntity querry(int id) {
		return this.getSqlSession().selectOne("querry", id);
	}
}
