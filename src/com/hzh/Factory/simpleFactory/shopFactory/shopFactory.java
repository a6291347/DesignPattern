package com.hzh.Factory.simpleFactory.shopFactory;

import com.hzh.Factory.simpleFactory.Shoe.Adidas;
import com.hzh.Factory.simpleFactory.Shoe.Nike;
import com.hzh.Factory.simpleFactory.Shoe.Puma;
import com.hzh.Factory.simpleFactory.Shoe.Shoe;

//简单工厂
public class shopFactory {
  public Shoe createShoe(String orderType ) {
	    Shoe shoe = null;
		System.out.println("使用简单工厂模式");
		if (orderType.equals("Nike")) {
			shoe = new Nike();
			shoe.setBrand(" 耐克 ");
		} else if (orderType.equals("Adidas")) {
			shoe = new Adidas();
			shoe.setBrand(" 阿迪 ");
		} else if (orderType.equals("pepper")) {
			shoe = new Puma();
			shoe.setBrand("彪马 ");
		}
	 return shoe;
  }
}
