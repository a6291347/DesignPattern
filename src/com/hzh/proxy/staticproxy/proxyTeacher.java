package com.hzh.proxy.staticproxy;

public class proxyTeacher implements Itteacher {
	
	//���
	private Itteacher itteacher;
	
	

	public proxyTeacher(Itteacher itteacher) {
		this.itteacher = itteacher;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("��̬����start");
		itteacher.teach();
		System.out.println("��̬����end");
	}

}
