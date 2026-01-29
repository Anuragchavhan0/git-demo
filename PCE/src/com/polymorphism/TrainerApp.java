package com.polymorphism;

// used abstract class for imcomplete data .
abstract class Trainer{
	String name;
	int expe;
 abstract  void teach();
}

class JavaTrainer extends Trainer {
	 void teach(){
		 System.out.println("teaches java");
		
	}
}
class AptiTrainer extends Trainer {
	void teach(){
		System.out.println("teaches Apti");
	}
}
class TestingTrainer extends Trainer {
	void teach(){
		System.out.println("teaches testing");
	}
	
}


public class TrainerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Normal method to call 
	  // Trainer t;
//		t = new JavaTrainer();
//		t.teach();
//		t = new AptiTrainer();
//		t.teach();
//		t = new TestingTrainer();
//		t.teach();\
		
		// code redundency aprroch
		
	duty(new JavaTrainer());
	duty(new AptiTrainer());
	duty(new TestingTrainer());
//			
	}
	static void  duty(Trainer t) { //Always Create this method inside the main class ex- TrainerApp here
		t.teach();
	}
		

}
