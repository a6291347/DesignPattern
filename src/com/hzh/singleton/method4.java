package com.hzh.singleton;


public class method4 {

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
 * �Ľ���˫�ؼ�� 
 *  ���volatile�ؼ��� ��ȡ�ڴ�����ֵ
 *  �Ƽ�ʹ��
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
