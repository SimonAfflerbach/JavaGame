
public class Fakultät {
	
	static int fac(int f) {
		  return f==0?1:f*fac(f-1);}
	
	public static void main(String[] args) {
		
		 System.out.println("fac(5) = "+fac(15));

	}

}
