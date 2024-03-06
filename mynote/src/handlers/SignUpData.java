
package handlers;


public class SignUpData implements DataBaseQuery
{
        String FirstName; 
        String LastName;
        String UserName;
        String Password;
        String Email;
        String Gender;

    public String getFirstName() {
        return FirstName;
    }

    public SignUpData setFirstName(String FirstName) {
        this.FirstName = FirstName;
        return this;


    }

    public String getLastName() {
        return LastName;
              

    }

    public SignUpData setLastName(String LastName) {
        this.LastName = LastName;
        return this;

    }

    public String getUserName() {
        return UserName;
    }

    public SignUpData setUserName(String UserName) {
        this.UserName = UserName;
          return this;
    }

    public String getPassword() {
        return Password;
    }

    public SignUpData setPassword(String Password) {
        this.Password = Password;
                  return this;

    }

    public String getEmail() {
        return Email;
    }

    public SignUpData setEmail(String Email) {
        this.Email = Email;
                  return this;

    }

    public String getGender() {
        return Gender;
    }

    public SignUpData setGender(String Gender) {
        this.Gender = Gender;
        return this;
    }

    
        
    @Override
    public String getQuery()
  {
    String res = "INSERT INTO `user` (userName, firstName, lastName, password, avatarNo, email, gender) VALUES"
            +"('" 
            + UserName 
            +"', '" +
            FirstName 
            +"', '" + 
            LastName + 
            "', ' "+ 
            Password
            +"', 0, '"
            + Email+ "', '"+ Gender +"');";
          return res;
}
    
    
}
