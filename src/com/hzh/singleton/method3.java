package com.hzh.singleton;


public class method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * @author 局外人
 *
 *懒汉式
 *优点:起到的懒加载的作用,但是只能在单线程下使用 
 *缺点:如果在多线程下,可能会创建多个实例 不推荐使用
 * 改进：添加synchronized关键字 锁定线程
 * 问题：效率太低 如果在多线程下 每个类都想获得实例 需要多次进行线程同步
 */
class Single2{
	private Single2() {

	}

	private static Single2 single2;

	public static synchronized Single2 getInterface() {
		if (single2 == null) {
			single2 = new Single2();
		}
		return single2;
	}
}
