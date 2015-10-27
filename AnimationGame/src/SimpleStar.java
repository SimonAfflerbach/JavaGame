import java.awt.Color;


public class SimpleStar extends GeometricObject{
	public SimpleStar(double innerRadius, double outerRadius, int jags, Vertex pos){
		//super(w,h,pos);
	}
	public SimpleStar(double innerRadius, double outerRadius, double x, double y, int jags){
		//super(w,h,(new Vertex(x,y)));
	}
	public SimpleStar(Vertex pos, Color color) {
		
	}
	@Override 
	public String toString() {
		return "Stern ("+super. toString () +") ";
	}
	@Override
	public boolean equals(Object that) {
		 return (that instanceof SimpleStar) && super.equals(that);
	}
}