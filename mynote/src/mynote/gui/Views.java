
package mynote.gui;

import javax.swing.JComponent;


public class Views 
{
   
      public static int HOME            = 0;
      public static int NEW_NOTE        = 1;
      public static int FORGET_PASSWORD = 2;
      public static int LOGIN           = 3;
      public static int  SIGN_UP        = 4;
      public static int PROFILE         = 5;
      public static int VIEW_NOTE       = 6;
      public static int MAX_ID          = 6; 
      
    private static final JComponent[] views = new JComponent[]{
                                            new Home(),
                                            new NewNote(),
                                            new ForgetPassword(),
                                            new login(),
                                            new signUp(), 
                                            new  Profile(),
                                            new ViewNote()};
     public static JComponent getViewById(int id)
     {
         if(id <= MAX_ID)
             return views[id];
         else 
             return null;
         
     } 
     
    
}
