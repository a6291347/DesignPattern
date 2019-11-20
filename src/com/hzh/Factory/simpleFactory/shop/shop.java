package com.hzh.Factory.simpleFactory.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hzh.Factory.simpleFactory.Shoe.Shoe;
import com.hzh.Factory.simpleFactory.shopFactory.shopFactory;

public class shop {

	shopFactory shopFactory;
	Shoe shoe = null;

	// 构造器
	public shop(shopFactory shopFactory) {
		setFactory(shopFactory);
	}

	public void setFactory(shopFactory shopFactory) {
		String orderType = ""; // 用户输入的

		this.shopFactory = shopFactory; // 设置简单工厂对象

		do {
			orderType = getType();
			shoe = this.shopFactory.createShoe(orderType);
			// 输出pizza
			if (shoe != null) { // 订购成功
				shoe.prepare();
				shoe.make();
				shoe.price();
			} else {
				System.out.println(" 订购鞋子失败 ");
				break;
			}
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input shoe种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
