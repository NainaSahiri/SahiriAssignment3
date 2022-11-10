package uml;

import java.util.ArrayList;
import java.util.List;

public class AssociationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.setName("Naina");

		Mobile number1 = new Mobile();
		number1.setMobileNo("87857880342");
		Mobile number2 = new Mobile();
		number2.setMobileNo("11212387733");

		List<Mobile> numberList = new ArrayList<Mobile>();
		numberList.add(number1);
		numberList.add(number2);
		person.setNumbers(numberList);
		System.out.println(person.getNumbers() + " are mobile numbers of the person " + person.getName());
	}
}
