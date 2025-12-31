package com.polymorphism;

 class Laptop {
	Os os= new Os("win",10);
	Void hasA(Charger c) {
		System.out.println(c.GetBrand());
		System.out.println(c.GetPower());
		return null;
	}
}

class Os{
	String Brand;
	int Version;
	
     public Os(String Brand , int Version) {
		this.Brand = Brand;
		this.Version=Version;
	}
     
    public String GetBrand(){
    	return Brand;
    	
    }
    public int GetVersion(){
    	return Version;
    }
}

class Charger{
	String Brand;
	int power;
	
    public Charger(String Brand , int power) {
		this.Brand=Brand;
		this.power=power;
	}
    public String GetBrand(){
    	return Brand;
    }
    public int GetPower(){
    	return power;
    }
}

public class LaptopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop l = new Laptop();
		l.os.hashCode();
	}

}
