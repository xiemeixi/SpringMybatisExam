package com.hand.serviceIml;

import java.util.Date;
import java.util.Scanner;

import com.hand.dto.CustomerEntity;
import com.hand.mapper.Customer;
import com.hand.service.Customer_Ser;


public class CustomerIml implements Customer_Ser{
	public void testQueryByFirst() {
		
    } 

	public CustomerEntity testInsert() {
		String first_name;
		String last_name;
		String email;
		Date date= new Date();
	    CustomerEntity c = new CustomerEntity();
        c.setStore_id(1);
        System.out.println("请输入first_name");
        @SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
        first_name=scanner.nextLine();
        c.setFirst_name(first_name); 
        System.out.println("请输入last_name");
        scanner=new Scanner(System.in);
        last_name=scanner.nextLine();
        c.setLast_name(last_name);
        System.out.println("请输入email");
        scanner=new Scanner(System.in);
        email=scanner.nextLine();
        c.setEmail(email);
        System.out.println("请输入address_id");
        address_id(c);
        c.setCreate_date(date);
        return c;
    } 
	@SuppressWarnings("resource")
	public static void address_id(CustomerEntity c){
		int address_id;
		Scanner scanner;
		while(true){
		scanner=new Scanner(System.in);
        address_id=Integer.parseInt(scanner.nextLine());
        if(address_id<5||address_id>605)
        {
          System.out.println("请重新输入address_id");
        }else{
            break;
        }
		}
        
		c.setAddress_id(address_id);
	}


	public  void testUpdate() {

	}

	public  void testDelete() {

	}

	public  void testQueryAll() {

	}

	@SuppressWarnings("resource")
	public void testQueryById(Customer ce) {
		System.out.println("请输入要删除的customer_id");
		int id=0;
	
		Scanner scanner;
		while(true){
			scanner=new Scanner(System.in);
		    id=scanner.nextInt();
	        int id2=ce.queryById(id);
	    if(id2==0){
	    	System.out.println("输入的id不存在，请重新输入");
	    	testQueryById(ce);
	    }else{
	    	break;
	    }
		}
	    ce.delete(id);
	}
}


