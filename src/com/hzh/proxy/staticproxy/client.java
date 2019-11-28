package com.hzh.proxy.staticproxy;

public class client {
	 public static void main(String[] args) {
		 Teacher teacher = new Teacher();
		 proxyTeacher pp=new proxyTeacher(teacher);
		 pp.teach();
	}

}
