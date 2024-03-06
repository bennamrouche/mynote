
package handlers;

import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class Handler 
{

    
   static final String DB_URL = "jdbc:mysql://sql11.freesqldatabase.com/sql11687585";
   static final String USER = "sql11687585";
   static final String PASS = "cjHMM4qWju";
  
    
    private static Handler _handler;
    Connection con;
    private String  Error = "not Connected to database";
    private boolean isConnected = false;
    
    
    
    
    private Handler()
   {
      try{

          con = DriverManager.getConnection(DB_URL, USER, PASS);
          isConnected = true;
          
      } catch (SQLException e)
      {
          System.err.println("Handler()" + e.getMessage());
          Error = e.getMessage();
          
      }
    }
    
   public static Handler getHandler()
   {
       if(_handler == null)
         _handler = new Handler();
     return _handler;
           
   }
   
   public  boolean isConnected()
   {
       return isConnected;
   }
   
    public boolean SingUp(SignUpData data)
    {
       try {
           Statement stm = con.createStatement();
        
            ResultSet res = stm.executeQuery("SELECT * FROM user WHERE userName = '" + data.UserName + "' OR email = '" + data.Email + "'");

           if(res.next())
                 throw new Exception("userName or Email not available");
          
          return  stm.execute(data.getQuery());  
       } catch (Exception ex) {
           Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
       }
      
     }
    
    public boolean  ExcuteQuery()
    {
       try {
           
           Statement stm = con.createStatement();
//           stm.ex
           
       } catch (SQLException ex) 
       {
           Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
           Error = ex.getMessage();
                return false;
       }
        
        return false;
        
    }
   
}
