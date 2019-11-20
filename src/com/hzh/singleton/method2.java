package com.hzh.singleton;


public class method2 {

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
 *
 */
class Single1{
	private Single1() {

	}

	private static Single1 single1;

	public static Single1 getInterface() {
		if (single1 == null) {
			single1 = new Single1();
		}
		return single1;
	}
}