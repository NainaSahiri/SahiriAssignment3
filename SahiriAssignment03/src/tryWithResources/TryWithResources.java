package tryWithResources;

public class TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try(FileOutputStream fileOutputStream = newFileOutputStream("sample.txt")){      
			String msg = "Playing with TryWithResources!";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			//fileOutputStream.write(byteArray);  
			System.out.println("copied to file successfuly!");      
			//}catch(Exception exception){  
		//	       System.out.println(exception);  
			}     
	}

//}

