package pt.unl.fct.di.apdc.firstwebapp.util;

public class RegisterData {

    public String userID;
    public String email;
    public String userName;
    public Integer phoneNumber;
    public String password;

    public RegisterData() {

    }

    public RegisterData(String userID, String email, String userName, int phoneNumber, String password) {
        this.userID = userID;
        this.email = email;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }


    public boolean validRegistration() {
        return userID != null && email != null && userName != null && phoneNumber != null && password != null;
    }
}
