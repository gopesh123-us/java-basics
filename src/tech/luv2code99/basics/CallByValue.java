package tech.luv2code99.basics;

public class CallByValue {
	public static void main(String[] args) {
		int x = 10;
		modify(x);
		System.out.println(x);		
	}	
	
	public static void modify(int data) {
		//this statement will not have any impact on the value of variable x
		data = 20;
	}
}
