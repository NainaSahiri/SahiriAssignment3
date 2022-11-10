package pureSingleton;

public class Singleton {
	private static Singleton sample_instance = null;
	
	public String s;
	
	private Singleton()
    {
        s = "This is the sample of Singleton class";
    }
	
	public static Singleton getInstance()
    {
        if (sample_instance == null)
            sample_instance = new Singleton();
  
        return sample_instance;
    }

}
