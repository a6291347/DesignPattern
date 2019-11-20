package com.hzh.singleton;


public class method4 {

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
 * 改进：双重检查 
 *  添加volatile关键字 获取内存最新值
 *  推荐使用
 */
class Single3{
	private Single3() {

	}

	private static volatile Single3 single3;

	public static Single3 getInterface() {
		if (single3 == null) {
			synchronized (Single3.class) {
				if (single3 == null) {
					single3 = new Single3();
				}
			}
		}
		return single3;
	}
}
