import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) throws Exception {

        ImageIcon image = new ImageIcon("nag_pfp.png");
        Border border = BorderFactory.createLineBorder(Color.black, 3);
        
        JLabel label = new JLabel(); // create a label
        label.setText("Testing"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
        label.setForeground(Color.BLACK); // set font color of text
        // label.setFont(new Font("MV Boli", Font.PLAIN,20));
        // label.setIconTextGap(100); // set gap of text to image
        label.setBackground(Color.LIGHT_GRAY); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        // label.setBounds(0,0,250, 250); 


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        // frame.setLayout(null);
        frame.add(label);
        // frame.pack();


        frame.setVisible(true);
    }
}
