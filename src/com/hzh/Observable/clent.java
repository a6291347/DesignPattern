package com.hzh.Observable;

public class clent {
 public static void main(String[] args) {
	 //观察者
	 BaiduSite baiduSite = new BaiduSite();
	 
	 //气象站
	 WeatherData weatherData = new WeatherData();
	 
	 //组合
	 weatherData.registerObserver(baiduSite);
	 
	 weatherData.setData(20f, 30f, 40f);
 }
}
