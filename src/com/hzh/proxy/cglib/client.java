package com.hzh.proxy.cglib;

public class client {
       
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Teacher proxyInstance = (Teacher)new proxyTeacher(teacher).getProxyInstance();
		proxyInstance.teach();
		
	}
}
