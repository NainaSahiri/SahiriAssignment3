package singleton;

public class SingletonSample {
	
	private static final SingletonSample instance = new SingletonSample();
	
	private SingletonSample(){
		
	}
	
	public static SingletonSample getInstance() {
		return instance;
	}

}
