import javax.swing.JApplet;
import java.awt.Graphics;
public class Snowman extends JApplet
{
	public void paint(Graphics canvas)
	{
		super.paint(canvas);
		canvas.drawOval(100, 50, 200, 200);
		canvas.drawOval(75, 250, 250, 250);
		canvas.drawOval(50, 500, 300, 300);
		canvas.fillOval(155, 100, 10, 20);
		canvas.fillOval(230, 100, 10, 20);
		canvas.fillOval(195, 300, 10, 10);
		canvas.fillOval(195, 375, 10, 10);
		canvas.fillOval(195, 450, 10, 10);
		canvas.drawArc(150, 160, 100, 50, 180, 180);
	}
}