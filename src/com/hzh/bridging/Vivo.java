package com.hzh.bridging;

public class Vivo implements Brand{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("Vivo 开机了");
	}

	@Override
	public void palyGames() {
		// TODO Auto-generated method stub
		System.out.println("Vivo 正在玩游戏");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Vivo 关机了");
	}

}
