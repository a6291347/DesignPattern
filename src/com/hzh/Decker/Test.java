package com.hzh.Decker;



/**
 * @author ������
 *װ����
 *��̬�Ľ��¹�����ӵ�������
 */
public class Test {
      public static void main(String[] args) {
		 Drank order = new LongBlack();
		 System.out.println("����"+order.getDes());
		 System.out.println("�۸�"+order.getPrice());
		  order = new Milk(order);
		  System.out.println("----->");
		  System.out.println("����"+order.getDes());
		  System.out.println("�۸�"+order.cost());
	}
}
