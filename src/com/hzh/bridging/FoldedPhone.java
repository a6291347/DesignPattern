package com.hzh.bridging;

public class FoldedPhone extends Phone{
	//������
	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
	
	public void close() {
		super.close();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
	
	public void palyGames() {
		super.palyGames();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
}
