package Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class PlayerNormalSort {
	public static void main(String[] args) {
		 ArrayList<String> s=new ArrayList<>();
		 s.add("Virat");
		 s.add("Sachin");
		 s.add("Dhoni");
		 s.add("Yuvraj");
		 s.add("Sehwag");
		 System.out.println("Initial list:"+s);
		 Collections.sort(s);
		 System.out.println(s);
	}

}
