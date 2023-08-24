package login_register.entities;

public class User {
    private String userName;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }


    public User(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return
                "email: " + email ;
    }
}
