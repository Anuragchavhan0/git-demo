package com.inheritance;

public class RullNo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childs c = new Childs();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}

class GrandParents{
	int a=10;
}
class Parents extends GrandParents{
	int b=20;
}
class Childs extends Parents{
	
}
