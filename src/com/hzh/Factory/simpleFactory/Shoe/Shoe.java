package com.hzh.Factory.simpleFactory.Shoe;

public abstract class Shoe {
   protected String brand;

 public void setBrand(String brand) {
	this.brand = brand;
 }
   //提供原料
  public abstract void prepare();
    //标价
	public void price() {
		System.out.println(brand + " bid price;");
	}

	//制作
	public void make() {
		System.out.println(brand + " makeing;");
	}

   
}
