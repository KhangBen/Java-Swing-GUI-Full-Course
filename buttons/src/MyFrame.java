import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

  MyFrame() {

    JButton button = new JButton();
    button.setBounds(200, 100, 100, 50);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(500,500);

    this.add(button);

    this.setVisible(true);

  }

  @Override
  public void actionPerformed(ActionEvent e) {
    
  }
}
