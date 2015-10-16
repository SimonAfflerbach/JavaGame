
public class SimpleDreieck extends GeometricObject{

	public SimpleDreieck(double w, double h, Vertex pos){
		super(w,h,pos);
	}
	
	public SimpleDreieck(double w, double h, double x, double y){
		super(w,h,new Vertex(x,y));
	}
	@Override public double area(){return (width/height)/2;}

	public @Override String toString(){
		return "SimpleDreieck("+super.toString()+")";
	}
	
	public @Override boolean equals(Object that){
		return (that instanceof SimpleDreieck) && super.equals(that);
	}
}