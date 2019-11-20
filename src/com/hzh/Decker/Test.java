package com.hzh.Decker;



/**
 * @author 局外人
 *装饰者
 *动态的将新功能添加到对象上
 */
public class Test {
      public static void main(String[] args) {
		 Drank order = new LongBlack();
		 System.out.println("描述"+order.getDes());
		 System.out.println("价格"+order.getPrice());
		  order = new Milk(order);
		  System.out.println("----->");
		  System.out.println("描述"+order.getDes());
		  System.out.println("价格"+order.cost());
	}
}
