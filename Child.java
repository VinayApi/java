package oops_inheritance;

//------->Single inheritace
	public class Child extends Parent {

		public void ChildRamu() {
			System.out.println("Royal Enfield");
		}
		public void ChildLakshman() {
			System.out.println("NS220");
		}
      public static void main(String[]args) {
    	  Child C=new Child();
    	  C.ChildRamu();
    	  C.ChildLakshman();
    	  C.Husband();//------->inheritance
    	  C.Mother();//------->inheritance
      }
	}

