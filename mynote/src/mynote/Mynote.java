package mynote;

import javax.swing.JFrame;
import mynote.gui.Home;
import mynote.gui.notePanel;


public class Mynote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
   //  frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
       frame.setContentPane(new Home());
      // frame.add(new notePanel());
           frame.validate();
          frame.setVisible(true);
          frame.pack();
    }
    
}
