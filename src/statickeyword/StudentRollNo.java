package statickeyword;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Student {
	private String rollNo;
	private static int count = 1;
	
	private String assignRollNo() {
		Calendar c = new GregorianCalendar();
		String roll = "UNIV-"+(c.get(Calendar.YEAR))+"-"+count;
		count++;
		return roll;
	}
	
	Student () {
		rollNo = assignRollNo();
	}
	
	public String toString() {
		return this.rollNo;
	}
	
}

public class StudentRollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
