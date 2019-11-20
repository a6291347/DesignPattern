package com.hzh.Decker;

public class Decorator extends Drank {
	 private Drank obj;
	 
	 public Decorator(Drank obj){//���
		 this.obj=obj;
	 }

	//����۸�  
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice()+obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() �����װ���ߵ���Ϣ
		return des + " " + getPrice() + " && " + obj.getDes();
	}

}
