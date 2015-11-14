package java_problems.object_oriented_programming;

import java.util.*;

/*
 * Problem Statement: 
 * Java Iterator class can help you to iterate through every elements in an
 * collection.
 * 
 * In this problem you need to complete a method func. The method takes an
 * ArrayList as input. In that ArrayList there is one or more integer numbers,
 * then there is a special string "###", after that there are one or more other
 * strings. A sample ArrayList may look like this:
 * 
 * element[0]=>42
 * element[1]=>10
 * element[2]=>"###"
 * element[3]=>"Hello"
 * element[4]=>"Java"
 * 
 * You have to modify the func method by editing at most 2 lines so that the
 * code only prints the elements after the special string "###". For the sample
 * above the output will be:
 * 
 * Hello
 * Java
 * 
 * Note: The stdin doesn't contain the string "###", it is added in the main
 * method.
 */public class JavaIterator {

	static Iterator<Object> func(ArrayList<Object> mylist) {
		
		Iterator<Object> it = mylist.iterator();
		
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String) {
				break;
			}
		}
		return it;

	}

	public static void main(String[] argh) {
		
		ArrayList<Object> mylist = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}
		
		mylist.add("###");
		
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}
		sc.close();

		Iterator<Object> it = func(mylist);
		
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}
	}
}