package main.com.hyperion.training.basic;

public class Test {
	
	public void testStatics() {
		BasicsObjects bo = new BasicsObjects();
		bo.name = "John";
		bo.lastName = "Doe";
		bo.print();
		
		BasicsObjects bo2 = new BasicsObjects();
		bo2.name = "Juan";
		bo2.lastName = "Sepa";
		bo2.print();
		
		bo.print();
	}
	
	public void testReferences() {
		BasicsObjects bo = new BasicsObjects();
		bo.name = "John";
		bo.lastName = "Doe";
		bo.print();
		
		BasicsObjects bo2 = bo;
		
		bo2.name = "Juan";
		bo.print();
	}
	
	public static void main(String...args) {
		Test t  = new Test();
		//t.testStatics();
		t.testReferences();
	}
}
