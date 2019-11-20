package com.hzh.bridging;

public class Xiaomi implements Brand{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi 开机了");
	}

	@Override
	public void palyGames() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi 正在玩游戏");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Xiaomi 关机了");
	}

}
