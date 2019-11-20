package com.hzh.adapdter.classAdapter;



/**
 * @author 局外人
 * 缺点:java单继承机适配器需要继承src这要求dts必须是接口 有一定的局限性
 * src的方法在适配器暴露 增加了使用成本
 * 优点：因为继承src可以重写基类方法 增加了灵活性
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		int srcV = output220V();
		int dstV = srcV / 44 ; //转成 5v
		return dstV;
	}

}
