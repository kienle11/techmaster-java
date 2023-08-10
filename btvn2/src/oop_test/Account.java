package oop_test;

public class Account {
    private String userName ;
    private String password;
    private String email /*="^[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$"*/;

    public Account(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
