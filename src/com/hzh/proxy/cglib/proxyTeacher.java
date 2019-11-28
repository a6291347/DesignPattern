package com.hzh.proxy.cglib;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class proxyTeacher implements MethodInterceptor {
	
	//组合
	private Object target;
	
	

	 public proxyTeacher(Object target) {
		this.target = target;
	 }

		//返回一个代理对象:  是 target 对象的代理对象
		public Object getProxyInstance() {
			//1. 创建一个工具类
			Enhancer enhancer = new Enhancer();
			//2. 设置父类
			enhancer.setSuperclass(target.getClass());
			//3. 设置回调函数
			enhancer.setCallback(this);
			//4. 创建子类对象，即代理对象
			return enhancer.create();
			
		}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("cglib代理start");
		Object invoke = method.invoke(target, arg);
		System.out.println("cglib代理end");
		return invoke;
	}

    

}
