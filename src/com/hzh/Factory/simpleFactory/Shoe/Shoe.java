package com.hzh.Factory.simpleFactory.Shoe;

public abstract class Shoe {
   protected String brand;

 public void setBrand(String brand) {
	this.brand = brand;
 }
   //�ṩԭ��
  public abstract void prepare();
    //���
	public void price() {
		System.out.println(brand + " bid price;");
	}

	//����
	public void make() {
		System.out.println(brand + " makeing;");
	}

   
}
