package  alphaben.mynote.core.handlers;


import alphaben.mynote.core.Note;
import java.sql.*;  
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mynote.User;




public class Handler 
{

        
   static final String DB_URL   = "jdbc:h2:~/testdb;MODE=MySQL";
   static final String USER     = "sa";
   static final String PASS     = "";
        
//   static final String DB_URL   = "jdbc:mysql://sql11.freesqldatabase.com/sql11687585";
//   static final String USER     = "sql11687585";
//   static final String PASS     = "cjHMM4qWju";
//  
    
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
           
           PreparedStatement  stm = con.prepareStatement("SELECT * FROM user WHERE userName = ?  OR email = ?"); 
        
           stm.setString(1,data.getUserName());
           stm.setString(1,data.getEmail());
           
       
            ResultSet res = stm.executeQuery();

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
           
       } catch (SQLException ex) 
       {
           Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
           Error = ex.getMessage();
                return false;
       }
        
        return false;
        
    }
    
    public  List<Note> loadAllNotes(){
        
        return  List.of();
    }
   
}
