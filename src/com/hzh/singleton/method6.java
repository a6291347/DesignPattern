package com.hzh.singleton;


public class method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

/**
 * @author ������
 * ��̬�ڲ���
 * �ŵ㣺��Single5�����ʱ�����ᴴ��ʵ�� �������ڴ��˷� �������˹�������ʱ
 * ��̬�ڲ������ ����jvm�ڼ��ػ��Ʊ�֤���̵߳İ�ȫ
 * �Ƽ�ʹ��
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

