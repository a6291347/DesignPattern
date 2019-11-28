package com.hzh.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyTeacher  {
	
	//组合
	private Object target;
	
	

	 public proxyTeacher(Object target) {
		this.target = target;
	 }

       public Object getProxyInstance(){
    	   
    	   return Proxy.newProxyInstance(target.getClass().getClassLoader(),
    			   target.getClass().getInterfaces(),
    			   new InvocationHandler() {
					@Override
					public Object invoke(Object obj, Method method, Object[] arg) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("动态代理start");
						Object invoke = method.invoke(target, arg);
						System.out.println("动态代理end");
						return invoke;
					}
				});
       }

}
