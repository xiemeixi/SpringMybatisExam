package com.hand.dto;

import java.sql.Date;

public class CityEntity {
private int city_id;
public int getCity_id() {
	return city_id;
}
public void setCity_id(int city_id) {
	this.city_id = city_id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getCountry_id() {
	return country_id;
}
public void setCountry_id(int country_id) {
	this.country_id = country_id;
}
public Date getLast_update() {
	return last_update;
}
public void setLast_update(Date last_update) {
	this.last_update = last_update;
}
private String city;
private int country_id;
private Date last_update;
@Override
public String toString() {
	return "cityEntity [city_id=" + city_id + ", city=" + city + ", country_id=" + country_id + ", last_update="
			+ last_update + "]";
}
}
