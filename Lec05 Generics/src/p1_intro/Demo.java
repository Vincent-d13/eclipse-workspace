package p1_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {

		Name n1 = new Name("A","AA");
		Name n2 = new Name("Z","ZZ");
		Name n3 = new Name("M", "MM");
		
		Name [] arr = {n1, n2, n3};
		Arrays.sort(arr, (Name o1, Name o2) -> {
			return o1.getFirstName().compareTo(o2.getFirstName());
		});
		
		
		ArrayList<Name> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		Collections.sort(list, (Name o1, Name o2) -> {
			return o1.getFirstName().compareTo(o2.getFirstName());
		});
		
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("A");
		strlist.add("B");
		strlist.add("C");
		Collections.sort(strlist, (s1, s2) -> {
			return -s1.compareTo(s2);
		});
		
		ArrayList list1 = new ArrayList<>();
		list1.add("A");
		list1.add(Integer.valueOf(1));
		list1.add(1.5);
		list1.add(n1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(((Name)list1.get(3)).getFirstName());
		
		
		
		
	}

}
