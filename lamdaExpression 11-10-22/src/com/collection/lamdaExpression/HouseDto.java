package com.collection.lamdaExpression;

import java.io.Serializable;
import com.collection.lamdaExpression.enumclasses.Type;
import com.collection.lamdaExpression.enumclasses.OwningType;
public class HouseDto implements Serializable {
private Integer id;
private String name;
private String owner;
private Integer noOfFloors;
private Boolean loan;
private Double sqFeet;
private Type type;
private OwningType owntype;
public HouseDto() {
	System.out.println("default constructor");
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
public Integer getNoOfFloors() {
	return noOfFloors;
}
public void setNoOfFloors(Integer noOfFloors) {
	this.noOfFloors = noOfFloors;
}
public Boolean getLoan() {
	return loan;
}
public void setLoan(Boolean loan) {
	this.loan = loan;
}
public Double getSqFeet() {
	return sqFeet;
}
public void setSqFeet(Double sqFeet) {
	this.sqFeet = sqFeet;
}
public Type getType() {
	return type;
}
public void setType(Type type) {
	this.type = type;
}
public OwningType getOwntype() {
	return owntype;
}
public void setOwntype(OwningType owntype) {
	this.owntype = owntype;
}
public HouseDto(Integer id, String name, String owner, Integer noOfFloors, Boolean loan, Double sqFeet, Type type,
		OwningType owntype) {
	super();
	this.id = id;
	this.name = name;
	this.owner = owner;
	this.noOfFloors = noOfFloors;
	this.loan = loan;
	this.sqFeet = sqFeet;
	this.type = type;
	this.owntype = owntype;
}
@Override
public String toString() {
	return "HouseDto [id=" + id + ", name=" + name + ", owner=" + owner + ", noOfFloors=" + noOfFloors + ", loan="
			+ loan + ", sqFeet=" + sqFeet + ", type=" + type + ", owntype=" + owntype + "]";
}

}