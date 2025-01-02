package aug27;

public class LoginAppMain {
    public static void main(String[] args) {
        PasswordManager passwordManager = new PasswordManager("Regina","regi@89");

        passwordManager.isUserAuthenticated("Regina","Regi@89");
        System.out.println(passwordManager);
    }
}
