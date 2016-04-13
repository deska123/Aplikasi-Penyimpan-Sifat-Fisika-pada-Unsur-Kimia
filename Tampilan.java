import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
   A frame that shows the growth of an investment with variable interest.
*/
public class Tampilan extends JFrame
{
   private static final int FRAME_WIDTH = 1200;
   private static final int FRAME_HEIGHT = 480;
   
   private static final int AREA_ROWS = 24;
   private static final int AREA_COLUMNS = 32;
     
   private JLabel label;
   private JTextField field;
   private JButton button;
   private JTextArea area;
   private JPanel panel;
   private JPanel panel1;
   private DataUnsur unsur;
   private String data;
   private int rate;
   private PanelImages panelImages;
   private PanelImages panelImages1;
 
   public Tampilan()
   {  
	  panelImages = new PanelImages();
	  panelImages1 = new PanelImages(data);
      unsur = new DataUnsur();
      area = new JTextArea(AREA_ROWS, AREA_COLUMNS);
      area.setEditable(false);
            

      createTextField();
      createButton();
      createPanel();

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
   }
   
public void setData () {
	   data = unsur.getData();
   }
   
   public int getRate() {
	   return rate;
   }

private void createTextField()
   {
      label = new JLabel("Masukkan nomor atom unsur (1-118) : ");

      final int FIELD_WIDTH = 5;
      field = new JTextField(FIELD_WIDTH);
      field.setText("");
   }
   
   private void createButton()
   {
      button = new JButton("Search");
      
      class AddInterestListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            rate = Integer.parseInt( field.getText());
            switch (rate) {
            case 1	:
        		unsur.hidrogen();
        		break;
        	case 2	:
        		unsur.helium();
        		break;
        	case 3	:
        		unsur.lithium();
        		break;
        	case 4	:
        		unsur.berrilium();
        		break;
        	case 5	:
        		unsur.boron();
        		break;
        	case 6	:
        		unsur.karbon();
        		break;
        	case 7	:
        		unsur.nitrogen();
        		break;
        	case 8	:
        		unsur.oksigen();
        		break;
        	case 9	:
        		unsur.fluorin();
        		break;
        	case 10	:
        		unsur.neon();
        		break;
        	case 11	:
        		unsur.natrium();
        		break;
        	case 12	:
        		unsur.magnesium();
        		break;
        	case 13	:
        		unsur.aluminium();
        		break;
        	case 14	:
        		unsur.silikon();
        		break;
        	case 15	:
        		unsur.fosfor();
        		break;
        	case 16	:
        		unsur.belerang();
        		break;
        	case 17	:
        		unsur.klorin();
        		break;
        	case 18	:
        		unsur.argon();
        		break;
        	case 19	:
        		unsur.kalium();
        		break;
        	case 20	:
        		unsur.kalsium();
        		break;
        	case 21 :
        		unsur.scandium();
        		break;
        	case 22 :
        		unsur.titanium();
        		break;
        	case 23 :
        		unsur.vanadium();
        		break;
        	case 24 :
        		unsur.kromium();
        		break;
        	case 25 :
        		unsur.mangan();
        		break;
        	case 26 :
        		unsur.besi();
        		break;
        	case 27 :
        		unsur.cobalt();
        		break;
        	case 28 :
        		unsur.nikel();
        		break;
        	case 29 :
        		unsur.tembaga();
        		break;
        	case 30 :
        		unsur.seng();
        		break;
        	case 31	:
        		unsur.gallium();
        		break;
        	case 32	:
        		unsur.germanium();
        		break;
        	case 33	:
        		unsur.arsenik();
        		break;
        	case 34	:
        		unsur.selenium();
        		break;
        	case 35	:
        		unsur.bromin();
        		break;
        	case 36	:
        		unsur.kripton();
        		break;
        	case 37	:
        		unsur.rubidium();
        		break;
        	case 38	:
        		unsur.stronsium();
        		break;
        	case 39 :
        		unsur.yttrium();
        		break;
        	case 40 :
        		unsur.zirconium();
        		break;
        	case 41 :
        		unsur.niobium();
        		break;
        	case 42 :
        		unsur.molybdenum();
        		break;
        	case 43 :
        		unsur.technetium();
        		break;
        	case 44 :
        		unsur.ruthenium();
        		break;
        	case 45 :
        		unsur.rhodium();
        		break;
        	case 46 :
        		unsur.palladium();
        		break;
        	case 47 :
        		unsur.perak();
        		break;
        	case 48 :
        		unsur.cadmium();
        		break;
        	case 49	:
        		unsur.indium();
        		break;
        	case 50	:
        		unsur.kaleng();
        		break;
        	case 51	:
        		unsur.antimon();
        		break;
        	case 52	:
        		unsur.tellurium();
        		break;
        	case 53	:
        		unsur.iodine();
        		break;
        	case 54	:
        		unsur.xenon();
        		break;
        	case 55	:
        		unsur.cesium();
        		break;
        	case 56	:
        		unsur.barium();
        		break;
        	case 57	:
        		unsur.lanthanum();
        		break;
        	case 58	:
        		unsur.cerium();
        		break;
        	case 59	:
        		unsur.praseodymium();
        		break;
        	case 60	:
        		unsur.neodymium();
        		break;
        	case 61	:
        		unsur.promethium();
        		break;
        	case 62	:
        		unsur.samarium();
        		break;
        	case 63	:
        		unsur.europium();
        		break;
        	case 64	:
        		unsur.gadolinium();
        		break;
        	case 65	:
        		unsur.terbium();
        		break;
        	case 66	:
        		unsur.dysprosium();
        		break;
        	case 67	:
        		unsur.holmium();
        		break;
        	case 68	:
        		unsur.erbium();
        		break;
        	case 69	:
        		unsur.thulium();
        		break;
        	case 70	:
        		unsur.ytterbium ();
        		break;
        	case 71 :
        		unsur.lutetium();
        		break;
        	case 72 :
        		unsur.hafnium();
        		break;
        	case 73 :
        		unsur.tantalum();
        		break;
        	case 74 :
        		unsur.tungsten();
        		break;
        	case 75 :
        		unsur.rhenium();
        		break;
        	case 76 :
        		unsur.osmium();
        		break;
        	case 77 :
        		unsur.iridium();
        		break;
        	case 78 :
        		unsur.platina();
        		break;
        	case 79 :
        		unsur.emas();
        		break;
        	case 80 :
        		unsur.raksa();
        		break;
        	case 81	:
        		unsur.thallium();
        		break;
        	case 82	:
        		unsur.timbal();
        		break;
        	case 83	:
        		unsur.bismut();
        		break;
        	case 84	:
        		unsur.polonium();
        		break;
        	case 85	:
        		unsur.astatin();
        		break;
        	case 86	:
        		unsur.radon();
        		break;
        	case 87	:
        		unsur.fransium();
        		break;
        	case 88	:
        		unsur.radium();
        		break;
        	case 89	:
        		unsur.actinium();
        		break;
        	case 90	:
        		unsur.thorium();
        		break;
        	case 91	:
        		unsur.protactinium();
        		break;
        	case 92	:
        		unsur.uranium();
        		break;
        	case 93	:
        		unsur.neptunium();
        		break;
        	case 94	:
        		unsur.plutonium();
        		break;
        	case 95	:
        		unsur.americium();
        		break;
        	case 96	:
        		unsur.curium();
        		break;
        	case 97	:
        		unsur.berkelium();
        		break;
        	case 98	:
        		unsur.californium();
        		break;
        	case 99	:
        		unsur.einsteinium();
        		break;
        	case 100	:
        		unsur.fermium();
        		break;
        	case 101	:
        		unsur.mendelevium();
        		break;
        	case 102	:
        		unsur.nobelium();
        		break;
           	case 103 :
        		unsur.lawrencium();
        		break;
        	case 104 :
        		unsur.rutherfordium();
        		break;
        	case 105 :
        		unsur.dubnium();
        		break;
        	case 106 :
        		unsur.seaborgium();
        		break;
        	case 107 :
        		unsur.bohrium();
        		break;
        	case 108 :
        		unsur.hassium();
        		break;
        	case 109 :
        		unsur.meitnerium();
        		break;
        	case 110 :
        		unsur.darmstadtium();
        		break;
        	case 111 :
        		unsur.roentgenium();
        		break;
        	case 112 :
        		unsur.copernicium();
        		break;
        	case 113	:
        		unsur.ununtrium();
        		break;
        	case 114	:
        		unsur.fleoporium();
        		break;
        	case 115	:
        		unsur.ununpentium();
        		break;
        	case 116	:
        		unsur.livermorium();
        		break;
        	case 117	:
        		unsur.ununseptium();
        		break;
        	case 118	:
        		unsur.ununoctium();
        		break;
                default:
                	data = "Terima Kasih atas kunjungan anda";
                break;
            }
        	setData();

            area.append(data + "\n");
         }            
      }
      
      ActionListener listener = new AddInterestListener();
      button.addActionListener(listener);
   }
   
   private void createPanel()
   {
      panel = new JPanel();
      panel1 = new JPanel();
      panel1.setLayout(new GridLayout(1,3));
      panel.add(label);
      panel.add(field);
      panel.add(button);      

      JScrollPane scrollPane = new JScrollPane(area);
      panel.add(scrollPane);      
      add(panel);
      panel1.add(panel);
      panel1.add(panelImages);
      panel1.add(panelImages1);


      add(panel1);
   }
 }
