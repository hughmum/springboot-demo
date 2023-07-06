package com.mu.boot.simplifycode.model;
import lombok.Data;

@Data
public class User  {

    public User(){ }

    public User(String username,String password,Integer age){
        this.setUsername(username);
        this.setPassword(password);
        this.setAge(age);
        System.out.println(this);
    }

    private String username;
    private String password;
    private Integer age;

    public static void main(String[] args) {
        new User("Mr.yuan","123456",25);
    }
}
