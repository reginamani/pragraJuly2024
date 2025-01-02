package aug27;

public class PasswordManager {
    private String userName;
    private String password;

    public PasswordManager(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

        public void setPassword(String password) {
        this.password = password;
    }

    public void isUserAuthenticated(String userName,String password){

        if(this.userName.equalsIgnoreCase(userName) && this.password.equals(password) ){
            System.out.println("User Authenticated");
            System.out.println("Welcome "+userName);
        }
        else {
            System.out.println("Invalid Credentials");
        }

    }

    @Override
    public String toString() {
        return "PasswordManager{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
