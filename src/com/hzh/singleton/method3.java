package com.hzh.singleton;


public class method3 {

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
 * �Ľ������synchronized�ؼ��� �����߳�
 * ���⣺Ч��̫�� ����ڶ��߳��� ÿ���඼����ʵ�� ��Ҫ��ν����߳�ͬ��
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
