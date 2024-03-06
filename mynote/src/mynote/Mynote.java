package mynote;

import handlers.Handler;
import javax.swing.JFrame;
import mynote.gui.Frame;
import mynote.gui.Home;
import mynote.gui.Views;



public class Mynote {

//    /**
//     * @param args the command line arguments
//     */
   public static void main(String[] args) {
        Frame frame =  Frame.getInstance();
         System.out.print("out Print");
   //  frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
       frame.SetView(Views.SIGN_UP);
      // frame.add(new notePanel());
           frame.validate();
          frame.setVisible(true);
          frame.pack();
          System.out.print("out Print");

        System.err.println(Views.FORGET_PASSWORD);   
       
    }
    
}
