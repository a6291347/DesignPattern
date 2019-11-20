package com.hzh.Factory.simpleFactory.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.hzh.Factory.simpleFactory.Shoe.Shoe;
import com.hzh.Factory.simpleFactory.shopFactory.shopFactory;

public class shop {

	shopFactory shopFactory;
	Shoe shoe = null;

	// ������
	public shop(shopFactory shopFactory) {
		setFactory(shopFactory);
	}

	public void setFactory(shopFactory shopFactory) {
		String orderType = ""; // �û������

		this.shopFactory = shopFactory; // ���ü򵥹�������

		do {
			orderType = getType();
			shoe = this.shopFactory.createShoe(orderType);
			// ���pizza
			if (shoe != null) { // �����ɹ�
				shoe.prepare();
				shoe.make();
				shoe.price();
			} else {
				System.out.println(" ����Ь��ʧ�� ");
				break;
			}
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input shoe����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
