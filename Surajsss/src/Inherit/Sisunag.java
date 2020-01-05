package Inherit;

public class Sisunag {

	public static void main(String[] args) {
    Sisu s=new Sisu();
    Parent p=new Parent();
    s.m1(p);
    Child c=new Child();
    s.m1(c);
    Parent p1=new Child();
    s.m1(p1);

	}

}
