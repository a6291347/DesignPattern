package com.hzh.proxy.staticproxy;

public class proxyTeacher implements Itteacher {
	
	//组合
	private Itteacher itteacher;
	
	

	public proxyTeacher(Itteacher itteacher) {
		this.itteacher = itteacher;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("静态代理start");
		itteacher.teach();
		System.out.println("静态代理end");
	}

}
