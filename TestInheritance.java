package oops_inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		GrandChild GC1=new GrandChild();
		GrandChild2 GC2=new GrandChild2();
		GC1.ChildRamu();//------single inheritance
		GC1.ChildLakshman();//------single inheritance
		GC1.Tom();
		GC2.Jerry();
		GC1.Husband();//-------multilevel inheritance
		GC1.Mother();//-------multilevel inheritance
		GC1.ChildRamu();//-----Hierarchial inheritance
		GC2.ChildRamu();//----Hierarchial inheritance

	}

}
