package com.hand.dto;

import java.sql.Date;

public class AddressEntity {
private int address_id;
public int getAddress_id() {
	return address_id;
}
public void setAddress_id(int address_id) {
	this.address_id = address_id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getCity_id() {
	return city_id;
}
public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public String getPostal_code() {
	return postal_code;
}
public void setPostal_code(String postal_code) {
	this.postal_code = postal_code;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
private String address;
private String address2;
private String district;
private int city_id;
@Override
public String toString() {
	return "addressEntity [address_id=" + address_id + ", address=" + address + ", address2=" + address2 + ", district="
			+ district + ", city_id=" + city_id + ", postal_code=" + postal_code + ", phone=" + phone + ", last_update="
			+ last_update + "]";
}
private String postal_code;
private String phone;
private Date last_update;
}
