package com.hzh.adapdter.classAdapter;



/**
 * @author ������
 * ȱ��:java���̳л���������Ҫ�̳�src��Ҫ��dts�����ǽӿ� ��һ���ľ�����
 * src�ķ�������������¶ ������ʹ�óɱ�
 * �ŵ㣺��Ϊ�̳�src������д���෽�� �����������
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		int srcV = output220V();
		int dstV = srcV / 44 ; //ת�� 5v
		return dstV;
	}

}
