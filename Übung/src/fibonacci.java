


public class fibonacci {

	public static void main(String[] args) {
	System.out.println(fibo(13));
	}
		
	
	static long fibo(long i){
			if(i<=0){return 0;}
			else {
				if (i==1 || i==2 ){return 1;}
				else {return(fibo(i-2)+fibo(i-1));} 
			}
			
		}
		
		
		
	}
