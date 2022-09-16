package com.xworkz.dto;

import java.io.Serializable;
import java.util.Arrays;

public class AlcoholDTO implements Serializable {
	private String name;
	private String brand;
	private Integer qty;
	private String color;
	private String soluble;
	private String boilingPt;
	private String acidity;
	private String oxidation;
	private Boolean dehydration;
	private Boolean flammable;
	private Boolean miscible;
	private Integer types;
	private Double alcoholicContent;
	private Boolean liquidRoomTemp;
	private Boolean fattyAcid;

	public AlcoholDTO() {
		System.out.println("default Constructor");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brand=" + brand + ", qty=" + qty + ", color=" + color + ", soluble="
				+ soluble + ", boilingPt" + boilingPt + ", acidity" + acidity + ",oxidation" + oxidation
				+ ", dehydration" + dehydration + ", flammable" + flammable + ",miscible " + miscible + ",types" + types
				+ ",alcoholicContent" + alcoholicContent + ",liquidRoomTemp" + liquidRoomTemp + ",fattyAcid "
				+ fattyAcid + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSoluble() {
		return soluble;
	}

	public void setSoluble(String soluble) {
		this.soluble = soluble;
	}

	public String getBoilingPt() {
		return boilingPt;
	}

	public void setBoilingPt(String boilingPt) {
		this.boilingPt = boilingPt;
	}

	public String getAcidity() {
		return acidity;
	}

	public void setAcidity(String acidity) {
		this.acidity = acidity;
	}

	public String getOxidation() {
		return oxidation;
	}

	public void setOxidation(String oxidation) {
		this.oxidation = oxidation;
	}

	public Boolean getDehydration() {
		return true;
	}

	public void setDehydration(Boolean dehydration) {
		this.dehydration = dehydration;
	}

	public Boolean getFlammable() {
		return flammable;
	}

	public void setFlammable(Boolean flammable) {
		this.flammable = flammable;
	}

	public Boolean getMiscible() {
		return miscible;
	}

	public void setMiscible(Boolean miscible) {
		this.miscible = miscible;
	}

	public Integer getTypes() {
		return types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public Double getAlcoholicContent() {
		return alcoholicContent;
	}

	public void setAlcoholicContent(Double alcoholicContent) {
		this.alcoholicContent = alcoholicContent;
	}

	public Boolean getLiquidRoomTemp() {
		return liquidRoomTemp;
	}

	public void setLiquidRoomTemp(Boolean liquidRoomTemp) {
		this.liquidRoomTemp = liquidRoomTemp;
	}

	public Boolean getFattyAcid() {
		return fattyAcid;
	}

	public void setFattyAcid(Boolean fattyAcid) {
		this.fattyAcid = fattyAcid;
	}

}
