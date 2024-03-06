
package handlers;

import java.sql.*;  
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mynote.User;




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
          
        stm.execute(data.getQuery());  
        System.out.print(data.getQuery());
       } catch (Exception ex) {
           Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
       }
       return true;
     }
   
    public boolean Login(String userName, String Passowrd)
    {
        try {
            
                String Query = "SELECT * FROM user WHERE userName = '" + userName +"' and `password` = '" + Passowrd +"'" ;
                Statement stm = con.createStatement();
                ResultSet res;
                res = stm.executeQuery(Query);
               if(!res.next())
                    throw new Exception("1 Wrong UserName or Password");
               
                User user = new User();
                user.setAvatarId(res.getInt(User.AVTATAR_ID));
                user.setEmail(res.getString(User.EMAIL));
                user.setFirstName(res.getString(User.FIRST_NAME));
                user.setLastName(res.getString(User.LAST_NAME));
                user.setUserName(res.getString(User.USER_NAME));
                user.setPassword(res.getString(User.PASSWORD));
                user.setGender(res.getString(User.GENDER));
                
//                    if(!Passowrd.equals(user.getPassword())) 
//                    {
//                       
//                        System.err.println("[" + Passowrd+"]");
//                        System.err.print("[" + user.getPassword() +"]");
//                         throw new Exception("2 Wrong UserName or Password");
//                    }
                    Global.currentUser = user;
       } catch (Exception ex) {
           Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, ex.getMessage());
           JOptionPane.showMessageDialog(null, ex.getMessage());
           return false;
       }
        
      return true;
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
