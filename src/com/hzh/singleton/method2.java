package com.hzh.singleton;


public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/**
 * @author ������
 *
 *����ʽ
 *�ŵ�:�𵽵������ص�����,����ֻ���ڵ��߳���ʹ�� 
 *ȱ��:����ڶ��߳���,���ܻᴴ�����ʵ�� ���Ƽ�ʹ��
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