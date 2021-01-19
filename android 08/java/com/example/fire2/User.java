package com.example.fire2;

public class User {
    String userName;
    String email;

    //기본생성자 없으면 에러난다........
    public User(){

    }
    //파라메터 있는 생성자 있으면 기본생성자는 자동생성 안되므로......
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
