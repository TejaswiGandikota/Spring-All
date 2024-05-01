package com.Product.Product1.Interface;

public class Product1Imp implements Product1Interface 
{
	private int pId;
	private String pName;
	private String pBrand;
	private double pPrice;
	
	public Product1Imp()
	{
		
	}
	public Product1Imp(int pId,String pName, String pBrand, double pPrice)
	{
		this.pId = pId;
		this.pName = pName;
		this.pBrand = pBrand;
		this.pPrice = pPrice;
	}

	@Override
	public void setId(int pId) {
	   this.pId = pId;

	}

	@Override
	public void setName(String pName) {
		this.pName = pName;

	}

	@Override
	public void setBrand(String pBrand) {
		this.pBrand = pBrand;

	}

	@Override
	public void setPrice(double pPrice) {
		this.pPrice = pPrice;

	}

	@Override
	public int getId() {
		return this.pId;
	}

	@Override
	public String getName() {
		return this.pName;
	}

	@Override
	public String getBrand() {
		return this.pBrand;
	}

	@Override
	public double getPrice() {
		return this.pPrice;
	}

}
