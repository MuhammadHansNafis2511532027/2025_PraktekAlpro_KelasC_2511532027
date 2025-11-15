package nilai_pekan_7_2511532027;

public class Akun { 
    private String username, password, email;
    private int pin;
    
    public void setName (String username) {
        this.username = username;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    public void setEmail (String email) {
        this.email = email ;
    }
    
    public void setPin (int pin ) {
        this.pin = pin;
    }
    
    public String getName() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getPin() {
        return pin;
    }
    
    public boolean isEmailValid(String email) {
        return email != null
                && !email.trim().isEmpty()
                && email.contains("@")
                && email.contains(".");
        
    }
    
    public boolean isPasswordValid(String password) {
        return password != null
                && !password.trim().isEmpty()
                && password.length() >= 8;
    }
}