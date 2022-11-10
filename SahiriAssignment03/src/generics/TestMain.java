package generics;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> testObj = new Test<Integer>(20);
		System.out.println(testObj.getObject());

		Test<String> strObj
			= new Test<String>("Testable Generics");
		System.out.println(strObj.getObject());
	}

}
