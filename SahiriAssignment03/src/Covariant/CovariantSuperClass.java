package Covariant;

public class CovariantSuperClass extends SampleClass{
	CovariantSuperClass get() {
		      System.out.println("SubClass");
		      return this;
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass CovariantSuperClass = new CovariantSuperClass();
		CovariantSuperClass.get();
	}

}
