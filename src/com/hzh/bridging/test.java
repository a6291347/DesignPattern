package com.hzh.bridging;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //手机=样式+品牌
		Phone p1 = new FoldedPhone(new Xiaomi());
		p1.open();
		p1.palyGames();
		p1.close();
	}

}
