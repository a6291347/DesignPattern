package com.hzh.singleton;


public class method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * @author 局外人
 * 饿汉式
 * 优点:在类装载时完成实例化 ,避免了线程同步安全问题
 * 缺点:导致类装载的方法很多 可能会导致内存浪费
 */
class Single{
	private Single(){
		
	}
   //创建方式一
	/*private static Single single=new Single();
    
	public static Single getInterface() {
		return single;
	}*/
	
	//创建方式二
	private static  Single single;
	static{
		single=new Single();
	}
	public static Single getInterface() {
		return single;
	}
}
