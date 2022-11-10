package uml;

public class Aggregation {
	public class Courses {
		private String name;
		public void setName(String name)  {
		this.name = name;
		}
		public String getName()
		{
		return name;
		}
		}
		public class Student {
		private Courses[] studyAreas = new Courses[10];
		//the rest of the Student class
		} 

}
