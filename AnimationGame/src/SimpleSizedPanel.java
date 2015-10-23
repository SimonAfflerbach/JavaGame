import javax.swing.*;

public class SimpleSizedPanel extends SizedPanel {
	public void paintComponent(java.awt.Graphics g){
		g.fillRect(300, 350, 450, 350);
	}

	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());
	}

}