import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class allows you to view and edit pictures.
 */
public class Picture { 
   private String source;
   private JFrame frame;
   private JLabel label;
   private BufferedImage image;

   /**
      Constructs a blank picture.
   */
   public Picture() {
      frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);      
   }
  
   /**
      Gets the width of this picture.
      @return the width
    */
   public int getWidth() { return image.getWidth(); }
   
   /**
      Gets the height of this picture.
      @return the height
    */
   public int getHeight() { return image.getHeight(); }
   
   /**
      Loads a picture from a given source. 
      @param source the image source. If the source starts
      with http://, it is a URL, otherwise, a filename.
 * @throws Exception 
    */
   public void load(String source) throws Exception {
       BufferedImage img;

       this.source = source;
	   img = ImageIO.read(new File(source));
       setImage(img);        
   }      

   /**
      Reloads this picture, undoing any manipulations.
 * @throws Exception 
    */
   public void reload() throws Exception {
      load(source);
   }
  
   private void setImage(BufferedImage image) {
      this.image = image;
      label.setIcon(new ImageIcon(image));
      label.setSize(image.getWidth(), image.getHeight());
   }
}
