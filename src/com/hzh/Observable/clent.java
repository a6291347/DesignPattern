package com.hzh.Observable;

public class clent {
 public static void main(String[] args) {
	 //�۲���
	 BaiduSite baiduSite = new BaiduSite();
	 
	 //����վ
	 WeatherData weatherData = new WeatherData();
	 
	 //���
	 weatherData.registerObserver(baiduSite);
	 
	 weatherData.setData(20f, 30f, 40f);
 }
}
