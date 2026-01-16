
package mynote;

public class User 
{
    
    
    public static final String  USER_NAME   =  "userName";
    public static final String  FIRST_NAME  =  "firstName" ;
    public static final String  LAST_NAME   =  "lastName";
    public static final String  EMAIL       =  "email";
    public static final String  AVTATAR_ID  =  "avatarNo";
    public static final String  GENDER      =  "gender";
    public static final String  PASSWORD    =  "password";
    
    private     String UserName;
    private     String FirstName;
    private     String LastName;
    private     String Email;
    private     int    avatarId;
    private     String Password;
    private     String Gender;

    public String getPassword() {
        return Password;
    }

    public User setPassword(String Password) {
        this.Password = Password;
        return this;
    }
    

    public String getGender() {
        return Gender;
    }

    public User setGender(String Gender) {
        this.Gender = Gender;
        return this;
    }
    

   
        


    public String getUserName() {
        return UserName;
    }

    public User setUserName(String UserName) {
        this.UserName = UserName;
        return this;
    }

    public String getFirstName() {
        return FirstName;
    }

    public User setFirstName(String FirstName) {
        this.FirstName = FirstName;
        return this;
    }

    public String getLastName() {
        return LastName;
    }

    public User setLastName(String LastName) {
        this.LastName = LastName;
            return this;
    }

    public String getEmail() {
        return Email;
    }

    public User  setEmail(String Email) {
        
        this.Email = Email;
        
        return this;
    }

    public int getAvatarId() {
        return avatarId;
    }

    public User setAvatarId(int avatarId) {
        this.avatarId = avatarId;
              return this;
    }
    
    
    
}
