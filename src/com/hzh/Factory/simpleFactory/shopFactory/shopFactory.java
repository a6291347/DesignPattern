package com.hzh.Factory.simpleFactory.shopFactory;

import com.hzh.Factory.simpleFactory.Shoe.Adidas;
import com.hzh.Factory.simpleFactory.Shoe.Nike;
import com.hzh.Factory.simpleFactory.Shoe.Puma;
import com.hzh.Factory.simpleFactory.Shoe.Shoe;

//�򵥹���
public class shopFactory {
  public Shoe createShoe(String orderType ) {
	    Shoe shoe = null;
		System.out.println("ʹ�ü򵥹���ģʽ");
		if (orderType.equals("Nike")) {
			shoe = new Nike();
			shoe.setBrand(" �Ϳ� ");
		} else if (orderType.equals("Adidas")) {
			shoe = new Adidas();
			shoe.setBrand(" ���� ");
		} else if (orderType.equals("pepper")) {
			shoe = new Puma();
			shoe.setBrand("���� ");
		}
	 return shoe;
  }
}
