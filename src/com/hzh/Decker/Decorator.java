package com.hzh.Decker;

public class Decorator extends Drank {
	 private Drank obj;
	 
	 public Decorator(Drank obj){//组合
		 this.obj=obj;
	 }

	//计算价格  
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return super.getPrice()+obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() 输出被装饰者的信息
		return des + " " + getPrice() + " && " + obj.getDes();
	}

}
