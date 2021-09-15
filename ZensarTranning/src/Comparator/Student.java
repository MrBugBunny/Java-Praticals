package Comparator;

public class Student {
	 String Name;
	    int mark;
	    
	    public Student() {
			// TODO Auto-generated constructor stub
		}

		public Student(String name, int mark) {
			super();
			Name = name;
			this.mark = mark;
		}

		@Override
		public String toString() {
			return "[Name=" + Name + ", mark=" + mark + "]";
		}
	    
	  
}
