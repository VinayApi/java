package oops_inheritance;
//-------->multilevel&hierarchical inheritance
public class GrandChild extends Child {
	public void Tom() {
		System.out.println("Bycycle");
	}

   
	public static void main(String[] args) {
		GrandChild GC1=new GrandChild();
		GC1.Tom();

	}

}
