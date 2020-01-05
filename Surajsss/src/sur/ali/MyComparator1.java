package sur.ali;

import java.util.Comparator;

 class MyComparator1 implements Comparator{

	public int compare(Object obj2, Object obj3) {
		String s1=(String)obj2;
		String s2=(String)obj3;
		return s2.compareTo(s1);
	}

}
