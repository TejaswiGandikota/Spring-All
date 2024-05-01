package com.Product.Product1;

public class Product1 {
        private int pId;
        private String pName;
        private String pBrand;
        private double pPrice;
        public Product1()
        {
        	
        }
        public Product1(int pId, String pName, String pBrand, double pPrice)
        {
        	this.pId = pId;
        	this.pName = pName;
        	this.pBrand = pBrand;
        	this.pPrice = pPrice;
        }
        public void setId(int pId)
        {
        	this.pId = pId;
        }
        public void setName(String pName)
        {
        	this.pName = pName;
        }
        public void setBrand(String pBrand)
        {
        	this.pBrand = pBrand;
        }
        public void setPrice(double pPrice)
        {
        	this.pPrice  = pPrice;
        }
        public int getId()
        {
        	return this.pId;
        }
        public  String getName()
        {
        	return this.pName;
        }
        public String getBrand()
        {
        	return this.pBrand;
        }
        public double getPrice()
        {
        	return this.pPrice;
        }
}
