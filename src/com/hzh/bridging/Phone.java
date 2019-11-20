package com.hzh.bridging;

//ге╫с

public class Phone {
     private Brand brand;

	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	 public void open(){
		 brand.open();
	 }
	 public void palyGames(){
		 brand.palyGames();
	 }
	  public void close(){
		  brand.close();
	  }
}
