package sur.ali;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new MyComparator1());
		t.add("suraj");
		t.add("amiya");
		t.add("jana");
		t.add("raja");
		t.add("mamu");
		System.out.println(t);

	}

}
