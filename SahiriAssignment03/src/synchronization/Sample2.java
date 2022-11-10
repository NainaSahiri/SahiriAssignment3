package synchronization;
import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;
public class Sample2 {
		public static void main (String[] args)
		{
			// creating a thread-safe Arraylist.
			CopyOnWriteArrayList<String> threadSafeList
				= new CopyOnWriteArrayList<String>();

			// Adding elements to synchronized ArrayList
			threadSafeList.add("geek");
			threadSafeList.add("code");
			threadSafeList.add("practice");

			System.out.println("Elements of synchronized ArrayList :");

			// Iterating on the synchronized ArrayList using iterator.
			Iterator<String> it = threadSafeList.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}
	}

