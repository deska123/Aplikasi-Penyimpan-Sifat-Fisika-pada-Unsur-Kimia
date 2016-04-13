import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelImages extends JPanel {
 
	private Image image;
 
	public PanelImages() {
		image = new ImageIcon(getClass().getResource("kiri.jpg")).getImage();
		repaint();
	}

	public PanelImages(String kata) {
		image = new ImageIcon(getClass().getResource("kanan.jpg")).getImage();
		repaint();
	}
 
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}
}