package garbageCollector;

public class SystemGarbage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[] = {5, 4, 3, 2, 1 };
	    int array2[] = {200, 10, 30, 40};
	    
	      // copies an array from the specified source array
	      System.arraycopy(array1, 0, array2, 0, 1);
	      System.out.print("array2 = ");
	      System.out.print(array2[0] + " ");
	      System.out.println(array2[1] + " ");
	      
	      // it runs the GarbageCollector
	      System.gc();
	      System.out.println("Cleanup using System garbage has been completed");

	}

}
