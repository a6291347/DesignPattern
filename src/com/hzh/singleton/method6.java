package com.hzh.singleton;


public class method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

/**
 * @author 局外人
 * 静态内部类
 * 优点：当Single5类加载时并不会创建实例 避免了内存浪费 当掉用了公共方法时
 * 静态内部类加载 利用jvm内加载机制保证了线程的安全
 * 推荐使用
 */
class Single5{
	private Single5(){}
	
	private static class singleInterface{
		private static final Single5 single5=new Single5();
	}
	public static Single5 getInterface(){
		return singleInterface.single5;
	}
	
}

