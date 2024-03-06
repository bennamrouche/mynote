
package mynote.Event;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import mynote.gui.Frame;
import mynote.gui.Views;



public class LabelMouseEvent extends MouseAdapter
{

     int Action  = 1;
    private final int next;
    
    Color orgine = new Color(0xEFF396);
    Color hoverColor = new Color(0x0AFF5D);
    public LabelMouseEvent(int next, int Action) 
    {
       this.next = next;
    }
     public LabelMouseEvent(int next) 
    {
       this.next = next;
    }
 
    @Override
    public void mouseExited(MouseEvent e) 
    {
        JComponent com = (JComponent)e.getSource();
        com.setForeground(orgine);
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        JComponent com = (JComponent)e.getSource();
         com.setForeground(hoverColor);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        super.mouseClicked(e); 
        JComponent com = (JComponent)e.getSource();
          com.setForeground(orgine);
       if(next <= Views.MAX_ID)
       Frame.getInstance().setContentPane(Views.getViewById(next));
        Frame.getInstance().validate();
    }
}
