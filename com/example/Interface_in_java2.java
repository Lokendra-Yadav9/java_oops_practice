package com.example;

interface Byclye{
	int seat=2;
	void Applybreak();
	void NoOfSeats();
}
interface motercycle{
	int seatMOter=3;
	void Applyfootbreak();
	void ApplyAccelerator();
}
class detailsCycle implements Byclye,motercycle{
	public void Applybreak() {
		System.out.println("use break");
	}
	public void NoOfSeats() {
		System.out.println("no. of seat is "+seat);
	}
	
	void MyDetails() {
		System.out.println("it's lokendra yadav cycle");
	}
    void  seatNO(){
		System.out.println("no. of seat is "+seatMOter);
	}
	public void Applyfootbreak() {
		System.out.println("motorBreak");
	}
	public void ApplyAccelerator() {
		System.out.println("motor acceleration");
	}
}
class Cycle2 extends detailsCycle{
	void MyDetails() {
		System.out.println("it's lokendra yadav brother cycle");
	}
}

public class Interface_in_java2 {

	public static void main(String[] args) {
		detailsCycle newOne=new detailsCycle();
		newOne.Applybreak();
		newOne.NoOfSeats();
		newOne.MyDetails();
        Cycle2 newtwo=new Cycle2();
        newtwo.Applybreak();
        
        newOne.ApplyAccelerator();
        newOne.Applyfootbreak();
        newtwo.seatNO();
	}

}
