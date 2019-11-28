package com.hzh.proxy.dynamic;

import com.hzh.proxy.dynamic.proxyTeacher;

public class client {
       public static void main(String[] args) {
    		   Itteacher target = new Teacher();
    		   proxyTeacher proxyTeacher = new proxyTeacher(target);
    		   Itteacher proxyInstance = (Itteacher)proxyTeacher.getProxyInstance();
    		   proxyInstance.teach();
    	         
	}
}
