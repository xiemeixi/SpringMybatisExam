package com.hand.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.CustomerEntity;
import com.hand.mapper.Customer;
import com.hand.serviceIml.CustomerIml;

public class Test {

	public static void main(String[] args) {
		Customer ce=null;
		
			BeanFactory bf=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		    ce=(Customer) bf.getBean("mapp");
//		    添加数据
		    CustomerIml cust=new CustomerIml();
		    CustomerEntity cuEntity=cust.testInsert();
		    ce.save(cuEntity);
		    System.out.println("保存成功");
//		    显示保存的数据
		    System.out.println("已经保存的数据如下：");
		    System.out.println("ID "+cuEntity.getCustomer_id());
		    System.out.println("First_name: "+cuEntity.getFirst_name());
		    System.out.println("Last_name: "+cuEntity.getLast_name());
		    System.out.println("Email: "+cuEntity.getEmail());
		    System.out.println("Address_id: "+cuEntity.getAddress_id());
//		        删除数据
		    cust.testQueryById(ce);
		    System.out.println("删除成功");
	
			
					    
		    
		    
		    
	}
}
