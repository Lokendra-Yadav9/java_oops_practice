package com.example;

interface MyCalling{
	void Calling(long number);
	void videocall() ;
}
interface Smartfeatures{
	void selfiee();
	String[] openWifi();
}
class MySmartphone implements MyCalling,Smartfeatures{
	 public void Calling(long number){
		System.out.println("make a call");
		System.out.println("calling..."+number);
	}
	 public void videocall() {
		System.out.println("make video call");
	}
	 public void selfiee() {
		System.out.println("take a selfiee");
	}
	 public String[] openWifi() {
		System.out.println("choose one network:..");
		String []network= {"loki","lucky","lokendra"};
		return network;
	}
}
class newSmartphone extends MySmartphone{
	 public void Calling(long number){
			System.out.println("make a call");
			System.out.println("calling..."+number);
		}
	 public String[] openWifi() {
	 String []network= {"loki","lucky","lokendra"};
	 for(String wifi:network) {
		 System.out.println(wifi);
	 }
	return network;
	 }
	 public void wifiCon(String name) {
		 System.out.println("connected with "+name);
	 }
}

public class Interface_or_inheritance_examples_java {

	public static void main(String[] args) {
		newSmartphone newMs=new newSmartphone();
		newMs.Calling(7471172041L);
		newMs.videocall();
		newMs.selfiee();
       String[] name= newMs.openWifi();
        newMs.wifiCon(name[0]);
	}

}
