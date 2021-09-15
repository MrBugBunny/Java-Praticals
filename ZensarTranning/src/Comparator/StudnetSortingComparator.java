package Comparator;

import java.util.Comparator;

public class StudnetSortingComparator implements Comparator<Student> 
{

	public int compare(Student student1, Student student2) {
		int nameCompare= student1.Name.compareTo(student2.Name);
		int mark=student1.mark-student2.mark;
		//int result;
		 /*if(nameCompare==0) {
			 result=mark;
		 }else {
		result=nameCompare;	
		}*/
		//return result;
	
		return (nameCompare==0)?mark:nameCompare;
	}
	

}
