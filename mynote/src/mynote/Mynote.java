/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mynote;

import mynote.gui.ForgetPassword;
import mynote.gui.Frame;
import mynote.gui.login;
import mynote.gui.signUp;

/**
 *
 * @author ebennamr
 */
public class Mynote {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new Frame();
      
        frame.setContentPane(new ForgetPassword());
        frame.validate();
          frame.setVisible(true);
    }
    
}
