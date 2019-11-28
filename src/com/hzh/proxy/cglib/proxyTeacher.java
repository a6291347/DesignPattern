package com.hzh.proxy.cglib;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class proxyTeacher implements MethodInterceptor {
	
	//���
	private Object target;
	
	

	 public proxyTeacher(Object target) {
		this.target = target;
	 }

		//����һ���������:  �� target ����Ĵ������
		public Object getProxyInstance() {
			//1. ����һ��������
			Enhancer enhancer = new Enhancer();
			//2. ���ø���
			enhancer.setSuperclass(target.getClass());
			//3. ���ûص�����
			enhancer.setCallback(this);
			//4. ����������󣬼��������
			return enhancer.create();
			
		}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("cglib����start");
		Object invoke = method.invoke(target, arg);
		System.out.println("cglib����end");
		return invoke;
	}

    

}
