
	public class SimpleRechteck extends GeometricObject {
		



		public SimpleRechteck(double w, double h, Vertex pos){		
		super(w,h,pos);
		}
		
		public SimpleRechteck(double w, double h, double x, double y){
			super(w,h,new Vertex(x,y));
		}
		
		public @Override String toString(){
			return "SimpleRechteck("+super.toString()+")";
		}
		
		public @Override boolean equals(Object that){
			return (that instanceof SimpleRechteck) && super.equals(that);
		}
	}


