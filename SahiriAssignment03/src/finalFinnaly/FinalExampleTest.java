package finalFinnaly;

public class FinalExampleTest {
	//declaring final variable  
    final int age = 18;  
    void display() {  
      
    // reassigning value to age variable   
    // gives compile time error  
    age = 55;  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 FinalExampleTest obj = new FinalExampleTest();  
		    // gives compile time error  
		    obj.display();  
		    }  

	}