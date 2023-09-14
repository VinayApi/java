package oops_inheritance;
//calling method from main method
public class Methodcalling {

	public static void main(String[] args) {
		System.out.println(m1());

	}
 public static String m1() {
	String s1="" ;
	String s="vinaykumar";
	int x=s.length();
	while(x>0) {
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
				s=s.replace(s.charAt(i), 'x');
		}
		x--;
	}
	return s;
 }
}
