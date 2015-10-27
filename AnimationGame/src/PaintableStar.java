
import java.awt.Color;

public class PaintableStar extends SimpleStar implements Paintable{
	
		public PaintableStar(Vertex pos, Color color){
			super(pos, color);
		}
		
		public void paintTo(java.awt.Graphics g){
			Color color = null;
			g.setColor(color);
			int nPoints = 0;
			int[] yPoints = null;
			int[] xPoints = null;
			g.drawPolygon(xPoints, yPoints, nPoints);
		}
	}
